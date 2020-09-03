package list;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import modelo.Persona;

public class EjemploList {

	public static void main(String[] args) {
		
		List<Persona> listaPersonas = new ArrayList<>();
		
		
		listaPersonas.add(new Persona("46870920w", "Alejandro", "Castillo", LocalDate.of(1978, 6, 19)));
		listaPersonas.add(new Persona("y1234298v", "Sheilla", "Caballero", LocalDate.of(1985, 10, 01)));
		listaPersonas.add(new Persona("000", "Alexia", "Castillo", LocalDate.of(2017, 01, 17)));
		listaPersonas.add(new Persona("46870920w", "Alejandro", "Castillo", LocalDate.of(1978, 6, 19)));
		
		
		listaPersonas.forEach(System.out::println);
		
		
		Persona p = listaPersonas.get(1);
		System.out.println(p);
		
		
		listaPersonas.set(1, new Persona("y1234298v", "Katty", "Caballero", LocalDate.of(1985, 10, 1)));
		
		//listaPersonas.set(3, new Persona("1111", "Julen", "Caballero", LocalDate.of(2018, 11, 1)));
		for (Persona persona : listaPersonas) {
			System.out.println(persona);
		}
		
		
		listaPersonas.sort(new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				return -o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
			}
			
		});
		
		System.out.println("\n\n\n");
		for (Persona persona : listaPersonas) {
			System.out.println(persona);
		}
		

	}

}
