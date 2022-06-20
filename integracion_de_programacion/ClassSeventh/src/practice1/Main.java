package practice1;

import java.util.Scanner;
/*Ejercicio 1: Realizar un programa que permita hacer nulos (cargarles valor 0)
 *  los elementos de un vector Q de enteros, con n componentes (donde n es una 
 *  constante que vale 10).O sea, al hacer un barrido de lectura por un vector 
 *  buscando el valor 10, el encontrarlo reemplazarlo por el valor0 (nulo).
 * 
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = 10;
		String input;

		// declaring array and allocating memory to array
		int q[] = new int[N];

		for (int i = 0; i < q.length; i++) {
			do {
				System.out.println("Please, give me your " + (i + 1) + " number! Please enter " + "numbers >= 0");
				input = sc.nextLine();
			} while (!isANumberOnRange(input)); // check number
			q[i] = Integer.parseInt(input);
		}

		System.out.println("\n");
		System.out.println("charged vector!!");

		// print vector charged
		for (int i : q) {
			System.out.print(i + " ");
		}
		do {
			System.out.println("\nPlease, give me the number to search!");
			input = sc.nextLine();
		} while (!isANumberOnRange(input)); // check number

		int numberSearch = Integer.parseInt(input);
		//find number
		for (int j = 0; j < q.length; j++) {
			if (q[j] == numberSearch) {
				q[j] = 0;
			}
		}

		// finally print vector modificated
		System.out.println("\n");
		for (int i : q) {
			System.out.print(i + " ");
		}
		System.out.println("\n Is the result!! Finish.");
		sc.close();
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
