package Figuras;


public class Cuadrado extends Rectangulo {
		
	int lado;
	//CONSTRUCTORES
	public Cuadrado(){
		super();
		this.lado = 1;
	}
	
	
	
	//METODOS DE CLASE
	
	public Cuadrado(int lado, String color) {
		super(lado, lado, color);
	}
	
	@Override
	public float calcularArea(){
		return lado*lado;
	}
	
	@Override
	public String toString() {
		return "Cuadrado " + super.getColor() + " / Lado: " + lado
				+ " / Área: " + calcularArea();
	}
	
	
	//GETTER Y SETTERS
	public float getLado() {
		return super.getBase();
	}

	public void setLado(float lado) {
		super.setBase(lado);
		super.setAltura(lado);
	}	
	
	public float getArea() {
		return super.getArea();
	}
}
