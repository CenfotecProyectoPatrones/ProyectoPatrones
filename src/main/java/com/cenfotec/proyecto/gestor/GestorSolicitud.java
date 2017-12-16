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
<<<<<<< HEAD
	public ArrayList<Solicitud> ListaTramites() {
=======

	public ArrayList<Solicitud> ListaTramites() 
	{
>>>>>>> cbd6473fba4d81bdbee602fe6edc56970ad9e2fe
		Rechazado rech = null;
		Finalizado fin = null;
		SolicitudActualizacionInformacionContribuyente SAIC = SolicitudActualizacionInformacionContribuyenteConexion
				.devolverObjecto();
		SolicitudCertificadoUsoSuelo SUS = SolicitudCertificadoUsoSueloConexion.devolverObjecto();
		SolicitudLicenciaMunicipalFuncionamiento SMF = SolicitudLicenciaMunicipalFuncionamientoConexion
				.devolverObjecto();
		ArrayList<Solicitud> listaSolicitud = new ArrayList<Solicitud>();
<<<<<<< HEAD
=======

>>>>>>> cbd6473fba4d81bdbee602fe6edc56970ad9e2fe
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
<<<<<<< HEAD
=======

>>>>>>> cbd6473fba4d81bdbee602fe6edc56970ad9e2fe
		ArrayList<Solicitud> Tramites = ListaTramites();
		Solicitud tramite = Tramites.get(index);
		return tramite;
	}

	public ArrayList<Solicitud> SelecionarTramitesTerminados() {
<<<<<<< HEAD
=======

>>>>>>> cbd6473fba4d81bdbee602fe6edc56970ad9e2fe
		Rechazado rech = null;
		Finalizado fin = null;
		SolicitudActualizacionInformacionContribuyente SAIC = SolicitudActualizacionInformacionContribuyenteConexion
				.devolverObjecto();
		SolicitudCertificadoUsoSuelo SUS = SolicitudCertificadoUsoSueloConexion.devolverObjecto();
		SolicitudLicenciaMunicipalFuncionamiento SMF = SolicitudLicenciaMunicipalFuncionamientoConexion
				.devolverObjecto();
		ArrayList<Solicitud> listaSolicitud = new ArrayList<Solicitud>();
<<<<<<< HEAD
=======
		
>>>>>>> cbd6473fba4d81bdbee602fe6edc56970ad9e2fe
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
<<<<<<< HEAD
=======
		
>>>>>>> cbd6473fba4d81bdbee602fe6edc56970ad9e2fe
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
