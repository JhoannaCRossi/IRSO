package practice3;

import java.util.Scanner;
/*Modifica la aplicación anterior, para que nos pida el nombre que queremos
 * introducir
 */
public class Main {

	public static void main(String[] args) {
		String nombre;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, give me your name!");
		nombre = sc.nextLine();

		System.out.println("}nBienvenido " + nombre + " !");

		sc.close();
	}

}
