package org.casualintellect.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.casualintellect.grammar.CasualintellectLexer;
import org.casualintellect.grammar.CasualintellectParser;

public class MainTest {
	public static void main(String[] args) {
		File file = new File("./res/testintellect.cas");
		// create a CharStream that reads from standard input

		ANTLRInputStream input;
		try {
			InputStream fis = new FileInputStream(file);
			input = new ANTLRInputStream(fis);
			// create a lexer that feeds off of input CharStream
			CasualintellectLexer lexer = new CasualintellectLexer(input);

			// create a buffer of tokens pulled from the lexer

			CommonTokenStream tokens = new CommonTokenStream(lexer);

			CasualintellectParser parser = new CasualintellectParser(tokens);
			// parser.addParseListener(new LanguageToStates());
			// parser.addErrorListener(new UnderlineListener()); // add ours
			ParseTree prog = parser.states();
			// System.out.println(">>" + parser.prog()); // parse as usual

			// System.out.println("states:" + parser.states());

			ParseTreeWalker walker = new ParseTreeWalker();
			// Walk the tree created during the parse, trigger callbacks
			LanguageToStates listener = new LanguageToStates();
			walker.walk(listener, prog);
			System.out.println(listener);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
