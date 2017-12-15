package com.cenfotec.proyecto.documentos.conexiones;

import java.io.File;
import java.io.IOException;

import com.cenfotec.proyecto.documentos.CertificadoUsoSuelo;
import com.cenfotec.proyecto.documentos.Documento;
import com.cenfotec.proyecto.personas.Persona;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CertificadoUsoSueloConexion {
	
	public static void guardarJson(CertificadoUsoSuelo documento) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File("Json//CertificadoUsoSuelo.json"), documento);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static CertificadoUsoSuelo devolverObjecto() {
		ObjectMapper mapper = new ObjectMapper();
		File jsonFile = new File("Json//CertificadoUsoSuelo.json");
		CertificadoUsoSuelo doc=null;
		try {
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			doc=mapper.readValue(jsonFile,CertificadoUsoSuelo.class);;
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return doc;
	}
}
