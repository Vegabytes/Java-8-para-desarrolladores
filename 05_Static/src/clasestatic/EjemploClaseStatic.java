package clasestatic;

public class EjemploClaseStatic {

	public static void main(String[] args) {
		
		Persona p = new Persona("Pepe");
		System.out.println(p);
		
		
		//Trabajaremos esto en profundidad en capítulos posteriores
		OtraClase o = new EjemploClaseStatic().new OtraClase("Alex");
		System.out.println(o);

	}
	
	
	public static class Persona {
		
		private String nombre;
		
		public Persona(String nombre) {
			this.nombre = nombre;
		}

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + "]";
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		
		
	}
	
	
	public class OtraClase {
		private String atributo;
		
		public OtraClase(String atributo) {
			this.atributo = atributo;
		}

		@Override
		public String toString() {
			return "OtraClase [atributo=" + atributo + "]";
		}
		
		
	}

}
