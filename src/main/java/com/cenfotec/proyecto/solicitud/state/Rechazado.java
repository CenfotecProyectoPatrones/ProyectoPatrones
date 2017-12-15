package com.cenfotec.proyecto.solicitud.state;

import com.cenfotec.proyecto.solicitud.Solicitud;


public class Rechazado implements State {
	
	private Solicitud solicitud;


	public Rechazado(Solicitud aThis) {
		this.solicitud = aThis;
	}
	@Override
	public void solicitar() {
		System.out.println("Esta solicitud se encuentra en tramite.");
	}

	@Override
	public void aceptar() {
		System.out.println("Esta solicitud no puede ser aceptada.");
	}

	@Override
	public void rechazar() {
		System.out.println("Esta solicitud ya ha sido Rechazada.");
	}

	@Override
	public void verificar() {
		System.out.println("Esta solicitud fue rechazada y no se puede verificar.");
	}

	@Override
	public void notificar() {
		System.out.println("Este tramite ha sido completado.");
	}

	@Override
	public void finalizar() {
		System.out.println("Este tramite ha sido finalizado, debido a su rechazo.");
	}
 
    public String toString() {
	return "Rechazado";
    }

}
