package practice2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// instance scanner
		Scanner sc = new Scanner(System.in);

		String input;
		int acum = 0;
		Matriz matrix = new Matriz(6);
		
		System.out.println(matrix.toString());

		for (int j = 0; j < 6; j++) {
			for (int j2 = 0; j2 < 6; j2++) {
				do {
					System.out.println("Please, give me your (" + (j + 1) + "),(" + (j2 + 1) + ")"
							+ " number! Please enter numbers from 1 to 9");
					input = sc.nextLine();
				} while (!isANumberOnRange(input)); // check number is positive

				int inputNumber = Integer.parseInt(input);
				
				matrix.refill(j, j2, inputNumber);
				acum += inputNumber;
				
			}
		}

		System.out.println(matrix.toString());
		System.out.println("the average is"+ acum/(6*6));
		System.out.println("Finish");
	}

	public static boolean isANumberOnRange(String text) {
		int number;
		try {
			number = Integer.parseInt(text);
			if (number >= 1 && number <= 9) {
				return true;
			} else {
				return false;
			}
		} catch (NumberFormatException ex) {
			return false;
		}
	}

}
