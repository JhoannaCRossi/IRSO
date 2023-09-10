package practice1;

import java.util.Scanner;

/*Desarrollar un programa que permita almacenar 10 textos (strings) de a lo
 * sumo 15 caracteres. Los mismos poderlos almacenarlos dentro de una
 * matriz, pero es determinante que la misma esté encapsulada
 */
public class Main {

	private static String[][] matriz = new String[2][2];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				do {
					System.out.println("Please, give me your prhase!"+(i+1)+"-"+(j+1));
					input = sc.nextLine();
				} while (!isANumberOnRange(input));

				matriz[i][j] = input;
			}
		}
		sc.close();
		printMatrix(matriz);
	}

	public static boolean isANumberOnRange(String text) {
		int cont = 0;
		try {
			for (int i = 0; i < text.length(); i++) {
				cont++;
			}
			if (cont <= 15) {
				return true;
			} else {
				System.out.println("Por favor cadenas menor a 15 caracteres\n");
				return false;
			}
		} catch (NumberFormatException ex) {
			return false;
		}
	}

	public static void printMatrix(String[][] matrix) {
		System.out.println("Printing = ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("\n");
		}
		System.out.println("Finish program");
	}

}
