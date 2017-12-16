package com.cenfotec.proyecto.documentos.fabrica;

import com.cenfotec.proyecto.documentos.ActualizacionInformacionContribuyente;
import com.cenfotec.proyecto.documentos.CertificadoUsoSuelo;
import com.cenfotec.proyecto.documentos.IDocumento;
import com.cenfotec.proyecto.documentos.LicenciaMunicipalFuncionamiento;
import com.cenfotec.proyecto.documentos.propiedades.Propiedad;
import com.cenfotec.proyecto.documentos.tipos.TipoDocumento;

public final class FabricaDocumentos {
	public static IDocumento createCuenta(TipoDocumento popcion,String provincia, String distrito, String canton, String direccion, boolean estado, String estadoCivil,String fechaSolicitud, String fechaResolucion, Propiedad propiedad, String nombreDepartamento, String fechaVencimiento){
		switch(popcion){
			case Actualizacion:
				return new ActualizacionInformacionContribuyente(provincia, distrito, canton, direccion, estado, estadoCivil);
			case Certificado:
				return new CertificadoUsoSuelo(fechaSolicitud, fechaResolucion, propiedad, nombreDepartamento);
			case Licencia:
				return new LicenciaMunicipalFuncionamiento(fechaSolicitud, fechaResolucion, propiedad, fechaVencimiento);
		}
		return null;
	}
}
