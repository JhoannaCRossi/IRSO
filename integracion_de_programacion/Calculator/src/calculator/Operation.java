package calculator;

public class Operation {
	
	private int number1;
	private int number2;
	private char operation;
	private double result;
	
	public Operation(int number1, int number2, char operation) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.operation = operation;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public void showResult() {
		System.out.println("This is result of "+this.number1+" "+this.operation+" "+this.number2+" = "+result);
	};
}
