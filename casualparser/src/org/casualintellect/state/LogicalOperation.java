package org.casualintellect.state;

import org.antlr.v4.runtime.Token;

public class LogicalOperation extends TerminalSymbol implements
		IOperationMember {
	@Override
	public String toString() {
		return "LogicalOperation [" + getOperationType() + "]";
	}

	public LogicalOperation(Token token) {
		super(token);
		operationType = OperationType.valueOf(token.getText());

		if (this.operationType == null) {
			throw new RuntimeException("Unsupport operation type"
					+ token.toString());
		}
	}

	private final OperationType operationType;

	public OperationType getOperationType() {
		return operationType;
	}

	@Override
	public MemberType getType() {
		return MemberType.LOGICAL_OPERATION;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return operationType.name();
	}

}
