package org.casualintellect.state;

public enum OperationType {
	AND(2), OR(2), NOT(1), HOR(2);

	int dimention;

	OperationType(int dimention) {
		this.dimention = dimention;
	};
}
