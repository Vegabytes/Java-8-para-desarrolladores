package ejemplobasico;

public class EjemploPar {

	public static void main(String[] args) {
		Par<Integer,String> pareja1 = new Par<>(1, "UNO");
		
		System.out.println(pareja1);
		
		//pareja1.setObj1("Hola");
		
		Par<String,String> pareja2 = new Par<>("Hola", "Mundo");
		System.out.println(pareja2);

	}

}
