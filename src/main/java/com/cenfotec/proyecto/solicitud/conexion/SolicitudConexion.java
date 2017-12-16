package com.cenfotec.proyecto.solicitud.conexion;

import java.io.File;
import java.io.IOException;

import com.cenfotec.proyecto.documentos.ActualizacionInformacionContribuyente;
import com.cenfotec.proyecto.documentos.Documento;
import com.cenfotec.proyecto.personas.Contribuyente;
import com.cenfotec.proyecto.personas.Persona;
import com.cenfotec.proyecto.solicitud.Solicitud;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SolicitudConexion {

	public static void guardarJson(Solicitud documento) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File("Json//Solicitud.json"), documento);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Solicitud devolverObjecto() {
		ObjectMapper mapper = new ObjectMapper();
		File jsonFile = new File("Json//Solicitud.json");
		Solicitud doc=null;
		try {
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			doc=mapper.readValue(jsonFile,Solicitud.class);;
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
