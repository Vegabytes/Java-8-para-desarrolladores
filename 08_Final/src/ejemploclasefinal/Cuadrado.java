package ejemploclasefinal;

public final class Cuadrado extends Rectangulo{

	public Cuadrado(float lado) {
		super(lado, lado);
	}
	
	public void setLado(float lado) {
		setBase(lado);
	}
	
	
	public float getLado() {
		return getBase();
	}
	
	
	public float getArea() {
		System.out.println("Area de un cuadrado");
		return getBase() * getBase();
	}
	
	public float getPerimetro() {
		System.out.println("Perímetro de un cuadrado");
		return getBase() * 4;
	}
	
	

}
