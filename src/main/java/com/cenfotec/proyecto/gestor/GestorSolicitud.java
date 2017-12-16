package com.cenfotec.proyecto.gestor;

import java.util.ArrayList;

import com.cenfotec.proyecto.solicitud.Solicitud;
import com.cenfotec.proyecto.solicitud.SolicitudActualizacionInformacionContribuyente;
import com.cenfotec.proyecto.solicitud.SolicitudCertificadoUsoSuelo;
import com.cenfotec.proyecto.solicitud.SolicitudLicenciaMunicipalFuncionamiento;
import com.cenfotec.proyecto.solicitud.conexion.SolicitudActualizacionInformacionContribuyenteConexion;
import com.cenfotec.proyecto.solicitud.conexion.SolicitudCertificadoUsoSueloConexion;
import com.cenfotec.proyecto.solicitud.conexion.SolicitudLicenciaMunicipalFuncionamientoConexion;
import com.cenfotec.proyecto.solicitud.state.Finalizado;
import com.cenfotec.proyecto.solicitud.state.Rechazado;

public class GestorSolicitud {

	public ArrayList<Solicitud> ListaTramites() 
	{
		Rechazado rech = null;
		Finalizado fin = null;
		SolicitudActualizacionInformacionContribuyente SAIC = SolicitudActualizacionInformacionContribuyenteConexion
				.devolverObjecto();
		SolicitudCertificadoUsoSuelo SUS = SolicitudCertificadoUsoSueloConexion.devolverObjecto();
		SolicitudLicenciaMunicipalFuncionamiento SMF = SolicitudLicenciaMunicipalFuncionamientoConexion
				.devolverObjecto();
		ArrayList<Solicitud> listaSolicitud = new ArrayList<Solicitud>();

		listaSolicitud.add(SAIC);
		listaSolicitud.add(SUS);
		listaSolicitud.add(SMF);
		for (int i = 0; i < listaSolicitud.size(); i++) {
			if (listaSolicitud.get(i).getEstado() instanceof Rechazado
					|| listaSolicitud.get(i).getEstado() instanceof Finalizado) {
				listaSolicitud.remove(i);
			}
		}
		return listaSolicitud;
	}

	public Solicitud SelecionarTramite(int index) {

		ArrayList<Solicitud> Tramites = ListaTramites();
		Solicitud tramite = Tramites.get(index);
		return tramite;
	}

	public ArrayList<Solicitud> SelecionarTramitesTerminados() {

		Rechazado rech = null;
		Finalizado fin = null;
		SolicitudActualizacionInformacionContribuyente SAIC = SolicitudActualizacionInformacionContribuyenteConexion
				.devolverObjecto();
		SolicitudCertificadoUsoSuelo SUS = SolicitudCertificadoUsoSueloConexion.devolverObjecto();
		SolicitudLicenciaMunicipalFuncionamiento SMF = SolicitudLicenciaMunicipalFuncionamientoConexion
				.devolverObjecto();
		ArrayList<Solicitud> listaSolicitud = new ArrayList<Solicitud>();
		
		listaSolicitud.add(SAIC);
		listaSolicitud.add(SUS);
		listaSolicitud.add(SMF);
		for (int i = 0; i < listaSolicitud.size(); i++) {
			if (listaSolicitud.get(i).getEstado() instanceof Rechazado
					|| listaSolicitud.get(i).getEstado() instanceof Finalizado) {
			} else {
				listaSolicitud.remove(i);
			}
		}
		return listaSolicitud;
	}

	public void ingresarTramite(int index, Solicitud documento) {
		
		switch (index) {
		case 1:
			SolicitudActualizacionInformacionContribuyenteConexion
					.guardarJson((SolicitudActualizacionInformacionContribuyente) documento);
			break;
		case 2:
			SolicitudCertificadoUsoSueloConexion.guardarJson((SolicitudCertificadoUsoSuelo) documento);
			break;
		case 3:
			SolicitudLicenciaMunicipalFuncionamientoConexion
					.guardarJson((SolicitudLicenciaMunicipalFuncionamiento) documento);
			break;

		}
	}
}
