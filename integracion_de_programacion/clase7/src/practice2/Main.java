package practice2;

import java.util.Scanner;
/* Ejercicio 2: Realizar un programa que permita obtener e imprimir el 
 * resultado de la suma de los elementos de un vector Z de longitud k, 
 * donde los elementos del vector son reales (considerar k=5).
 * 
 */
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int K = 5;
		String input;
		double acum = 0;

		// declaring array and allocating memory to array
		double z[] = new double[K];

		for (int i = 0; i < z.length; i++) {
			do {
				System.out.println("Please, give me your " + (i + 1) + " number! Please enter " + "numbers >= 0");
				input = sc.nextLine();
			} while (!isANumberOnRange(input)); // check number
			z[i] = Integer.parseInt(input);
			acum+= Integer.parseInt(input);
		}

		System.out.println("\n");
		System.out.println("Charged vector!!");

		// print vector charged
		for (double i : z) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		System.out.println("The sum of the elements of this vector is "+acum);
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
