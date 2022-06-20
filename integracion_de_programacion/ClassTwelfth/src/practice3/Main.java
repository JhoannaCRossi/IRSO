package practice3;

import java.util.Scanner;

/*desarrollar un programa que permita, a través del ingreso de valores 
 * por teclado, calcular Seno,Coseno y Tangente
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		double hipotenusa, adyacente, opuesto;
		double operation;
		
			do {
				System.out.println("Dame el valor de la hipotenusa");
				input = sc.nextLine();
			} while (!isANumberOnRange(input));
			hipotenusa = Double.parseDouble(input);
			do {
				System.out.println("Dame el valor de la adyacente");
				input = sc.nextLine();
			} while (!isANumberOnRange(input));
			adyacente = Double.parseDouble(input);
			do {
				System.out.println("Dame el valor del opuesto");
				input = sc.nextLine();
			} while (!isANumberOnRange(input));
			opuesto = Double.parseDouble(input);

		do {
			System.out.println("Qué cálculo desea realizar?\n"
					+ "1=Seno\n"
					+ "2=Conseno\n"
					+ "3=Tangete");
			input = sc.nextLine();
		} while (!isANumberOnRange(input));

		switch (Integer.parseInt(input)) {
		case 1: {
			operation = opuesto/hipotenusa;
			System.out.println("El seno de "+opuesto+"/"+hipotenusa+" es = "+(String.format("%.2f", operation)));
			break;
		}
		case 2: {
			operation = adyacente/hipotenusa;
			System.out.println("El coseno de "+adyacente+"/"+hipotenusa+" es = "+(String.format("%.2f", operation)));
			break;
		}
		case 3: {
			operation = opuesto/adyacente;
			System.out.println("El targenta de "+opuesto+"/"+adyacente+" es = "+(String.format("%.2f", operation)));
			break;
		}
		default:
			System.out.println("Operación incorrecta");
			break;
		}
		
		sc.close();

	}


	public static boolean isANumberOnRange(String text) {
		double number;
		try {
			number = Double.parseDouble(text);;
			if (number > 0) {
				return true;
			} else {
				return false;
			}
		} catch (NumberFormatException ex) {
			return false;
		}
	}
}
