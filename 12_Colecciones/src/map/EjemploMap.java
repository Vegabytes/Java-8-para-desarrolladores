package map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import modelo.Persona;

public class EjemploMap {

	public static void main(String[] args) {
		
		Map<String,Persona> agenda = new HashMap<>();
		
		agenda.put("101", new Persona("46870920w", "Alejandro", "Castillo", LocalDate.of(1978, 6, 19)));
		agenda.put("93", new Persona("y1234298v", "Sheilla", "Caballero", LocalDate.of(1985, 10, 01)));
		agenda.put("43", new Persona("000", "Alexia", "Castillo", LocalDate.of(2017, 01, 17)));
		agenda.put("83", new Persona("46870920w", "Alejandro", "Castillo", LocalDate.of(1978, 6, 19)));
		
		agenda.put("83", new Persona("46870920w", "Alejandro", "Castillo", LocalDate.of(1978, 6, 19)));
		
		
		for (String s : agenda.keySet()) {
			System.out.println(agenda.get(s));
		}


	}

}
