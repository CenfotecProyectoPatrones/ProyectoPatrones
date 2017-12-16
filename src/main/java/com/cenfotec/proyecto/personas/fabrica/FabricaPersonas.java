package com.cenfotec.proyecto.personas.fabrica;

import com.cenfotec.proyecto.personas.Contribuyente;
import com.cenfotec.proyecto.personas.FuncionarioMunicipal;
import com.cenfotec.proyecto.personas.Persona;
import com.cenfotec.proyecto.personas.tipo.TipoPersona;

public final class FabricaPersonas {
	public static Persona createPersona(TipoPersona popcion, String nombreCompleto, String cedulaIdentidad, String estadoCivil, String fechaNacimiento, boolean estado, String provincia, String distrito, String canton, String direccion, int numeroEmpleado, String nombreMiembro, String nombreDepartamento){
		switch(popcion){
			case Contribuyente:
				return new FuncionarioMunicipal(nombreCompleto, cedulaIdentidad, estadoCivil, fechaNacimiento, estado, numeroEmpleado, nombreMiembro, nombreDepartamento);
			case Funcionario:
				return new Contribuyente(nombreCompleto, cedulaIdentidad, estadoCivil, fechaNacimiento, estado, provincia, distrito, canton, direccion);
		}
		return null;
	}
}
