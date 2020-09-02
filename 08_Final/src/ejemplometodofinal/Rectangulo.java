package ejemplometodofinal;

public class Rectangulo {
	
	private float base;
	private float altura;
	
	
	
	public Rectangulo(float base, float altura) {
		super();
		this.base = base;
		this.altura = altura;
	}



	public float getBase() {
		return base;
	}



	public void setBase(float base) {
		this.base = base;
	}



	public float getAltura() {
		return altura;
	}



	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	final public float getArea() {
		System.out.println("Area de un rectángulo");
		return this.base * this.altura;
	}
	
	
	public float getPerimetro() {
		System.out.println("Perímetro de un rectángulo");
		return (this.base * 2) + (this.altura * 2);
	}



	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}
	
	
	

}

