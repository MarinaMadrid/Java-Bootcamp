package Figuras;

public abstract class Figura {

	// CAMPOS
	private String color;

	// CONSTRUCTORES
	public Figura() {
		setColor("rojo");
	}

	public Figura(String color) {
		this.setColor(color);
	}

	// GETTER Y SETTERS
	public String getColor() {
		return color;
	}

	protected void setColor(String color) {
		this.color = color;
	}
	
	// MÉTODOS ABSTRACTOS
	public abstract String toString();
	
	public abstract float calcularArea();
	
	public abstract float getArea();
}
