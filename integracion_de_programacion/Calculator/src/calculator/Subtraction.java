package calculator;

public class Subtraction extends Operation{
	
	double subtraction;
    
	public Subtraction(int number1, int number2) {
		super(number1, number2, '-');
		this.subtraction = number1 - number2;
		this.setResult(this.subtraction);
	}
}
