package org.casualintellect.state;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import junit.framework.TestCase;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;

public class StatesTest extends TestCase {
	public void testStatesWithOneName() {
		StateMachine stateMachine = new StateMachine();
		stateMachine.getStates().add(new State(new Token() {

			@Override
			public String getText() {
				// TODO Auto-generated method stub
				return "test";
			}

			@Override
			public int getType() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getLine() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getCharPositionInLine() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getChannel() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getTokenIndex() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getStartIndex() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getStopIndex() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public TokenSource getTokenSource() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public CharStream getInputStream() {
				// TODO Auto-generated method stub
				return null;
			}
		}));

		stateMachine.getStates().add(new State(new Token() {

			@Override
			public String getText() {
				// TODO Auto-generated method stub
				return "test";
			}

			@Override
			public int getType() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getLine() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getCharPositionInLine() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getChannel() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getTokenIndex() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getStartIndex() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getStopIndex() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public TokenSource getTokenSource() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public CharStream getInputStream() {
				// TODO Auto-generated method stub
				return null;
			}
		}));

		stateMachine.checkStates();

		assertEquals(stateMachine.getErrors().size(), 1);

	}

	public void testStateMachineWithoutBugs() throws IOException {
		StateMachine stateMachine = new StateMachine();
		File file = new File("./res/testintellect.cas");
		InputStream fis = new FileInputStream(file);
		stateMachine.setInputStream(fis);
		stateMachine.processState();
		assertEquals(stateMachine.getStates().size(), 2);

	}

	public void testStateMachineWithBugs() throws IOException {
		StateMachine stateMachine = new StateMachine();
		File file = new File("./res/intellect_error1.cas");
		InputStream fis = new FileInputStream(file);
		stateMachine.setInputStream(fis);
		stateMachine.processState();
		assertEquals(stateMachine.getStates().size(), 2);
		assertEquals(stateMachine.getErrors().size(), 2);

	}

}
