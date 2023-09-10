package practice3;

import java.util.Scanner;

/*Ejercicio 3: Realizar un programa que permita, dado un vector A de 
 * estructuras / registros, cuyos campos son: producto (cadena de caracteres 
 * [10]), código (entero) y precio (real); obtener un nuevo vector B de 
 * estructuras / registros que contengan sólo el código y el precio del 
 * vector A.
 */
public class Main {

	public static void main(String[] args) {

		Registro vectorA[] = new Registro[1];
		fillVector(vectorA);
		
		//print vector A
		for (Registro registro : vectorA) {
			System.out.println("\nVECTOR A");
			System.out.println(registro.getProducto()+" "+registro.getCodigo() +" "+ registro.getPrecio());
		}
		
		//creating vector B
		Registro vectorB[] = new Registro[1];
		for (Registro registro : vectorA) {
			vectorB[0] = new Registro(registro.getCodigo(), registro.getPrecio());
		}
		
		//print vector B
		for (Registro registro : vectorB) {
			System.out.println("\nVECTOR B");
			System.out.println(registro.getCodigo() +" "+ registro.getPrecio());
		}
	}
	
	public static void fillVector(Registro[] vector) {
		Scanner sc = new Scanner(System.in);
		String producto, inputCodigo, inputPrecio;
		int codigo;
		double precio;
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("\n"+(i+1)+" registre:");
			do {          
				System.out.println("Please, give me your product");
				producto = sc.nextLine(); 
			} while(!isANumberOnRange(producto, 10));
			
			do {          
				System.out.println("Please, give me your code");
				inputCodigo = sc.nextLine(); 
			} while(!isANumberOnRange(inputCodigo, 10));
			codigo = Integer.parseInt(inputCodigo);
			
			do {          
				System.out.println("Please, give me your price");
				inputPrecio = sc.nextLine(); 
			} while(!isANumberOnRange(inputPrecio, 30));
			precio = Double.parseDouble(inputPrecio);
			
			//creatring el vector A
			vector[i] = new Registro(producto, codigo, precio);
		}
		sc.close();
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
