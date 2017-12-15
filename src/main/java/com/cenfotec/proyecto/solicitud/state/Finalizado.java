package com.cenfotec.proyecto.solicitud.state;

import com.cenfotec.proyecto.solicitud.Solicitud;


public class Finalizado implements State {
	
	private Solicitud solicitud;


	public Finalizado(Solicitud aThis) {
		this.solicitud = aThis;
	}
	@Override
	public void solicitar() {
		System.out.println("Esta solicitud se encuentra en tramite.");
	}

	@Override
	public void aceptar() {
		System.out.println("Esta solicitud ya ha sido aceptada.");
	}

	@Override
	public void rechazar() {
		System.out.println("Esta solicitud no ha sido Rechazada.");
	}

	@Override
	public void verificar() {
		System.out.println("Esta solicitud ya fue aceptada y no puede ser verificada");
	}

	@Override
	public void notificar() {
		System.out.println("Esta solicitud se encuentra en proceso de notificacion.");
	}

	@Override
	public void finalizar() {
		System.out.println("Este tramite se ha sido finalizado.");
		solicitud.setEstado(solicitud.getFinalizado());
	}
 
    public String toString() {
	return "Finalizado";
    }

}
