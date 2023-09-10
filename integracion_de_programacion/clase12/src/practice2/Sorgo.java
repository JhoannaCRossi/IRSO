package practice2;

public class Sorgo extends Semilla{
	private String tipo;
	
	public Sorgo(int ancho, int largo) {
		super(ancho, largo);
		this.tipo = "Sorgo";
	}

	public String getTipo() {
		return tipo;
	}

	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
