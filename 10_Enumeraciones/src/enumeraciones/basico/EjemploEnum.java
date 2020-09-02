package enumeraciones.basico;

public class EjemploEnum {

	public static void main(String[] args) {
		
		saludaSegunDia(DiaSemana.LUNES);
		saludaSegunDia(DiaSemana.VIERNES);
		saludaSegunDia(DiaSemana.SABADO);
		saludaSegunDia(DiaSemana.DOMINGO);

	}
	
	
	
	public static void saludaSegunDia(DiaSemana d) {
		switch (d) {
		case LUNES: {
			System.out.println("Los lunes son duros");
			break;
		}
		case VIERNES: {
			System.out.println("Los viernes son mejores");
			break;
		}
		case SABADO:
		case DOMINGO: {
			System.out.println("Los findes son los mejores días");
			break;
		}
		
	}

}
	
}
