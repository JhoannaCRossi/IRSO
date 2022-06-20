package calculator;

import java.util.Scanner;
/*desarrollar un programa que cumpla las
 * funciones de una calculadora. O sea, al iniciar deberán preguntar qué función
 * desean realizar (suma, resta, multiplicación, división o salir del programa); 
 * Luego deberán solicitar los valores a calcular; Y por último, devolver el 
 * resultado del cálculo aritmético. Asimismo, cada vez que se termine el 
 * cálculo deberán ir nuevamente a la primera opción de selección, cuestión que 
 * sea posible seguir realizando cálculos, o bien salir del programa.
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
						+ "* = Multiplication \n" + "/ = Division \n");
				inputOperation = sc.nextLine();
			} while (!isAOperation(inputOperation)); // check number

			for (int i = 0; i < 2; i++) {
				do {
					System.out.println("Please, give me your " + (i + 1) + " number!");
					inputNumbers = sc.nextLine();
				} while (!isANumber(inputNumbers));
				array[i] = Integer.parseInt(inputNumbers);
			}

			if (inputOperation.charAt(0) == ('+')) {
				Addition adittion = new Addition(array[0], array[1]);
				adittion.showResult();
			} else if (inputOperation.charAt(0) == ('-')) {
				Subtraction subtraction = new Subtraction(array[0], array[1]);
				subtraction.showResult();
			} else if (inputOperation.charAt(0) == ('*')) {
				Multiplication multiplication = new Multiplication(array[0], array[1]);
				multiplication.showResult();
			} else if (inputOperation.charAt(0) == ('/')) {
				try {
					Division division = new Division(array[0], array[1]);
					division.showResult();
				} catch (ArithmeticException e) {
					System.out.println("Exception occurred, ArithmeticException: / by zero");
				}
			}
			System.out.println("\nTry again? Y or N");
			inputTryAgain = sc.nextLine();
			tryAgain = isTryAgain(inputTryAgain);

		} while (tryAgain);
		System.out.println("FINISH, THANKU");
		sc.close();
	}

	public static boolean isAOperation(String text) {
		try {
			if (text.charAt(0) == ('+') || text.charAt(0) == ('-') || text.charAt(0) == ('/')
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
			if (letter == ('Y') || letter == ('y')) {
				return true;
			} else {
				return false;
			}
		} catch (NumberFormatException ex) {
			return false;
		}
	}
}
