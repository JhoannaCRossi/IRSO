package practice3;

public class Registro {
	
	protected String producto;
	protected int codigo;
	protected double precio;
	
	public Registro() {
	}

	public Registro(String producto, int codigo, double precio) {
		this.producto = producto;
		this.codigo = codigo;
		this.precio = precio;
	}

	public Registro(int codigo, double precio) {
		super();
		this.codigo = codigo;
		this.precio = precio;
	}

	public String getProducto() {
		return producto;
	}

	protected void setProducto(String producto) {
		this.producto = producto;
	}

	public int getCodigo() {
		return codigo;
	}

	protected void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	protected void setPrecio(double precio) {
		this.precio = precio;
	}
}
