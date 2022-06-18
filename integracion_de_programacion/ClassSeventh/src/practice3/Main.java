package practice3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int G = 8;
		String input;

		// declaring array and allocating memory to array
		char A[] = new char[G];

		for (int i = 0; i < A.length; i++) {
			do {
				System.out.println("Please, give me your " + (i + 1) + " number for codigo ASCII! Please enter " + "numbers >= 0");
				input = sc.nextLine();
			} while (!isANumberOnRange(input)); // check number
			A[i] = (char)Integer.parseInt(input);
		}

		System.out.println("Charged vector!!");		
		System.out.println("\n");
		System.out.println("The result in ASCII caracter is =");

		// print vector charged
		for (char i : A) {
			System.out.print(i + " ");
		}
	}
	
	public static boolean isANumberOnRange(String text) {
		int number;
		try {
			number = Integer.parseInt(text);
			if (number >= 21) {
				return true;
			} else {
				return false;
			}
		} catch (NumberFormatException ex) {
			return false;
		}
	}
}
