package com.cenfotec.proyecto.personas.fabrica;

import com.cenfotec.proyecto.personas.Contribuyente;
import com.cenfotec.proyecto.personas.FuncionarioMunicipal;
import com.cenfotec.proyecto.personas.Persona;
import com.cenfotec.proyecto.personas.tipo.TipoPersona;

public final class FabricaPersonas {
	public static Persona createPersona(TipoPersona popcion){
		switch(popcion){
			case Contribuyente:
				return new FuncionarioMunicipal();
			case Funcionario:
				return new Contribuyente();
		}
		return null;
	}
}
