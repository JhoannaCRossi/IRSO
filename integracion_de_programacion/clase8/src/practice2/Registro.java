package practice2;

public class Registro {
	
	protected String empresa;
	protected String domicilio;
	protected String codigoPostal;
	protected String localidad;
	protected String pais;
	
	public Registro(String empresa, String domicilio, String codigoPostal, String localidad, String pais) {
		this.empresa = empresa;
		this.domicilio = domicilio;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		this.pais = pais;
	}

	public String getEmpresa() {
		return empresa;
	}

	protected void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDomicilio() {
		return domicilio;
	}

	protected void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	protected void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	protected void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getPais() {
		return pais;
	}

	protected void setPais(String pais) {
		this.pais = pais;
	}
}
