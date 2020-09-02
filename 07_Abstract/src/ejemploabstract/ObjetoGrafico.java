package ejemploabstract;

public abstract class ObjetoGrafico {
	
	
	protected int x, y;

	public void mover(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	abstract public void dibujar();
	abstract public void cambiarTamanio(int factorAumento);
	

}
