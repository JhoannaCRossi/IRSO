package practice5;

import java.util.Scanner;

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
