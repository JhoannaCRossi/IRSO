package practice2;

public class Semilla {
	
	private int ancho;
	private int largo;
	private String tipo;
	
	public Semilla(int ancho, int largo) {
		super();
		this.ancho = ancho;
		this.largo = largo;
	}

	public Semilla(int ancho, int largo, String tipo) {
		this.ancho = ancho;
		this.largo = largo;
		this.tipo = tipo;
	}

	public int getAncho() {
		return ancho;
	}

	protected void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getLargo() {
		return largo;
	}

	protected void setLargo(int largo) {
		this.largo = largo;
	}

	public String getTipo() {
		return tipo;
	}

	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
