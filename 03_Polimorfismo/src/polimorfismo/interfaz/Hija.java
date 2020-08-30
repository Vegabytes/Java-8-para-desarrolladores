package polimorfismo.interfaz;

public interface Hija extends Base{
	default public void saludar(String mensaje) {
		System.out.println(mensaje + " desde Hija");
	}
}
