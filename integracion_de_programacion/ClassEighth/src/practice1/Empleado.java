package practice1;

public class Empleado {

	protected int legajo;
	protected String nombre;
	protected int dependenciaTrabajo;
	protected double horasTrabajadas;
	
	public Empleado() {
	}

	public Empleado(int legajo, String nombre, int dependenciaTrabajo, double horasTrabajadas) {
		this.legajo = legajo;
		this.nombre = chequeoCaracteres(nombre);
		this.dependenciaTrabajo = dependenciaTrabajo;
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getLegajo() {
		return legajo;
	}

	protected void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDependenciaTrabajo() {
		return dependenciaTrabajo;
	}

	protected void setDependenciaTrabajo(int dependenciaTrabajo) {
		this.dependenciaTrabajo = dependenciaTrabajo;
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	protected void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public void printInfo() {
		System.out.println("Empleado = "+ this.getNombre()+", legado número: "+ this.getLegajo()+", dependencia de trabajo: "
				+this.getDependenciaTrabajo()+", y con esta cantidad de horas trabajas: "+this.getHorasTrabajadas());
	}
	
	private String chequeoCaracteres(String nombre) {
		if(nombre.length() >= 10) {
			return nombre.substring(0, 10);
		}else {
			return nombre;
		}
	}

}
