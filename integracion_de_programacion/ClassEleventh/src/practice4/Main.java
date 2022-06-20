package practice4;

import java.util.Scanner;

/*Lee un número por teclado e indica si es divisible entre 2 (con resto = 0). 
 * Si no lo es, también debemos indicarlo
 */
public class Main {

	public static void main(String[] args) {
		String input;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, give me your number!");
		input = sc.nextLine();

		int number = Integer.parseInt(input);
		if(number % 2 == 0) {
			System.out.println(number+" es divisible entre 2!");
		}else {
			System.out.println(number+" NO es divisible entre 2!");
		}

		sc.close();
	}

}
