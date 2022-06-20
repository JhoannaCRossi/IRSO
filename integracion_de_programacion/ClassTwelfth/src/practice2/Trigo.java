package practice2;

public class Trigo extends Semilla{

	private String tipo;
	
	public Trigo(int ancho, int largo) {
		super(ancho, largo);
		this.tipo = "Trigo";
	}

	public String getTipo() {
		return tipo;
	}

	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
