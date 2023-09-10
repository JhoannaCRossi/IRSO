package practice6;

import java.util.Scanner;
/*Ejercicio 6: Realizar un programa que permita obtener la suma de dos 
 * matrices X y J de dimensión axb (a=3 y b=4). Los elementos de la matriz 
 * son reales. El resultado debe ser impreso. Realizar la suma componente a 
 * componente.
 * 
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int A = 3, B=4;
		double vectorMock[][] = new double[A][B];
		double X[][] = fillMatrix(vectorMock, A, B, "firts");
		double J[][] = fillMatrix(vectorMock, A, B, "second");
		
		
		double resultMatrix[][] = sumeMatrixes(X,J, A, B);
		printMatrix(resultMatrix, A, B);
		sc.close();
	}

	private static double[][] sumeMatrixes(double[][] x, double[][] j, int A, int B) {
		double resultMatrix[][] = new double[A][B];
		for (int i = 0; i < A; i++) {
			for (int k = 0; k < B; k++) {
				resultMatrix[i][k] = x[i][k]+j[i][k];
			}
		}
		return resultMatrix;
	}

	public static double[][] fillMatrix(double[][] matrix, int A, int B, String indicator) {
		Scanner sc = new Scanner(System.in);
		String input;
		for (int i = 0; i < A; i++) {
			for (int j = 0; j < B; j++) {
				do {
					System.out.println("Please, give me your " + (i + 1)+"-"+(j+1) + " number for the "+indicator+" matrix!");
					input = sc.nextLine();
				} while (!isANumberOnRange(input)); // check number
				matrix[i][j] = Double.parseDouble(input);
			}
		}
		System.out.println("Carged Matrix!\n");
		return matrix;
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
	
	
	public static void printMatrix(double[][] matrix, int A, int B) {
		System.out.println("Printing = ");
		for (int i = 0; i < A; i++) {
			for (int j = 0; j < B; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("\n");
		}
		System.out.println("Finish program");
	}
}
