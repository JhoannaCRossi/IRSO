package practice2;

import java.util.Scanner;

/* Realiza un programa que lea de teclado valores entre 32 y 120, y los vaya
 * sumando uno a uno dentro de la variable “sumatoria”. En el caso que sea
 * fuera de ese rango que no realice ninguna operación. Y en caso que
 * ingrese el valor cero “0”, debe finalizar el programa.
 * */

public class Main {
	public static void main(String[] args){
		//instance scanner
		Scanner sc = new Scanner(System.in);
		
		String input;
		int numberInput = 0, acum = 0, finish = 1;
		
		do {
			do {          
				System.out.println("Please , give me your number! Enter "
						+ "numbers from 32 to 120; to finish enter 0");
				input = sc.nextLine(); 
			} while(!IsANumberOnRange(input)); //check number	
			
			numberInput = Integer.parseInt(input);
			acum += numberInput;
		}while(numberInput!=0);
		
		System.out.println("its done!");
		sc.close();
	}
	
	public static boolean IsANumberOnRange(String text) {
	    int number;
	    try {
	    	number = Integer.parseInt(text);
	    	if(number >= 32 && number <= 120 || number == 0) {
	    		return true;	    		
	    	}else {
	    		return false;
	    	}
	    } catch (NumberFormatException ex) {
	       return false;
	    }
	}
}
