package practice2;

import java.util.Scanner;

/*Ejercicio 2: Realizar un programa que permita, dado un vector de 
 * estructuras / registros cuyos campos son: empresa (cadena de caracteres 
 * [30]), domicilio (cadena de caracteres [40]), código postal (cadena de 
 * caracteres [10]), localidad (cadena de caracteres [20]), país (cadena de 
 * caracteres [15]), imprimir un listado para generar el destinatario de unas 
 * cartas. El formato debe ser el correcto.
 */

public class Main {

	public static void main(String[] args) {
		//instance scanner
		Scanner sc = new Scanner(System.in);
		String nombreEmpresa, domicilio, codigoPostal, localidad, pais;
		
		Registro registre[] = new Registro[2];
		
		for (int i = 0; i < registre.length; i++) {
			System.out.println("\n"+(i+1)+" registre:");
			do {          
				System.out.println("Please, give me your company name");
				nombreEmpresa = sc.nextLine(); 
			} while(!isANumberOnRange(nombreEmpresa, 30));
			
			do {          
				System.out.println("Please, give me your residence");
				domicilio = sc.nextLine(); 
			} while(!isANumberOnRange(domicilio, 40));
			
			do {          
				System.out.println("Please, give me your zipe code");
				codigoPostal = sc.nextLine(); 
			} while(!isANumberOnRange(codigoPostal, 10));
			
			do {          
				System.out.println("Please, give me your locality");
				localidad = sc.nextLine(); 
			} while(!isANumberOnRange(localidad, 20));
			
			do {          
				System.out.println("Please, give me your country");
				pais = sc.nextLine(); 
			} while(!isANumberOnRange(pais, 15));
			
			registre[i] = new Registro(nombreEmpresa, domicilio, localidad, codigoPostal, pais);
		}
		
		System.out.println("\nListado =");
		for (int i = 0; i < registre.length; i++) {
			System.out.print("Empresa: "+registre[i].getEmpresa()+
					", domicilio: "+ registre[i].getDomicilio()+
					", código postal: "+ registre[i].getCodigoPostal()+
					", localidad: "+ registre[i].getLocalidad()+
					", país: "+ registre[i].getPais()
					+"\n");
		}
		
	}
	
	public static boolean isANumberOnRange(String text, int limit) {
	    int number = 0;
	    try {
	    	for (int i = 0; i < text.length(); i++) {
				number++;
			}
	    	if(number <= limit) {
	    		return true;	    		
	    	}else {
	    		System.out.println("limit caracters "+limit+", correct it");
	    		return false;
	    	}
	    } catch (NumberFormatException ex) {
	       return false;
	    }
	}

}
