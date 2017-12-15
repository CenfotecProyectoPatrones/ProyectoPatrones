package com.cenfotec.proyecto.solicitud;

import com.cenfotec.proyecto.documentos.IDocumento;
import com.cenfotec.proyecto.solicitud.state.Aceptado;
import com.cenfotec.proyecto.solicitud.state.Finalizado;
import com.cenfotec.proyecto.solicitud.state.Notificado;
import com.cenfotec.proyecto.solicitud.state.Rechazado;
import com.cenfotec.proyecto.solicitud.state.Solicitado;
import com.cenfotec.proyecto.solicitud.state.State;
import com.cenfotec.proyecto.solicitud.state.Verificado;

public abstract  class Solicitud implements State{

	protected State solicitado;
	protected State rechazado;
	protected State aceptado;
	protected State notificado;
	protected State finalizado;
	protected State verificado;
	protected State estado = solicitado;
	protected IDocumento documento;
	
	
	public Solicitud(IDocumento documento) {
		solicitado = new Solicitado(this);
		solicitado = new Rechazado(this);
		solicitado = new Aceptado(this);
		solicitado = new Notificado(this);
		solicitado = new Finalizado(this);
		solicitado = new Verificado(this);
		this.documento = documento;
	}


	public State getSolicitado() {
		return solicitado;
	}


	public void setSolicitado(State solicitado) {
		this.solicitado = solicitado;
	}


	public State getRechazado() {
		return rechazado;
	}


	public void setRechazado(State rechazado) {
		this.rechazado = rechazado;
	}


	public State getAceptado() {
		return aceptado;
	}


	public void setAceptado(State aceptado) {
		this.aceptado = aceptado;
	}


	public State getNotificado() {
		return notificado;
	}


	public void setNotificado(State notificado) {
		this.notificado = notificado;
	}


	public State getFinalizado() {
		return finalizado;
	}


	public void setFinalizado(State finalizado) {
		this.finalizado = finalizado;
	}


	public State getVerificado() {
		return verificado;
	}


	public void setVerificar(State verificado) {
		this.verificado = verificado;
	}


	public State getEstado() {
		return estado;
	}


	public void setEstado(State estado) {
		this.estado = estado;
	}


	public IDocumento getDocumento() {
		return documento;
	}


	public void setDocumento(IDocumento documento) {
		this.documento = documento;
	}
	
	public void solicitar() {
		estado.solicitar();
	}

	public void aceptar() {
		estado.aceptar();
	}

	public void rechazar() {
		estado.rechazar();
	}

	public void verificar() {
		estado.verificar();
	}

	public void notificar() {
		estado.notificar();
	}

	public void finalizar() {
		estado.finalizar();
	}
}
