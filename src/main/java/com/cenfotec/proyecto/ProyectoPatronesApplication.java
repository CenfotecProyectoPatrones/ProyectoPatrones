package com.cenfotec.proyecto;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cenfotec.proyecto.personas.Persona;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class ProyectoPatronesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPatronesApplication.class, args);
		 run();
	}
	private static void run() {
		ObjectMapper mapper = new ObjectMapper();
		Persona persona =createDummyObjectPersona();
		Persona fran=null;
		try {
			// Convert object to JSON string and save into a file directly
			mapper.writeValue(new File("Json//admin.json"), persona);
			File jsonFile = new File("Json//admin.json");
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
		Persona persona= new Persona ("admin","12345","Soltero",fecha,true);
		return persona;
	}
	
}
