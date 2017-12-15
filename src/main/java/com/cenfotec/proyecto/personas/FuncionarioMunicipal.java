package com.cenfotec.proyecto.personas;

public class FuncionarioMunicipal extends Persona {
	
	private int numeroEmpleado;
	private String nombreMiembro;
	private String nombreDepartamento;
	
	public FuncionarioMunicipal() {
	}
	
	public FuncionarioMunicipal(String nombreCompleto, String cedulaIdentidad, String estadoCivil,
			String fechaNacimiento, boolean estado, int numeroEmpleado, String nombreMiembro,
			String nombreDepartamento) {
		super(nombreCompleto, cedulaIdentidad, estadoCivil, fechaNacimiento, estado);
		this.numeroEmpleado = numeroEmpleado;
		this.nombreMiembro = nombreMiembro;
		this.nombreDepartamento = nombreDepartamento;
	}
	
	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}
	
	public void setNumeroEmpleado(int numeroEmpleado) {
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
