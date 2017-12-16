package com.cenfotec.proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cenfotec.proyecto.gestor.GestorPersona;
import com.cenfotec.proyecto.gestor.GestorSolicitud;
import com.cenfotec.proyecto.personas.Persona;
import com.cenfotec.proyecto.solicitud.Solicitud;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class ProyectoPatronesApplication {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPatronesApplication.class, args);
		try {
			login();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void login() throws IOException {
		// TODO Auto-generated method stub
		String usuario;
		String contrasenna;
		System.out.println("Ingrese su usuario:");
		usuario = in.readLine();
		System.out.println("Ingrese su contrasenna:");
		contrasenna = in.readLine();
		if(GestorPersona.verificarLogin(usuario,contrasenna)==true) {
			mostrarMenu();
		}
	}
	
	private static void mostrarMenu() {
		// TODO Auto-generated method stub
		int opcion = 0;
		System.out.println("1.Mostrar solicitudes abiertas.\n"
						 + "2.Mostrar solicitudes finalizadas.\n"
						 + "3.Salir.");
		try {
			opcion = Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			switch(opcion) {
			case 1:
				listarSolicitudes();
			break;
			case 2:
				listarSolicitudesTerminadas();
			break;
			default:
				System.out.println("Opcion no correcta.");
			break;
			}
		
	}
	
	private static void listarSolicitudes() {
		// TODO Auto-generated method stub
		ArrayList<Solicitud> solicitudes;
		solicitudes = GestorSolicitud.ListarTramites();
		int index = 0;
		for(Solicitud i: solicitudes) {
			System.out.println(index+"."+i.toString());
			index++;
		}
	}
	
	private static void listarSolicitudesTerminadas() {
		// TODO Auto-generated method stub
		ArrayList<Solicitud> solicitudes;
		int index = 0;
		solicitudes = GestorSolicitud.SelecionarTramitesTerminados();
		for(Solicitud i: solicitudes) {
			System.out.println(i.toString());
		}
		System.out.println("Digite el indice de la solicitud:");
		try {
			index = Integer.parseInt(in.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		solicitarSolicitud(index);
		
	}
	
	private static void solicitarSolicitud(int index) {
		// TODO Auto-generated method stub
		Solicitud solicitud = GestorSolicitud.SelecionarTramite(index);
		switch(solicitud.getEstado().toString()) {
		case "Aceptado":
			System.out.println("Este Tramite ha sido aceptado.");
			solicitud.finalizar();
		break;
		case "Notificado":
			
		break;
		case "Solicitado":
			System.out.println("Esta solicitud se encuentra en tramite.");
			solicitud=confirmar(solicitud);
		break;
		case "Verificado":
			
		break;
			
		}
	}
	
	private static Solicitud confirmar(Solicitud solicitud) {
		// TODO Auto-generated method stub
		int opcion = 0;
		System.out.println("1.Aceptar.\n"
						 + "2.Rechazar.\n"
						 + "3.Salir.");
		try {
			opcion = Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			switch(opcion) {
			case 1:
				solicitud.aceptar();
				return solicitud;
			case 2:
				solicitud.rechazar();
				return solicitud;
			default:
				System.out.println("Opcion no correcta.");
			break;
			}
		return null;
	}
}
