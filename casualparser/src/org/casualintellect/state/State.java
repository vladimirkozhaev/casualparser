package org.casualintellect.state;

import java.util.List;

import org.antlr.v4.runtime.Token;

public class State extends TerminalSymbol {
	public State(Token token) {
		super(token);

	}

	private List<Method> processBefore;
	private List<Method> processAfter;
	private List<Method> inProcess;
	private List<Transition> transitions;

	public List<Transition> getTransitions() {
		return transitions;
	}

	public void setTransitions(List<Transition> transitions) {
		this.transitions = transitions;
	}

	public List<Method> getProcessBefore() {
		return processBefore;
	}

	public void setProcessBefore(List<Method> processBefore) {
		this.processBefore = processBefore;
	}

	public List<Method> getProcessAfter() {
		return processAfter;
	}

	public void setProcessAfter(List<Method> processAfter) {
		this.processAfter = processAfter;
	}

	public List<Method> getInProcess() {
		return inProcess;
	}

	public void setInProcess(List<Method> inProcess) {
		this.inProcess = inProcess;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "State [ name="
				+ getName()
				+ " processBefore="
				+ (processBefore != null ? processBefore.subList(0,
						Math.min(processBefore.size(), maxLen)) : null)
				+ ", processAfter="
				+ (processAfter != null ? processAfter.subList(0,
						Math.min(processAfter.size(), maxLen)) : null)
				+ ", inProcess="
				+ (inProcess != null ? inProcess.subList(0,
						Math.min(inProcess.size(), maxLen)) : null)
				+ ", transitions="
				+ (transitions != null ? transitions.subList(0,
						Math.min(transitions.size(), maxLen)) : null) + "]";
	}

	public String getName() {

		return token.getText();
	}

}
