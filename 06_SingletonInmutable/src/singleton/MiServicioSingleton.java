package singleton;

public class MiServicioSingleton {
	
	private String atributo;
	
	
	//Una instancia del objeto que va a existir
	private static MiServicioSingleton instance = null;
	
	
	//Evitamos así la instanciación directa siendo private
	private MiServicioSingleton() {}
	
	
	public static MiServicioSingleton getInstance() {
		if(instance == null) instance = new MiServicioSingleton();
		
		return instance;
	}


	public String getAtributo() {
		return atributo;
	}


	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}


	

}
