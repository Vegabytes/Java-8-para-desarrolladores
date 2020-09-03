package set;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import modelo.Persona;

public class EjemploSet {

	public static void main(String[] args) {
		
		//Set<Persona> juntaDirectiva = new HashSet<>();
		//Set<Persona> juntaDirectiva = new TreeSet<>();
		Set<Persona> juntaDirectiva = new LinkedHashSet<>();
		
		juntaDirectiva.add(new Persona("46870920w", "Alejandro", "Castillo", LocalDate.of(1978, 6, 19)));
		juntaDirectiva.add(new Persona("y1234298v", "Sheilla", "Caballero", LocalDate.of(1985, 10, 01)));
		juntaDirectiva.add(new Persona("000", "Alexia", "Castillo", LocalDate.of(2017, 01, 17)));
		juntaDirectiva.add(new Persona("46870920w", "Alejandro", "Castillo", LocalDate.of(1978, 6, 19)));
		
		
		juntaDirectiva.forEach(System.out::println);

	}

}
