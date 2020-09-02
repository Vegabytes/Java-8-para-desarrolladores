package ejemplostatic;

public class Estaticos {

	
	public static void main(String[] args) {
		Bicicleta b1 = new Bicicleta(21, 27, 0);
		Bicicleta b2 = new Bicicleta(18, 24, 0);
		
		
		System.out.println(b1.getId());
		System.out.println(b2.getId());
		
		
		System.out.printf("Número total de bicis: %d", b1.getNumeroDeBicicletas());
	}
	
	
}
