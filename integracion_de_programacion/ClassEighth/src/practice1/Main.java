package practice1;

public class Main {

	public static void main(String[] args) {
		
		//pruebo condición de solo 10 caracteres el nombre
		Empleado programador = new Programador(200, "JaimitoAlimaña", 2, 45, 2, "Zetti");
		programador.printInfo();
		System.out.println("\n");
		
		//sin overrides a metodo padre, solo herencia.
		Empleado diseñador = new Disenador(300, "Camilo", 3, 100);
		diseñador.printInfo();
		System.out.println("\n");
		
		//prueba de seteo de variables
		Empleado carpintero = new Empleado();
		carpintero.setLegajo(100);
		carpintero.setNombre("Ernesto");
		carpintero.setDependenciaTrabajo(50);
		carpintero.setHorasTrabajadas(35);
		carpintero.printInfo();
	}

}
