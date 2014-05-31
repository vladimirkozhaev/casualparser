package org.casualintellect.state;

import org.antlr.v4.runtime.Token;

public abstract class TerminalSymbol {
	protected Token token;

	public TerminalSymbol(Token token) {
		this.token = token;
	}

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

}
