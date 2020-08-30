package encapsulacion;

import java.time.LocalDate;

import encapsulacion.modelo.Persona;
import encapsulacion.servicio.Servicio;

public class MainEncapsulacion {

	public static void main(String[] args) {
		Persona p = new Persona("46870920", "Alejandro", "Castillo", LocalDate.of(1980, 1, 1));
		Servicio s = new Servicio();
		
		
		s.addPersona(p);
		
		
		//Usaríamos métodos estáticos de utils

	}

}
