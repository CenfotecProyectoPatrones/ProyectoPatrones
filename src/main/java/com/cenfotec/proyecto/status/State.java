package com.cenfotec.proyecto.status;

public interface State {
	String solicitar();
	String aceptar();
	String rechazar();
	String verificar();
	String notificar();
	String finalizar();
}
