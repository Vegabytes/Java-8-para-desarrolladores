package singleton;

public class UsoSingleton {
	
	public static void main(String[] args) {
		
		
		//NO podemos instanciar directamente
		//MiServicioSingleton ser1 = new MiServicioSingleton();
		
		
		//Creamos dos referencias, pero una sola instancia
		MiServicioSingleton ser2 = MiServicioSingleton.getInstance();
		MiServicioSingleton ser3 = MiServicioSingleton.getInstance();
		
		
		//Podemos comprobar que la dirección de la misma es la misma
		System.out.println(ser2);
		System.out.println(ser3);
		
		
		//Si cambiamos un atributo a través de una referencia
		ser2.setAtributo("Hola");
		
		//Podemos visualizarlo desde la otra
		System.out.println(ser3);
	}

}
