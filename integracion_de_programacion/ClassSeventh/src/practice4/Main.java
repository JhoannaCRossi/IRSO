package practice4;

import java.util.Scanner;
/*Ejercicio 4: Realizar un programa que permita obtener el producto de dos 
 * vectores A y B componente a componente, guardando el resultado en uno nuevo.
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int length = 6;
		// declaring array and allocating memory to array
		int vectorOne[] = new int[length];
		int vectorTwo[] = new int[length];
		
		fillVector(vectorOne, "first", sc);
		fillVector(vectorTwo, "second", sc);
		int vectorResult[] = multiplyVectors(vectorOne,vectorTwo, length);

		System.out.println("\n");
		System.out.println("The vector resultant is =");

		// print vector charged
		for (int i : vectorResult) {
			System.out.print(i + " ");
		}
	}

	private static int[] multiplyVectors(int[] vectorOne, int[] vectorTwo, int length) {
		int result[] = new int[length];
		for (int i = 0; i < vectorTwo.length; i++) {
			result[i] = vectorOne[i]*vectorTwo[i];
		}
		return result;
	}

	public static void fillVector(int[]vector, String indicator, Scanner sc) {
	String input;
		for (int i = 0; i < vector.length; i++) {
			do {
				System.out.println(
						"Please, give me your " + (i + 1) + " number for "+indicator+" vector! Please enter " + "numbers > 0");
				input = sc.nextLine();
			} while (!isANumberOnRange(input)); // check number
			vector[i] = Integer.parseInt(input);
		}

		System.out.println("Charged vector!!");
	}
	
	public static boolean isANumberOnRange(String text) {
		int number;
		try {
			number = Integer.parseInt(text);
			if (number > 0) {
				return true;
			} else {
				return false;
			}
		} catch (NumberFormatException ex) {
			return false;
		}
	}

}
