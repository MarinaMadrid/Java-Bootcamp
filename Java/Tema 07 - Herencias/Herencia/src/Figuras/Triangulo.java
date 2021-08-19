package Figuras;

public class Triangulo extends Figura {

	// CAMPOS
	private float base;
	private float altura;

	// CONSTRUCTORES
	public Triangulo() {
		super();
		this.base = 1;
		this.altura = 2;
	}

	public Triangulo(int base, int altura, String color) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	// OTROS METODOS DE LA CLASE
	@Override
	public float calcularArea() {
		float resultado = base * altura / 2;
		return resultado;
	}
	
	@Override
	public String toString() {
		return "Triángulo " + super.getColor() + " / Base: " + base
				+ " / Altura: " + altura + " / Área: " + calcularArea();
	}

	// GETTER Y SETTERS
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
	
	public float getArea() {
		return calcularArea();
	}
	
}
