package practice4;

public class Alumno {
	
	protected String nombre;
	protected int nota;
	
	public Alumno() {
	}

	public Alumno(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNota() {
		return nota;
	}

	protected void setNota(int nota) {
		this.nota = nota;
	}
	
}