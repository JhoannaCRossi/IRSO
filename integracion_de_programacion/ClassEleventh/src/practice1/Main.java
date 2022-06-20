package practice1;

import java.util.Scanner;

/*Declara 2 variables numéricas (con el tipo valor que desees), he indica cual
 * es mayor de los dos. Si son iguales indicarlo también. Y al ir cargando
 * nuevos valores desde teclado se comprobará que funciona correctamente.
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input;
		boolean end = true;

		do {
			int[] array = new int[2];

			for (int i = 0; i < array.length; i++) {
				do {
					System.out.println("Please, give me your number!");
					input = sc.nextLine();
				} while (!isANumberOnRange(input));
				array[i] = Integer.parseInt(input);
			}
			isSame(array);
			
			System.out.println("\ncontinue? Y or N");
			input = sc.nextLine();
			if(input.equalsIgnoreCase("Y")) {
				end = false;
			}
		} while (!end);
		System.out.println("Finish");
		sc.close();
	}

	private static void isSame(int[] array) {
		int number1;
		int number2;
		
		number1 = array[0];
		number2 = array[1];
		
		if (number1 > number2) {
			System.out.println(number1 + " es mayor que "+ number2);
		}else if(number1 < number2) {
			System.out.println(number1 + " es menor que "+ number2);
		}else {
			System.out.println("Los números son iguales, "+number1 +"="+ number2);

		}
		
	}

	public static boolean isANumberOnRange(String text) {
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

}
