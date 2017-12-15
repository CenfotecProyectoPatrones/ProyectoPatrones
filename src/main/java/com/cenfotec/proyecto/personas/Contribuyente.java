package com.cenfotec.proyecto.personas;

import java.time.LocalDate;

public class Contribuyente extends Persona {
	private String provincia;
	private String distrito;
	private String canton;
	private String direccion;
	
	public Contribuyente(String nombreCompleto, String cedulaIdentidad, String estadoCivil, String fechaNacimiento,
			boolean estado, String provincia, String distrito, String canton, String direccion) {
		super(nombreCompleto, cedulaIdentidad, estadoCivil, fechaNacimiento, estado);
		this.provincia = provincia;
		this.distrito = distrito;
		this.canton = canton;
		this.direccion = direccion;
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
	
	
}
