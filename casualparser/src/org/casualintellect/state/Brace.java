package org.casualintellect.state;

import org.antlr.v4.runtime.Token;

public class Brace extends TerminalSymbol implements IOperationMember {
	private BraceType braceType;

	public Brace(Token token) {
		super(token);
		if (token.getText().equals("(")) {
			braceType = BraceType.LEFT;
		} else {
			braceType = BraceType.RIGTH;
		}
	}

	public BraceType getBraceType() {
		return braceType;
	}

	@Override
	public MemberType getType() {

		return MemberType.BRACE;
	}

	@Override
	public String getName() {
		return token.getText();
	}

	@Override
	public String toString() {
		if (braceType == BraceType.LEFT) {
			return "(";
		} else {
			return ")";
		}
	}

}
