package practice2;

/* Sobre el programa anterior mantén el número de elementos de numeroDeCoches
* en 24. Declara dos variables a y b de tipo int(entero). Establece a con valor 8, b
* con valor 4 y r con valor a dividido entre b. Ejecuta el programa.
*/
public class Main {
    public static void main(String arg[ ]) {
        int[ ] numerodecoches = new int[24];
        int a, b;
        int r;
        a = 8;
        b = 4;
        r = a / b;
        numerodecoches[r] = 23;
        System.out.print("El número de coches en la hora "+r+" fue "+
                numerodecoches[r]);
    }
}
