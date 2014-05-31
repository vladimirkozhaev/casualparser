package org.casualintellect.state;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Observable;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.casualintellect.grammar.CasualintellectLexer;
import org.casualintellect.grammar.CasualintellectParser;
import org.casualintellect.parser.LanguageToStates;

public class StateMachine extends Observable {

	Map<String, ErrorMessage> errors = new HashMap<String, ErrorMessage>();
	private List<State> states = new LinkedList<State>();
	private InputStream statesInputStream;
	private ErrorListener errorListener = new ErrorListener();

	public List<State> getStates() {
		return states;
	}

	void setStates(List<State> states) {
		this.states = states;
	}

	public Collection<ErrorMessage> getErrors() {
		Collection<ErrorMessage> values = errors.values();
		List<ErrorMessage> errorMessages = errorListener.getErrorMessages();
		errorMessages.addAll(values);
		return errorMessages;
	}

	void checkStates() {

		if (states.size() == 0) {
			errors.put("simple_state", new ErrorMessage(
					"Must be at least one state in the state machine",
					"simple_state"));
		}

		for (int i = 0; i < states.size() - 1; i++) {
			for (int j = i; j < states.size() - 1; j++) {
				State statej = states.get(j);
				String namej = statej.getName();
				State statej1 = states.get(j + 1);
				String namej1 = statej1.getName();
				if (namej.equals(namej1)) {
					ErrorMessage languageErrorMessage = errors.get(namej);
					if (languageErrorMessage == null) {
						languageErrorMessage = new ErrorMessage(
								"Name of the state must be unical", namej);
						errors.put(namej, languageErrorMessage);
					}

					languageErrorMessage.getErrorIntervals().add(
							new ErrorInterval(
									statej.getToken().getStartIndex(), statej
											.getToken().getStopIndex()));

					languageErrorMessage.getErrorIntervals().add(
							new ErrorInterval(statej1.getToken()
									.getStartIndex(), statej1.getToken()
									.getStopIndex()));
				}
			}
		}
	}

	public void setInputStream(InputStream statesInputStream) {
		this.statesInputStream = statesInputStream;

	}

	public void processState() throws IOException {
		ANTLRInputStream input = new ANTLRInputStream(statesInputStream);
		CasualintellectLexer lexer = new CasualintellectLexer(input);

		// create a buffer of tokens pulled from the lexer

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		CasualintellectParser parser = new CasualintellectParser(tokens);
		parser.removeErrorListeners();
		errorListener = new ErrorListener();
		parser.addErrorListener(errorListener);
		// parser.addParseListener(new LanguageToStates());
		// parser.addErrorListener(new UnderlineListener()); // add ours
		ParseTree prog = parser.states();

		// System.out.println(">>" + parser.prog()); // parse as usual

		// System.out.println("states:" + parser.states());

		ParseTreeWalker walker = new ParseTreeWalker();
		// Walk the tree created during the parse, trigger callbacks
		LanguageToStates listener = new LanguageToStates();
		walker.walk(listener, prog);
		this.states = listener.getStates();

	}
}
