package practice7;

import java.util.Scanner;

/*Crea una aplicación que nos pida un día de la semana y que nos diga si es
 * un día laboral o no. Usa un switch para ello
 */
public class Main {

	public static void main(String[] args) {
		String input;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, give me your caracter!");
		input = sc.nextLine();
		
		switch (input.toUpperCase()) {
		case "LUNES":
			System.out.println("Día laborable");
			break;
		case "MARTES":
			System.out.println("Día laborable");
			break;
		case "MIERCOLES":
			System.out.println("Día laborable");
			break;
		case "JUEVES":
			System.out.println("Día laborable");
			break;
		case "VIERNES":
			System.out.println("Día laborable");
			break;
		case "SABADOS":
			System.out.println("Día NO laborable");
			break;
		case "DOMINGOS":
			System.out.println("Día NO laborable");
			break;

		default:
			System.out.println("Día no existe");
			break;
		}
		
		sc.close();
		System.out.println("Finish!");
	}

}
