package com.cenfotec.proyecto.solicitud.fabrica;

import com.cenfotec.proyecto.documentos.IDocumento;
import com.cenfotec.proyecto.solicitud.Solicitud;
import com.cenfotec.proyecto.solicitud.SolicitudActualizacionInformacionContribuyente;
import com.cenfotec.proyecto.solicitud.SolicitudCertificadoUsoSuelo;
import com.cenfotec.proyecto.solicitud.SolicitudLicenciaMunicipalFuncionamiento;
import com.cenfotec.proyecto.solicitud.tipo.TipoSolicitud;

public final class FabricaSolicitudes {
	public static Solicitud createCuenta(TipoSolicitud popcion, IDocumento pdocumento){
		switch(popcion){
			case Actualizacion:
				return new SolicitudActualizacionInformacionContribuyente(pdocumento);
			case Certificado:
				return new SolicitudCertificadoUsoSuelo(pdocumento);
			case Licencia:
				return new SolicitudLicenciaMunicipalFuncionamiento(pdocumento);
		}
		return null;
	}
}
