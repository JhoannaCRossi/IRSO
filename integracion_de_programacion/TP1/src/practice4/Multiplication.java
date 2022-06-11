package practice4;

public class Multiplication extends Operation{
	
	double multiplication;
    
	public Multiplication(int number1, int number2) {
		super(number1, number2, '*');
		this.multiplication = number1 * number2;
		this.setResult(this.multiplication);
	}

}
