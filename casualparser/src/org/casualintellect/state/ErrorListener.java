package org.casualintellect.state;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class ErrorListener extends BaseErrorListener {
	List<ErrorMessage> errorMessages = new LinkedList<ErrorMessage>();

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer,
			Object offendingSymbol, int line, int charPositionInLine,
			String msg, org.antlr.v4.runtime.RecognitionException exeption) {

		Parser parser = (Parser) recognizer;

		List<String> stack = parser.getRuleInvocationStack();

		Collections.reverse(stack);
		Token currentToken = parser.getCurrentToken();
		int startIndex = currentToken.getStartIndex();
		int stopIndex = currentToken.getStopIndex();
		CommonToken commonToken = (CommonToken) offendingSymbol;
		ErrorMessage errorMessage = new ErrorMessage(msg,
				offendingSymbol == null ? null : commonToken.getText());
		errorMessage.getErrorIntervals().add(
				new ErrorInterval(startIndex, stopIndex));
		errorMessages.add(errorMessage);

	}

	List<ErrorMessage> getErrorMessages() {
		return errorMessages;
	}

}
