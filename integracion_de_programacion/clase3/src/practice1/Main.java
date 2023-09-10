package practice1;

/* Desarrollar el código para lograr incrementar una variable desde el 1 hasta
 * al 199 con lo visto en la clase anterior. Durante cada ciclo, multiplicar el
 * valor del índice por sí mismo e imprimir el resultado total en pantalla al
 * finalizar. Utilizar variables enteras
 * */

public class Main {
	public static void main(String[] args){
		int cont = 0;
		
		while(cont < 199) {
			cont++; // increment
			System.out.println("Multiply by itself, round "+cont+" :");
			System.out.println(cont*cont + " \n");
		}
	}
}

//or

/*public class Main.java {
    public static void main(String[] args) throws Exception {
        int limit = 200;
        int acum = 0;        
        for(int i=0;i<limit;i++){
            System.out.println(i);
            acum+=i*i;
        }
        System.out.println("Resultado total= "+acum);
    }
}*/
