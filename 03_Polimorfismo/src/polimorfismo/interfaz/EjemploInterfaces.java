package polimorfismo.interfaz;

public class EjemploInterfaces {

	public static void main(String[] args) {
		ClaseQueImplementaInterfaz c1 = new ClaseQueImplementaInterfaz();
		
		c1.saludar("Hola mundo");
		
		
		Hija c2 = new ClaseQueImplementaInterfaz();
		c2.saludar("Hola mundo, otra vez");
		
		Base c3 = new ClaseQueImplementaInterfaz();
		c3.saludar("Hola Mundo, por tercera vez");

	}

}
