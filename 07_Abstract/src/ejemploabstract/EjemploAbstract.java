package ejemploabstract;

public class EjemploAbstract {
	
	public static void main(String[] args) {
		//Imposible instanciar la clase abstracta
		//ObjetoGrafico o = new ObjetoGrafico();
		
		Circulo c = new Circulo(1, 1, 7);
		
		c.dibujar();
		c.mover(3, 4);
		c.cambiarTamanio(2);
		c.dibujar();
		
		
		
		//Popdemos usar el Círculo con una referencia de tipo Objeto Grafico
		ObjetoGrafico o = c;
		
		o.dibujar();
		
	}
	

}
