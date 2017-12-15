package com.cenfotec.proyecto.solicitud.state;

import com.cenfotec.proyecto.solicitud.Solicitud;


public class Verificado implements State {
	
	private Solicitud solicitud;


	public Verificado(Solicitud aThis) {
		this.solicitud = aThis;
	}
	@Override
	public void solicitar() {
		System.out.println("Esta solicitud ya se encuentra en tramite.");
	}

	@Override
	public void aceptar() {
		System.out.println("La solicitud no ha sido aceptada.");
	}

	@Override
	public void rechazar() {
		System.out.println("Esta solicitud ha sido Rechazada.");
	}

	@Override
	public void verificar() {
		System.out.println("Esta solicitud se encuentra en tramite.");
	}

	@Override
	public void notificar() {
		System.out.println("Esta solicitud se encuentra en tramite y no puede ser notificada.");
		solicitud.setEstado(solicitud.getNotificado());
	}

	@Override
	public void finalizar() {
		System.out.println("Este tramite ha sido finalizado.");
		solicitud.setEstado(solicitud.getFinalizado());
	}
 
    public String toString() {
	return "Verificado";
    }

}
