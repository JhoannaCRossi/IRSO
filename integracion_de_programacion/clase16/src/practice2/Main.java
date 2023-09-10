package practice2;

import java.util.Scanner;

/*
* El segundo paso, y continuando con la ejercitación propuesta para la clase,
* es utilizar el mismo programa desarrollado y “ajustarlo” para que en éste caso
* permita realizar las mismas dos operaciones pero con un carácter (sólo una letra
* de nuestro alfabeto).
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int[] valoresEnteros = new int[10]; // Arreglo para valores enteros
        char[] caracteres = new char[26];   // Arreglo para caracteres del alfabeto

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Almacenar y leer un valor entero");
            System.out.println("2. Almacenar y leer un carácter");
            System.out.println("3. Mostrar valores enteros almacenados");
            System.out.println("4. Mostrar caracteres almacenados");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    almacenarLeerEntero(valoresEnteros);
                    break;
                case 2:
                    almacenarLeerCaracter(caracteres);
                    break;
                case 3:
                    mostrarValoresEnteros(valoresEnteros);
                    break;
                case 4:
                    mostrarCaracteres(caracteres);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }


    public static void almacenarLeerEntero(int[] valoresEnteros) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un índice (0-9) para almacenar el valor entero: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < 10) {
            System.out.print("Introduzca un valor entero (0 al 9): ");
            int valorEntero = scanner.nextInt();
            valoresEnteros[indice] = valorEntero;
            System.out.println("El valor entero almacenado en el índice " + indice + " es: " + valorEntero);
        } else {
            System.out.println("Índice fuera de rango. Debe ser un valor entre 0 y 9.");
        }
    }

    public static void almacenarLeerCaracter(char[] caracteres) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un índice (0-25) para almacenar el carácter: ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < 26) {
            System.out.print("Introduzca un carácter (letra del alfabeto): ");
            char caracter = scanner.next().charAt(0);
            caracteres[indice] = caracter;
            System.out.println("El carácter almacenado en el índice " + indice + " es: " + caracter);
        } else {
            System.out.println("Índice fuera de rango. Debe ser un valor entre 0 y 25.");
        }
    }

    public static void mostrarValoresEnteros(int[] valoresEnteros) {
        System.out.println("Valores enteros almacenados:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Índice " + i + ": " + valoresEnteros[i]);
        }
    }

    public static void mostrarCaracteres(char[] caracteres) {
        System.out.println("Caracteres almacenados:");
        for (int i = 0; i < 26; i++) {
            System.out.println("Índice " + i + ": " + caracteres[i]);
        }
    }
}
