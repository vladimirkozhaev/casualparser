package org.casualintellect.state;

public class ErrorInterval {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + end;
		result = prime * result + start;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ErrorInterval other = (ErrorInterval) obj;
		if (end != other.end)
			return false;
		if (start != other.start)
			return false;
		return true;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

	public ErrorInterval(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	private final int start;
	private final int end;

}
