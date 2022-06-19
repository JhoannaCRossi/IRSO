package practice4;
/*Ejercicio 4: Dado un vector B de estructuras / registros de alumnos cuyos 
 * campos son: nombre (cadena de caracteres [10]) y nota (entero); 
 * realizar mediante un programa la impresión de los nombres de los alumnos 
 * cuyas notas superen el valor 7. 
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Alumno alumnos[] = new Alumno[4];
		fillVector(alumnos);
		
		System.out.println("\nListado de alumnos con nota mayor a 7");
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i].getNota() > 7) {
				System.out.println("\nAlumno"+(i+1)+"= "+
			"Nombre: "+alumnos[i].getNombre()+
			", nota: "+alumnos[i].getNota());
			}
		}
	}

	public static void fillVector(Alumno[] vector) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		int nota;
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("\n"+(i+1)+" Alumno =");
			do {          
				System.out.println("Please, give me your name");
				nombre = sc.nextLine(); 
			} while(!isANumberOnRange(nombre, 10));
			
			do {          
				System.out.println("Please, give me your note");
				nota = sc.nextInt(); 
				sc.nextLine();
			} while(!isANumber(nota));
			
			//creatring vector
			vector[i] = new Alumno(nombre, nota);
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
	
	public static boolean isANumber(int number) {

	    try {
	    	if(number >= 0 && number <= 10) {
	    		return true;	    		
	    	}else {
	    		return false;
	    	}
	    } catch (NumberFormatException ex) {
	       return false;
	    }
	}
}
