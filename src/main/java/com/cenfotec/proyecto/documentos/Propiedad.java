package com.cenfotec.proyecto.documentos;

import java.time.LocalDate;

public class Propiedad {
	private int numeroPlanoCatastro;
	private LocalDate fechaRegistro;
	
	
	public Propiedad(int pnumeroPlanoCatastro, LocalDate fechaRegistro) {
		this.numeroPlanoCatastro = pnumeroPlanoCatastro;
		this.fechaRegistro = fechaRegistro;
	}
	public Propiedad() {
	}

	public int getNumeroPlanoCatastro() {
		return numeroPlanoCatastro;
	}

	public void setNumeroPlanoCatastro(int numeroPlanoCatastro) {
		this.numeroPlanoCatastro = numeroPlanoCatastro;
	}

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
}
