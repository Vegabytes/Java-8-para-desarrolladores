package ejemploabstractinterface;

public abstract class ObjetoGrafico implements Transformable{
	
	protected int x, y;
	
	public void moverA(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	abstract public void dibujar();
	abstract public void cambiarTamanio(int factorAumento);

}
