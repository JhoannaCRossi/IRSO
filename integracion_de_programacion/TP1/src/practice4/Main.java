package practice4;

import java.util.Scanner;
/*4.- Realizar un programa que seleccionar en pantalla poder realizar cuatro 
 * cálculos matemáticos (suma, resta, multiplicación y división); pedir que 
 * seleccione el tipo de cálculo que se desee realizar (sólo uno); Luego, 
 * solicitar que sean ingresadas las variables correspondientes en cada caso; 
 * Y, por último, imprimir el resultado en pantalla, indicando qué cálculo se 
 * realizo, aplicando en la medida que se pueda, aplicar los conceptos de 
 * Encapsulamiento, Herencia y Polimorfismo.
 */
public class Main {
	public static void main(String[] args) {
		// instance scanner
		Scanner sc = new Scanner(System.in);

		String inputOperation;
		String inputNumbers = "", inputTryAgain = "";
		int array[] = new int[2];
		boolean tryAgain = true;
		
		do {
			do {
				System.out.println("Please, give me your operation!\n" + "+ = Addition \n" + "- = Subtraction \n"
						+ "* = Multiplication \n" + "/ = Division \n" + " can be the symbol or the word.");
				inputOperation = sc.nextLine();
			} while (!isAOperation(inputOperation)); // check number
		
			for (int i = 0; i < 2; i++) {
				do {
					System.out.println("Please, give me your " + (i + 1) + " number!");
					inputNumbers = sc.nextLine();
				} while (!isANumber(inputNumbers));
				array[i] = Integer.parseInt(inputNumbers);
			}
			
			if(inputOperation.equalsIgnoreCase("Addition") || inputOperation.charAt(0) == ('+')) {
				Addition adittion = new Addition(array[0], array[1]);
				adittion.showResult();
			}else if(inputOperation.equalsIgnoreCase("Subtraction") || inputOperation.charAt(0) == ('-')) {
				Subtraction subtraction = new Subtraction(array[0], array[1]);
				subtraction.showResult();
			}else if(inputOperation.equalsIgnoreCase("Multiplication") || inputOperation.charAt(0) == ('*')) {
					Multiplication multiplication = new Multiplication(array[0], array[1]);
					multiplication.showResult();					
			}else if(inputOperation.equalsIgnoreCase("Division") || inputOperation.charAt(0) == ('/')) {
				try {
					Division division = new Division(array[0], array[1]);
					division.showResult();				
				}catch(ArithmeticException e) {
					System.out.println("Exception occurred, ArithmeticException: / by zero");
				};
				
				
			}
			System.out.println("Try again? Y or N");
			inputTryAgain = sc.nextLine();
			tryAgain = isTryAgain(inputTryAgain);
			
			
		}while(tryAgain);
		System.out.println("FINISH, THANKU");
	}

	public static boolean isAOperation(String text) {
		try {
			if (text.equalsIgnoreCase("Addition") || text.equalsIgnoreCase("Subtraction")
					|| text.equalsIgnoreCase("Multiplication") || text.equalsIgnoreCase("Division")
					|| text.charAt(0) == ('+') || text.charAt(0) == ('-') || text.charAt(0) == ('/')
					|| text.charAt(0) == ('*')) {
				return true;
			} else {
				return false;
			}
		} catch (NumberFormatException ex) {
			return false;
		}
	}

	public static boolean isANumber(String text) {
		int number;
		try {
			number = Integer.parseInt(text);
			if (number >= 0) {
				return true;
			} else {
				return false;
			}
		} catch (NumberFormatException ex) {
			return false;
		}
	}
	
	public static boolean isTryAgain(String text) {
		char letter;
		try {
			letter = text.charAt(0);
			if (letter == ('Y') || letter == ('y') ) {
				return true;
			} else {
				return false;
			}
		} catch (NumberFormatException ex) {
			return false;
		}
	}
}
