package practice2;

import java.util.Scanner;

/* Desarrollar el código para leer desde teclado tres variables del tipo
 * flotantes, luego realizar el siguiente cálculo e imprimir el resultado por
 * pantalla. resultado = (primeraVariable * segundaVariable) / terceraVariable
 * */

public class Main {
	public static void main(String[] args){
		//instance scanner
		Scanner sc = new Scanner(System.in);

		//variables
		float firstVariable = 0, secondVariable = 0, thirdVariable = 0, result;
		String input;
		
		for (int i = 1; i <= 3; i++) {
			do {          
				System.out.println("Please , give me your "+i+" number");
				input = sc.nextLine(); 
			} while(!IsFloat(input)); //check number

			if(i == 1) firstVariable = Float.parseFloat(input);
			if(i == 2) secondVariable = Float.parseFloat(input);
			if(i == 3) thirdVariable = Float.parseFloat(input);
		}
		
		result = (firstVariable * secondVariable) / thirdVariable;
		System.out.println(result + " this is the result.");
		sc.close();
	}
	
	public static boolean IsFloat(String text) {
	    float flotante;
	    try {
	    	flotante = Float.parseFloat(text);
	      return true;
	    } catch (NumberFormatException ex) {
	       return false;
	    }
	}
}
