package org.casualintellect.state;

import org.antlr.v4.runtime.Token;

public class Method extends TerminalSymbol implements IOperationMember {

	public Method(Token symbol) {
		super(symbol);
	}

	@Override
	public MemberType getType() {
		// TODO Auto-generated method stub
		return MemberType.FUNCTION;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return token.getText();
	}

	@Override
	public String toString() {
		return "metod name:" + getName() + ", start:" + token.getStartIndex()
				+ ", stop:" + token.getStopIndex();
	}
}
