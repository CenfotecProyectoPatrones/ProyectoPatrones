package com.cenfotec.proyecto.documentos;

import java.time.LocalDate;

public class LicenciaMunicipalFuncionamiento extends Documento {
	private LocalDate fechaVencimiento;
	
	public LicenciaMunicipalFuncionamiento(LocalDate fechaSolicitud, LocalDate fechaResolucion, Propiedad propiedad,
			LocalDate fechaVencimiento) {
		super(fechaSolicitud, fechaResolucion, propiedad);
		this.fechaVencimiento = fechaVencimiento;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
}
