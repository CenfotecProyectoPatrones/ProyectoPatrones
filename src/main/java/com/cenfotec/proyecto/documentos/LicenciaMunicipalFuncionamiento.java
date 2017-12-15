package com.cenfotec.proyecto.documentos;

import java.time.LocalDate;

public class LicenciaMunicipalFuncionamiento extends Documento {
	private String fechaVencimiento;
	
	public LicenciaMunicipalFuncionamiento(String fechaSolicitud, String fechaResolucion, Propiedad propiedad,
			String fechaVencimiento) {
		super(fechaSolicitud, fechaResolucion, propiedad);
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	
	public LocalDate getFechaVencimientoLocal() {
		LocalDate fechaN = LocalDate.parse(this.fechaVencimiento);
		return fechaN;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
}
