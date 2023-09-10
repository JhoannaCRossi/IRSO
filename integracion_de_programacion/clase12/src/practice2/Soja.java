package practice2;

public class Soja extends Semilla{
	
	private String tipo;
	
	public Soja(int ancho, int largo) {
		super(ancho, largo);
		this.tipo = "Soja";
	}

	public String getTipo() {
		return tipo;
	}

	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
