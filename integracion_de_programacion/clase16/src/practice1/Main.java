package practice1;

import java.util.Scanner;

/*
* A modo de ejercitación les propongo que comiencen a desarrollar un
* programa que simplemente les permita almacenar un valor entero (sólo un número
* del 0 al 9) el cual es introducido por teclado; Y, como segundo paso, lograr poder
* leer ese mismo valor, para luego podre imprimirlo en pantalla.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Almacenar y leer un valor entero");
            System.out.println("2. Almacenar y leer un carácter");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    almacenarLeerEntero();
                    break;
                case 2:
                    almacenarLeerCaracter();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);
    }

    public static void almacenarLeerEntero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un valor entero (0 al 9): ");
        int valorEntero = scanner.nextInt();
        System.out.println("El valor entero almacenado es: " + valorEntero);
    }

    public static void almacenarLeerCaracter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un carácter (letra del alfabeto): ");
        char caracter = scanner.next().charAt(0);
        System.out.println("El carácter almacenado es: " + caracter);
    }
}