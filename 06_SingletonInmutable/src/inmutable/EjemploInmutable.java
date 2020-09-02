package inmutable;

import java.time.LocalDate;

public class EjemploInmutable {

	public static void main(String[] args) {
		
		PersonaInmutable yo = new PersonaInmutable("Alejandro", "Castillo", LocalDate.of(1978, 6, 19));
		
		
		//No tenemos forma de modificar las propiedades
		//Solo de acceder a ellas en modo lectura
		
		System.out.printf("%s %s (%s)", yo.getNombre(), yo.getApellidos(), yo.getFechaNacimiento());
	}

}
