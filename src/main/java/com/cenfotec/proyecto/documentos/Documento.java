package com.cenfotec.proyecto.documentos;

import java.time.LocalDate;

import com.cenfotec.proyecto.documentos.propiedades.Propiedad;



public class Documento implements IDocumento {
	protected String fechaSolicitud;
	protected String fechaResolucion;
	protected Propiedad propiedad;
	public Documento(String fechaSolicitud, String fechaResolucion, Propiedad propiedad) {
		super();
		this.fechaSolicitud = fechaSolicitud;
		this.fechaResolucion = fechaResolucion;
		this.propiedad = propiedad;
	}
	public Documento() {
		super();
	}
	public String getFechaSolicitud() {
		return fechaSolicitud;
	}
	public LocalDate getFechaSolicitudLocal() {
		LocalDate fechaN = LocalDate.parse(this.fechaSolicitud);
		return fechaN;
	}
	
	public void setFechaSolicitud(String fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	
	public String getFechaResolucion() {
		return fechaResolucion;
	}
	public LocalDate getFechaResolucionLocal() {
		LocalDate fechaN = LocalDate.parse(this.fechaResolucion);
		return fechaN;
	}
	
	public void setFechaResolucion(String fechaResolucion) {
		this.fechaResolucion = fechaResolucion;
	}
	
	public Propiedad getPropiedad() {
		return propiedad;
	}
	
	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}
	
	@Override
	public String toString() {
		return "Documento [fechaSolicitud=" + fechaSolicitud + ", fechaResolucion=" + fechaResolucion + ", propiedad="
				+ propiedad + "]";
	}
	
	
	
}
