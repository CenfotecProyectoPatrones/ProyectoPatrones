package com.cenfotec.proyecto.documentos;

public class CertificadoUsoSuelo extends Documento{
	
	private String nombreDepartamento;

	public CertificadoUsoSuelo(String fechaSolicitud, String fechaResolucion, Propiedad propiedad,
			String nombreDepartamento) {
		super(fechaSolicitud, fechaResolucion, propiedad);
		this.nombreDepartamento = nombreDepartamento;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}
	
	

}
