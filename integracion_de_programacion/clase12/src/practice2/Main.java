package practice2;

import java.util.Scanner;

/* Desarrollar un programa que permita a través de la implementación del
 * Polimorfismo leer de teclado tres variables (ancho->entero, largo->entero y
 * tipo->string). Las cuales determinarán el tamaño de una plantación (ancho y
 * largo), como así también el tipo de cereal que se utilizará en tres opciones
 * (trigo, sorgo y soja). Por último, poder imprimir por pantalla un resumen de
 * lo cargado
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input, semilla;
		int ancho, largo;
		Semilla[]plantacion = new Semilla[3];
		
		for (int j = 0; j < plantacion.length; j++) {
			do {
				System.out.println("\nDame el ancho de la plantación que deseas!");
				input = sc.nextLine();
			} while (!isANumberOnRange(input));
			ancho = Integer.parseInt(input);
			do {
				System.out.println("\nDame el alto de la plantación que deseas!");
				input = sc.nextLine();
			} while (!isANumberOnRange(input));
			largo = Integer.parseInt(input);
			do {
				System.out.println("\nDame el tipo de semilla de la plantación que deseas!\n"
						+ "1=Trigo,\n"
						+ "2=Sorgo,\n"
						+ "3=Soja\n");
				input = sc.nextLine();
			} while (!isANumberOnRange(input));
			semilla = searchTipo(Integer.parseInt(input));
			
			switch (semilla) {
			case "Trigo":
				plantacion[j] = new Trigo(ancho, largo);
				break;

			case "Sorgo":
				plantacion[j] = new Sorgo(ancho, largo);
				break;

			case "Soja":
				plantacion[j] = new Soja(ancho, largo);
				break;

			default:
				break;
			}
		}
		//print info
		System.out.println("Listado");
		for (int i = 0; i < plantacion.length; i++) {
			System.out.println((i+1)+") "+plantacion[i].getTipo()+", ancho: "+plantacion[i].getAncho()+", largo: "+plantacion[i].getLargo());
			
		}
		sc.close();
	}

	private static String searchTipo(int parseInt) {
		if(parseInt == 1) {
			return "Trigo";
		}else if(parseInt == 2) {
			return "Sorgo";
		}else if(parseInt == 3){
			return "Soja";
		}
		return "Trigo";//default
	}

	public static boolean isANumberOnRange(String text) {
	    int number;
	    try {
	    	number = Integer.parseInt(text);
	    	if(number > 0) {
	    		return true;	    		
	    	}else {
	    		return false;
	    	}
	    } catch (NumberFormatException ex) {
	       return false;
	    }
	}
}
