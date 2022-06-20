package calculator;

public class Addition extends Operation{
	
	double addittion;
    
	public Addition(int number1, int number2) {
		super(number1, number2, '+');
		this.addittion = number1 + number2;
		this.setResult(this.addittion);
	}
}
