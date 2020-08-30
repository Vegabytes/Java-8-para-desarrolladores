package equals;

import java.time.LocalDate;

public class EjemploEquals {

	public static void main(String[] args) {
		
		
		//Coche no tien implementado equals
		//Toma el comportamiento por defecto de object
		
		Coche mercedes = new Coche("Mercedes", "A200", "2.0 TDI");
		Coche volkswagen = new Coche("Volkswagen", "Passat", "2.0 TDI");
		Coche volkswagen2 = new Coche("Volkswagen", "Passat", "2.0 TDI");
		
		System.out.println(volkswagen.equals(volkswagen2));
		
		if(mercedes.equals(volkswagen)) System.out.println("Los dos coches son iguales");
		else System.out.println("Son diferentes");
		
		
		
		//Asignamos a las dos referencias el mismo objeto en memoria
		volkswagen = mercedes;
		
		System.out.println((mercedes.equals(volkswagen)) ? "Los dos coches son iguales" : "Son diferentes");
		
		System.out.println("Mercedes: " + mercedes);
		System.out.println("Volkswagen: " + volkswagen);
		
		volkswagen.setModelo("Golf");
		
		System.out.println((mercedes.equals(volkswagen)) ? "Los dos coches son iguales" : "Son diferentes");
		
		System.out.println("Mercedes: " + mercedes);
		System.out.println("Volkswagen: " + volkswagen);
		
		System.out.println("\n\n\n");
		
		
		//Persona sí tiene implementado el método equals
		Persona rafaNadal = new Persona("Rafael", "Nadal", LocalDate.of(1986, 6, 3));
		Persona otroRafaNadal = new Persona("Rafael", "Nadal", LocalDate.of(1986, 6, 3));
		Persona rogerFederer = new Persona("Roger", "Federer", LocalDate.of(1981, 8, 8));
		
		System.out.println((rafaNadal.equals(otroRafaNadal)) ? "Los dos jugadores son iguales" : "Son diferentes");
		System.out.println((rafaNadal.equals(rogerFederer)) ? "Los dos jugadores son iguales" : "Son diferentes");
		
		
		
	}

}
