package practice1;

/*
 *  Declara un array tipo int (entero) denominado numeroDeCoches que contenga
 *  24 variables. Declara una variable tipo int (entero) que se llame r. Establece el
 *  valor de r en 2 y el valor de numeroDeCoches para un localizador de valor r en
 *  23. Procede a mostrar en pantalla un mensaje que indique cuál es la hora r y el
 *  número de coches para la hora r. Finalmente, modifica únicamente la asignación
 *  de valor a r de modo que en vez de 2 sea 21 y ejecuta de nuevo el programa
 */
public class Main {

    public static void main(String[] args) {
        int[] numeroDeCoches = new int[24];
        int r;
        r=2;
        numeroDeCoches[r]=23;
        System.out.println("El número de coches en la hora "+r+" fue "+ numeroDeCoches[r]);
        r=21;
        numeroDeCoches[r]=23;
        System.out.println("El número de coches en la hora "+r+" fue "+ numeroDeCoches[r]);
    }
}