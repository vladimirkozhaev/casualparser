package org.casualintellect.state;

import java.util.List;

public class OperationsList {
	public List<Method> getMethodsList() {
		return methodsList;
	}

	public StateProcessType getStateProcessType() {
		return stateProcessType;
	}

	public OperationsList(List<Method> methodsList,
			StateProcessType stateProcessType) {
		super();
		this.methodsList = methodsList;
		this.stateProcessType = stateProcessType;
	}

	public void setMethodsList(List<Method> methodsList) {
		this.methodsList = methodsList;
	}

	public OperationsList(StateProcessType stateProcessType) {
		this.stateProcessType = stateProcessType;
	}

	private List<Method> methodsList = null;
	private final StateProcessType stateProcessType;
}
