package practice1;

public class Programador extends Empleado{
	
	protected int antiguedad;
	protected String empresa;
	
	public Programador(int legajo, String nombre, int dependenciaTrabajo, double horasTrabajadas, int antiguedad, String empresa) {
		super(legajo, nombre, dependenciaTrabajo, horasTrabajadas);
		this.antiguedad = antiguedad;
		this.empresa = empresa;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	protected void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public String getEmpresa() {
		return empresa;
	}

	protected void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("con esta antiguedad: "+this.antiguedad + 
				" y el nombre de la empresa en la que trabaja es: " + this.getEmpresa());
	}
}
