package Figuras;

public class Circulo extends Figura {

	// CAMPOS
	private float radio;

	// CONSTRUCTORES
	public Circulo() {}


	public Circulo(float radio, String color) {
		super(color);
		this.radio = 1;
	}

	// OTROS METODOS DE LA CLASE
	@Override
	public float calcularArea() {
		float resultado = (float) (Math.PI * radio * radio);
		return resultado;
	}
	
	@Override
	public String toString() {
		return "Circulo " + super.getColor() + " / Radio: " + radio
				+ " / Área: " + calcularArea();
	}

	// GETTER Y SETTERS
	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}
	
	public float getArea() {
		return calcularArea();
	}

}
