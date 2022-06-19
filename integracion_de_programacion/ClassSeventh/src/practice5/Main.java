package practice5;

import java.util.Scanner;
/*Ejercicio 5: Realizar un programa que permita asignar la identidad a una 
 * matriz R de dimensiones mxm (considerar m=4). Los índices y las componentes 
 * son enteros. La matriz identidad es la que tiene valor 1 en la diagonal 
 * principal y 0 en el resto.
 * 
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int M = 4;
		int R[][] = new int[M][M];
		fillMatrix(R);
		printMatrix(R);
		
	}

	public static void fillMatrix(int[][]matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if(i==j) {
					matrix[i][j] = 1;
				}else {
					matrix[i][j] = 0;
				}
			}
		}
		System.out.println("Carged Matrix!\n");
	}
	
	public static void printMatrix(int[][]matrix) {
		System.out.println("Printing = ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println("\n");
		}
		System.out.println("Finish program");
	}
}
