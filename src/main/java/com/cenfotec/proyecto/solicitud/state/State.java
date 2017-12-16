package com.cenfotec.proyecto.solicitud.state;

public interface State {
	void solicitar();
	void aceptar();
	void rechazar();
	void verificar();
	void notificar();
	void finalizar();
}
