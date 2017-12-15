package com.cenfotec.proyecto.solicitud.state;

import com.cenfotec.proyecto.solicitud.Solicitud;


public class Solicitado implements State {
	
	private Solicitud solicitud;


	public Solicitado(Solicitud aThis) {
		this.solicitud = aThis;
	}
	@Override
	public void solicitar() {
		System.out.println("Esta solicitud ya se encuentra en tramite.");
	}

	@Override
	public void aceptar() {
		System.out.println("Esta solicitud ha sido aceptada.");
		solicitud.setEstado(solicitud.getAceptado());
	}

	@Override
	public void rechazar() {
		System.out.println("Esta solicitud ha sido Rechazada.");
		solicitud.setEstado(solicitud.getRechazado());
	}

	@Override
	public void verificar() {
		System.out.println("Esta solicitud se enviara al departamento de bienes y muebles para su verificacion.");
		solicitud.setEstado(solicitud.getVerificado());
	}

	@Override
	public void notificar() {
		System.out.println("Esta solicitud se encuentra en tramite y no puede ser notificada.");
	}

	@Override
	public void finalizar() {
		System.out.println("Esta solicitud se encuentra en tramite y no puede finalizar.");
	}
 
    public String toString() {
	return "Solicitado";
    }

}
