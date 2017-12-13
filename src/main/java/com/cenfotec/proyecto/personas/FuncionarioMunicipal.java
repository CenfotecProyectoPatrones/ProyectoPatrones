package com.cenfotec.proyecto.personas;

import java.time.LocalDate;

public class FuncionarioMunicipal extends Persona {
	
	private boolean numeroEmpleado;
	private String nombreMiembro;
	private String nombreDepartamento;
	
	public FuncionarioMunicipal(String nombreCompleto, String cedulaIdentidad, String estadoCivil,
			LocalDate fechaNacimiento, boolean estado, boolean numeroEmpleado, String nombreMiembro,
			String nombreDepartamento) {
		super(nombreCompleto, cedulaIdentidad, estadoCivil, fechaNacimiento, estado);
		this.numeroEmpleado = numeroEmpleado;
		this.nombreMiembro = nombreMiembro;
		this.nombreDepartamento = nombreDepartamento;
	}
	public boolean isNumeroEmpleado() {
		return numeroEmpleado;
	}
	public void setNumeroEmpleado(boolean numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	public String getNombreMiembro() {
		return nombreMiembro;
	}
	public void setNombreMiembro(String nombreMiembro) {
		this.nombreMiembro = nombreMiembro;
	}
	public String getNombreDepartamento() {
		return nombreDepartamento;
	}
	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}
	
	

}
