package com.cenfotec.proyecto.documentos.fabrica;

import com.cenfotec.proyecto.documentos.ActualizacionInformacionContribuyente;
import com.cenfotec.proyecto.documentos.CertificadoUsoSuelo;
import com.cenfotec.proyecto.documentos.IDocumento;
import com.cenfotec.proyecto.documentos.LicenciaMunicipalFuncionamiento;
import com.cenfotec.proyecto.documentos.tipos.TipoDocumento;

public final class FabricaDocumentos {
	public static IDocumento createCuenta(TipoDocumento popcion){
		switch(popcion){
			case Actualizacion:
				return new ActualizacionInformacionContribuyente();
			case Certificado:
				return new CertificadoUsoSuelo();
			case Licencia:
				return new LicenciaMunicipalFuncionamiento();
		}
		return null;
	}
}
