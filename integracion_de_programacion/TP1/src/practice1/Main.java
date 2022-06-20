package practice1;

import java.util.Scanner;
/*1.- Realizar un programa que permita leer de teclado cinco valores reales 
 * entre 100 y -200; Luego realizar el siguiente cálculo resultado = ((valor1 * 
 * valor2) – (valor3 * valor4)) / valor5; y por último imprimir en pantalla el 
 * resultado.
 */
public class Main {
	public static void main(String[] args){
		//instance scanner
		Scanner sc = new Scanner(System.in);
		
		String input;
		
		float resultado = 0;
		float valor1 = 0, valor2 = 0, valor3 = 0, valor4 = 0, valor5 = 0; 
		//declaring array and allocating memory to array
		int[] array = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			do {          
				System.out.println("Please, give me your "+(i+1)+" number! Please enter "
						+ "numbers from 100 a -200");
				input = sc.nextLine(); 
			} while(!isANumberOnRange(input)); //check number
			
			array[i] = Integer.parseInt(input);
		}
		
		valor1 = array[0];
		valor2 = array[1];
		valor3 = array[2];
		valor4 = array[3];
		valor5 = array[4];
		
		resultado = makeCalculated(valor1, valor2, valor3, valor4, valor5);
		
		System.out.println("\n");
		System.out.println(resultado+" is the result!!");
		sc.close();
	}
	
	public static boolean isANumberOnRange(String text) {
	    int number;
	    try {
	    	number = Integer.parseInt(text);
	    	if(number >= (-200) && number <= 100) {
	    		return true;	    		
	    	}else {
	    		return false;
	    	}
	    } catch (NumberFormatException ex) {
	       return false;
	    }
	}
	
	public static float makeCalculated(float valor1, float valor2, float valor3, float valor4, float valor5) {
	    return ((valor1*valor2)-(valor3*valor4))/valor5;
	}
}
