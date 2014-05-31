package org.casualintellect.parser;

import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.casualintellect.grammar.CasualintellectBaseListener;
import org.casualintellect.grammar.CasualintellectParser.Bool_bin_operationContext;
import org.casualintellect.grammar.CasualintellectParser.Bool_exprContext;
import org.casualintellect.grammar.CasualintellectParser.Bool_un_operationContext;
import org.casualintellect.grammar.CasualintellectParser.Left_braceContext;
import org.casualintellect.grammar.CasualintellectParser.List_of_idContext;
import org.casualintellect.grammar.CasualintellectParser.Right_braceContext;
import org.casualintellect.grammar.CasualintellectParser.StateContext;
import org.casualintellect.grammar.CasualintellectParser.StatesContext;
import org.casualintellect.grammar.CasualintellectParser.States_afterContext;
import org.casualintellect.grammar.CasualintellectParser.States_beforeContext;
import org.casualintellect.grammar.CasualintellectParser.States_in_processContext;
import org.casualintellect.grammar.CasualintellectParser.TransitionContext;
import org.casualintellect.grammar.CasualintellectParser.TransitionsContext;
import org.casualintellect.state.Brace;
import org.casualintellect.state.IOperationMember;
import org.casualintellect.state.LogicalOperation;
import org.casualintellect.state.Method;
import org.casualintellect.state.OperationsList;
import org.casualintellect.state.State;
import org.casualintellect.state.StateProcessType;
import org.casualintellect.state.Transition;

public class LanguageToStates extends CasualintellectBaseListener {

	List<Method> methodsList = new LinkedList<Method>();
	private OperationsList processAfter;
	private OperationsList processBefore;
	private OperationsList inProcess;
	private State state;
	private List<State> states;
	private Transition transition;
	private List<Transition> transitions;
	private List<IOperationMember> logicalOperationList;

	public List<State> getStates() {
		return states;
	}

	@Override
	public void enterList_of_id(List_of_idContext ctx) {

		for (int i = 0; i < ctx.getChildCount(); i++) {
			ParseTree child = ctx.getChild(i);
			TerminalNode terminal = (TerminalNode) child;
			Token symbol = terminal.getSymbol();
			Method method = new Method(symbol);
			methodsList.add(method);
		}

	}

	@Override
	public void exitList_of_id(List_of_idContext ctx) {

	}

	@Override
	public void enterStates_after(States_afterContext ctx) {
		processAfter = new OperationsList(StateProcessType.AFTER);
	}

	@Override
	public void exitStates_after(States_afterContext ctx) {
		initOperationsList(processAfter);
	}

	private void initOperationsList(OperationsList operationsList) {
		operationsList.setMethodsList(methodsList);
		methodsList = new LinkedList<Method>();
	}

	@Override
	public void enterStates_before(States_beforeContext ctx) {
		processBefore = new OperationsList(StateProcessType.BEFORE);
	}

	@Override
	public void exitStates_before(States_beforeContext ctx) {
		initOperationsList(processBefore);
	}

	@Override
	public void enterStates_in_process(States_in_processContext ctx) {
		inProcess = new OperationsList(StateProcessType.IN_PROCESS);
	}

	@Override
	public void exitStates_in_process(States_in_processContext ctx) {
		initOperationsList(inProcess);
	}

	@Override
	public void enterState(StateContext ctx) {

		ParseTree child = ctx.getChild(2);
		TerminalNode terminal = (TerminalNode) child;
		state = new State(terminal.getSymbol());
	}

	@Override
	public void exitState(StateContext ctx) {

		state.setProcessAfter(processAfter.getMethodsList());
		state.setInProcess(inProcess.getMethodsList());
		state.setProcessBefore(processBefore.getMethodsList());
		states.add(state);
	}

	@Override
	public void enterStates(StatesContext ctx) {
		states = new LinkedList<State>();
	}

	@Override
	public void enterTransition(TransitionContext ctx) {
		ParseTree child = ctx.getChild(4);
		TerminalNode terminal = (TerminalNode) child;
		transition = new Transition(terminal.getSymbol());
		methodsList = new LinkedList<Method>();
		logicalOperationList = new LinkedList<IOperationMember>();
	}

	@Override
	public void exitTransition(TransitionContext ctx) {
		transition.setProcessBeforeTransitions(methodsList);
		transition.setCondition(logicalOperationList);
		transitions.add(transition);

	}

	@Override
	public void enterTransitions(TransitionsContext ctx) {
		transitions = new LinkedList<Transition>();
	}

	@Override
	public void exitTransitions(TransitionsContext ctx) {
		state.setTransitions(transitions);
		transitions = new LinkedList<Transition>();
	}

	@Override
	public void enterBool_expr(Bool_exprContext ctx) {
		for (int i = 0; i < ctx.getChildCount(); i++) {
			ParseTree child = ctx.getChild(i);
			if (child instanceof Bool_bin_operationContext
					|| child instanceof Bool_un_operationContext) {
				Bool_bin_operationContext bool = (Bool_bin_operationContext) child;
				TerminalNode node = (TerminalNode) bool.getChild(0);
				LogicalOperation logicalOperation = new LogicalOperation(
						node.getSymbol());
				logicalOperationList.add(logicalOperation);

			} else if (child instanceof Bool_exprContext) {
				enterBool_expr((Bool_exprContext) child);

			} else if (child instanceof Left_braceContext
					|| child instanceof Right_braceContext) {

				TerminalNode terminal = (TerminalNode) child.getChild(0);
				Brace brace = new Brace(terminal.getSymbol());
				logicalOperationList.add(brace);

			} else {
				TerminalNode terminal = (TerminalNode) child;
				Method method = new Method(terminal.getSymbol());
				logicalOperationList.add(method);
			}

		}
	}

	@Override
	public String toString() {
		StringBuffer strBuff = new StringBuffer();
		for (State state : states) {
			strBuff.append(state);
			strBuff.append("\n");
		}
		return strBuff.toString();
	}

}
