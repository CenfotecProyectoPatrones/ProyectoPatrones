package com.cenfotec.proyecto.solicitud.fabrica;

import com.cenfotec.proyecto.documentos.IDocumento;
import com.cenfotec.proyecto.solicitud.Solicitud;
import com.cenfotec.proyecto.solicitud.SolicitudActualizacionDatosContribuyente;
import com.cenfotec.proyecto.solicitud.SolicitudCertificadoUsoSuelos;
import com.cenfotec.proyecto.solicitud.SolicitudLicenciaMunicipalFuncionamiento;
import com.cenfotec.proyecto.solicitud.tipo.TipoSolicitud;

public final class FabricaCuentas {
	public static Solicitud createCuenta(TipoSolicitud popcion, IDocumento pdocumento){
		switch(popcion){
			case Actualizacion:
				return new SolicitudActualizacionDatosContribuyente(pdocumento);
			case Certificado:
				return new SolicitudCertificadoUsoSuelos(pdocumento);
			case Licencia:
				return new SolicitudLicenciaMunicipalFuncionamiento(pdocumento);
		}
		return null;
	}
}
