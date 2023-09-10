package practice6;

import java.util.Scanner;

/* Modifica el ejercicio anterior, para qué en lugar de pedir
 * un número, pida un carácter (char) y muestre su código en la tabla ASCII
 */
public class Main {

	public static void main(String[] args) {
		String input;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, give me your caracter!");
		input = sc.nextLine();
		
		char caracter = input.charAt(0);
		int number = (int)(caracter);
		
		System.out.println(input + " es en ASCII = " + number);

		sc.close();
	}
}
