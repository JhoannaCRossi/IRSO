package practice2;

import java.util.Arrays;

public class Matriz {
	
	public static int [][] matrix;
	public static int number;
	
	public Matriz( int number) {
		this.number = number;
		this.matrix = new int[number][number];
		fill();
	}

	public void fill() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = 0;
			}
		}
	}
	
	public void refill(int j, int j2, int number) {
		matrix[j][j2] = number;
	}
	
	@Override
	public String toString() {
		String aux= "";
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				aux += matrix[i][j] + "\t";
			}
			aux += "\n";
		}
		return aux;
	}
	
}
