package ejemplostatic;

public class Bicicleta {
	private int numMarchas;
	private int diametroRueda;
	private int velocidad;
	private int id;
	
	

	//Variable estática
	//Compartida por todas las instancias
	private static int numeroDeBicicletas = 0;
	
	public Bicicleta(int numMarchas, int diametroRueda, int velocidad) {
		super();
		this.numMarchas = numMarchas;
		this.diametroRueda = diametroRueda;
		this.velocidad = velocidad;
		id = ++numeroDeBicicletas;
	}




	public int getNumMarchas() {
		return numMarchas;
	}



	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}



	public int getDiametroRueda() {
		return diametroRueda;
	}



	public void setDiametroRueda(int diametroRueda) {
		this.diametroRueda = diametroRueda;
	}



	public int getVelocidad() {
		return velocidad;
	}



	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public static int getNumeroDeBicicletas() {
		return numeroDeBicicletas;
	}



	public static void setNumeroDeBicicletas(int numeroDeBicicletas) {
		Bicicleta.numeroDeBicicletas = numeroDeBicicletas;
	}
	
	
	
	

}
