package com.cenfotec.proyecto.documentos.conexiones;

import java.io.File;
import java.io.IOException;

import com.cenfotec.proyecto.documentos.Documento;
import com.cenfotec.proyecto.documentos.LicenciaMunicipalFuncionamiento;
import com.cenfotec.proyecto.personas.Persona;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LicenciaMunicipalConexion {

	public static void guardarJson(LicenciaMunicipalFuncionamiento documento) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File("Json//LicenciaMunicipal.json"), documento);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static LicenciaMunicipalFuncionamiento devolverObjecto() {
		ObjectMapper mapper = new ObjectMapper();
		File jsonFile = new File("Json//LicenciaMunicipal.json");
		LicenciaMunicipalFuncionamiento doc=null;
		try {
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			doc=mapper.readValue(jsonFile,LicenciaMunicipalFuncionamiento.class);;
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
