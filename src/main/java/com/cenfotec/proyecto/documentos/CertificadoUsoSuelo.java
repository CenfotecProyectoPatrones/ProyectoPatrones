package com.cenfotec.proyecto.documentos;

import com.cenfotec.proyecto.documentos.propiedades.Propiedad;

public class CertificadoUsoSuelo extends Documento{
	
	private String nombreDepartamento;

	public CertificadoUsoSuelo(String fechaSolicitud, String fechaResolucion, Propiedad propiedad,
			String nombreDepartamento) {
		super(fechaSolicitud, fechaResolucion, propiedad);
		this.nombreDepartamento = nombreDepartamento;
	}

	public CertificadoUsoSuelo() {
		// TODO Auto-generated constructor stub
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	@Override
	public String toString() {
		return "CertificadoUsoSuelo\n"
				+ "	Nombre Departamento:" + nombreDepartamento 
				+ "	Fecha Solicitud:" + fechaSolicitud
				+ "	Fecha Resolucion:" + fechaResolucion 
				+ "	Propiedad:" + propiedad;
	}
	
}
