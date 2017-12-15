package com.cenfotec.proyecto;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import com.cenfotec.proyecto.documentos.ActualizacionInformacionContribuyente;
import com.cenfotec.proyecto.documentos.Documento;
import com.cenfotec.proyecto.documentos.Propiedad;
import com.cenfotec.proyecto.personas.FuncionarioMunicipal;
import com.cenfotec.proyecto.personas.Persona;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();
	}
	private static void run() {
		ObjectMapper mapper = new ObjectMapper();
		Persona persona =createDummyObjectPersona();
		Persona fran=null;
		try {
			// Convert object to JSON string and save into a file directly
			mapper.writeValue(new File("staff.json"), persona);
			File jsonFile = new File("staff.json");
			// Convert object to JSON string
			String jsonInString = mapper.writeValueAsString(persona);
			System.out.println(jsonInString);
			// Convert object to JSON string and pretty print
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(persona);
			System.out.println(jsonInString);
	
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			fran=mapper.readValue(jsonFile,Persona.class);
			System.out.println(fran.toString());

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static  Persona createDummyObjectPersona() { 
		String fecha="1992-07-02";
		LocalDate date=LocalDate.parse(fecha);
		Persona persona= new Persona ("Fracisco","115040529","Soltero",fecha,true);
		return persona;
	}
	
}
