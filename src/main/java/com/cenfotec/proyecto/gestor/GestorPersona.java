package com.cenfotec.proyecto.gestor;

import java.io.File;
import java.io.IOException;

import javax.imageio.IIOException;

import com.cenfotec.proyecto.personas.Persona;
import com.cenfotec.proyecto.personas.conexiones.PersonaConexion;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GestorPersona {

	public static boolean verificarLogin(String usuario, String contrasenna) {
		// TODO Auto-generated method stub
		Persona admin=null;
		admin=PersonaConexion.devolverObjecto();
		if(admin.getNombreCompleto().equals(usuario)) {
			if(admin.getCedulaIdentidad().equals(contrasenna)) {
				return true;
			}
		}
		return false;
	}
}
