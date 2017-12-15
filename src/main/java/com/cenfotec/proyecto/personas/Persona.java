package com.cenfotec.proyecto.personas;

import java.time.LocalDate;

public class Persona {
	protected String nombreCompleto;
	protected String cedulaIdentidad;
	protected String estadoCivil;
	protected String fechaNacimiento;
	protected boolean estado;
	
	public Persona(String nombreCompleto, String cedulaIdentidad, String estadoCivil, String fechaNacimiento,
			boolean estado) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.cedulaIdentidad = cedulaIdentidad;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.estado = estado;
	}	
	public Persona() {
		super();
	}


	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getCedulaIdentidad() {
		return cedulaIdentidad;
	}
	public void setCedulaIdentidad(String cedulaIdentidad) {
		this.cedulaIdentidad = cedulaIdentidad;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public LocalDate getFechaNacimientoLocal() {
		LocalDate fechaN = LocalDate.parse(this.fechaNacimiento);
		return fechaN;
	}
	
	public String getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Persona [nombreCompleto=" + nombreCompleto + ", cedulaIdentidad=" + cedulaIdentidad + ", estadoCivil="
				+ estadoCivil + ", fechaNacimiento=" + fechaNacimiento + ", estado=" + estado;
	}
	
	
}
