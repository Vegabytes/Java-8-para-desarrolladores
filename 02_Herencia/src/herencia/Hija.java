package herencia;

public class Hija extends Base{
	
	public Hija(String nombre, String apellidos) {
		super(nombre,apellidos);
	}
	
	
	public void metodo() {
		//System.out.println(this.nombre);
		System.out.println(this.getNombre());
		System.out.println(this.apellidos);
	}
	
	
}
