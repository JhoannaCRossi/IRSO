package practice3;

import java.util.Scanner;

/* Desarrollar el código para poder leer dos String desde el teclado, 
 * concatenarlo (unirlos) y luego imprimirlo por pantalla
 * */

public class Main {
	public static void main(String[] args){
		//instance scanner
		Scanner sc = new Scanner(System.in);
		
		String one = null, two = null, input, result;
		
		for (int i = 1; i < 3; i++) {
			System.out.println("Please , give me your " +i+ " word");
			input = sc.nextLine();
			
			if(i == 1) {
				//one word only
				String[] phrase = input.split("\\s+");
				one = phrase[0];
			}else {
				String[] phrase = input.split("\\s+");
				two = phrase[0];
			}
		}
		result = one +" "+ two;
		//console sampling
		System.out.println(result + " this is the result of concatenating.");

	}
}
