package calculator;

public class Division extends Operation{
	
	double division;
    
	public Division(int number1, int number2) {
		super(number1, number2, '/');
		this.division = number1 / number2;
		this.setResult(this.division);
	}
}
