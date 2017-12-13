package com.cenfotec.proyecto.documentos;

public class ActualizacionInformacionContribuyente implements IDocumento {
	private String provincia;
	private String distrito;
	private String canton;
	private String direccion;
	private boolean estado;
	private String estadoCivil;
	
	
	public ActualizacionInformacionContribuyente(String provincia, String distrito, String canton, String direccion,
			boolean estado, String estadoCivil) {
		super();
		this.provincia = provincia;
		this.distrito = distrito;
		this.canton = canton;
		this.direccion = direccion;
		this.estado = estado;
		this.estadoCivil = estadoCivil;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getCanton() {
		return canton;
	}
	public void setCanton(String canton) {
		this.canton = canton;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
	
	
}
