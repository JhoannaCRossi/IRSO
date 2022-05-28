package practice1;

import java.util.Scanner;

/* Realizar un programa que lea por teclado 20 valores. Que sólo tome
 * valores entre 2 y 97, y que si es mayor o igual de 50 los vaya sumando, y
 * en caso que sea menor los vaya restando cargando el resultado dentro de
 * una variable llamada “resultado”
 * */

public class Main {
	public static void main(String[] args){
		//instance scanner
		Scanner sc = new Scanner(System.in);
		
		String input;
		int numberInput, resultado = 0;
		
		//declaring array and allocating memory to array
		int[] array = new int[20];
		
		for (int i = 0; i < array.length; i++) {
			do {          
				System.out.println("Please , give me your "+(i+1)+" number! Please enter "
						+ "numbers from 2 to 97");
				input = sc.nextLine(); 
			} while(!IsANumberOnRange(input)); //check number
			
			numberInput = Integer.parseInt(input);
			
			if(numberInput >= 50) {
				resultado += numberInput;
			}else {
				resultado -= numberInput;
			}
			
		}
		System.out.println("\n");
		System.out.println(resultado+" is the result!!");
	}
	
	public static boolean IsANumberOnRange(String text) {
	    int number;
	    try {
	    	number = Integer.parseInt(text);
	    	if(number >= 2 && number <= 97) {
	    		return true;	    		
	    	}else {
	    		return false;
	    	}
	    } catch (NumberFormatException ex) {
	       return false;
	    }
	}
}