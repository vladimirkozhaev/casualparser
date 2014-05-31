package org.casualintellect.state;

import java.util.HashSet;
import java.util.Set;

public class ErrorMessage {

	private String errorMessage;

	private final String errorText;

	private final Set<ErrorInterval> errorIntervals = new HashSet<ErrorInterval>();

	public Set<ErrorInterval> getErrorIntervals() {
		return errorIntervals;
	}

	public String getErrorText() {
		return errorText;
	}

	public ErrorMessage(String errorMessage, String errorText) {
		super();

		this.errorMessage = errorMessage;
		this.errorText = errorText;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
