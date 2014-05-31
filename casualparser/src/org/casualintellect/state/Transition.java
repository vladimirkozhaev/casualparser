package org.casualintellect.state;

import java.util.List;

import org.antlr.v4.runtime.Token;

public class Transition {
	Token token;

	public Transition(Token token) {
		super();
		this.token = token;
	}

	public String getStateName() {
		return token.getText();
	}

	public List<IOperationMember> getCondition() {
		return condition;
	}

	public void setCondition(List<IOperationMember> condition) {
		this.condition = condition;
	}

	public List<Method> getProcessBeforeTransitions() {
		return processBeforeTransitions;
	}

	public void setProcessBeforeTransitions(
			List<Method> processBeforeTransitions) {
		this.processBeforeTransitions = processBeforeTransitions;
	}

	List<IOperationMember> condition;
	private List<Method> processBeforeTransitions;

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Transition"
				+ " stateName="
				+ getStateName()
				+ ", condition="
				+ (condition != null ? condition.subList(0,
						Math.min(condition.size(), maxLen)) : null)
				+ ", processBeforeTransitions="
				+ (processBeforeTransitions != null ? processBeforeTransitions
						.subList(0, Math.min(processBeforeTransitions.size(),
								maxLen)) : null)
				+ ", getStateName()="
				+ getStateName()
				+ ", getCondition()="
				+ (getCondition() != null ? getCondition().subList(0,
						Math.min(getCondition().size(), maxLen)) : null)
				+ ", getProcessBeforeTransitions()="
				+ (getProcessBeforeTransitions() != null ? getProcessBeforeTransitions()
						.subList(
								0,
								Math.min(getProcessBeforeTransitions().size(),
										maxLen)) : null) + "]";
	}

}
