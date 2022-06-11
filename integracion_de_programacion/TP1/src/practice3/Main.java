package practice3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//instance scanner
		Scanner sc = new Scanner(System.in);
		
		String input;
		
		float resultado = 0;

		//declaring array and allocating memory to array
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			do {          
				System.out.println("Please, give me your "+(i+1)+" number! Please enter "
						+ "numbers positive");
				input = sc.nextLine(); 
			} while(!isANumberOnRange(input)); //check number is positive
			
			array[i] = Integer.parseInt(input);
			
			if(array[i] != 0) {
				if (isPar(array[i])) {
					System.out.println("Is an even number");
				} else {
					System.out.println("Is an odd number");
				}				
			}else {
				System.out.println("This number is zero");
			}
		}
		System.out.println("Finish");
	}
	
	public static boolean isANumberOnRange(String text) {
	    int number;
	    try {
	    	number = Integer.parseInt(text);
	    	if(number >= 0) {
	    		return true;	    		
	    	}else {
	    		return false;
	    	}
	    } catch (NumberFormatException ex) {
	       return false;
	    }
	}
	
	public static boolean isPar(int number) {
			return number % 2 == 0;			
	}

}
