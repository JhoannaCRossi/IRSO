package practice5;

import java.util.Scanner;

/* Lee un número por teclado y muestra por consola, el carácter al que 
 * pertenece en la tabla ASCII. Por ejemplo: si introduzco un
 * 97, me muestre una a.
 */
public class Main {

	public static void main(String[] args) {
		int number;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, give me your number!");
		number = sc.nextInt();
		
		char caracter = (char) number;

		System.out.println(number + " es en ASCII = " + caracter);

		sc.close();

	}

}
