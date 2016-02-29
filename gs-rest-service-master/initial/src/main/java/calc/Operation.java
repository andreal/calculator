package calc;

public enum Operation {
	ADD(1),
	SUBTRACT(2),
	MULTIPLY(3),
	DIVIDE(4);
	
	private int code;
	
	Operation(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
 }