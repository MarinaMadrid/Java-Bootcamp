package ejercicios_tema4;

import java.util.Scanner;

public class Ejercicio2corregido {
	public static Scanner Entrada;
	private static double radio;
	private static boolean operacion = true;

	public static double calcularVolumenEsfera(double radio) {
		double resultado = (4.0 / 3) * Math.PI * Math.pow(radio, 3);
		return resultado;
	}

	public static void main(String[] args) {
		Entrada = new Scanner(System.in);
		try {
			System.out.print("Introduzca radio de la esfera: ");
			radio = Entrada.nextDouble();
		} catch (Exception exception) {
			System.out.println("Solo se puede introducir números.");
			setOperacion(false);
		} finally {
			Entrada.close();
		}

		System.out.println("El volumen de la esfera con radio " + radio + " es " + calcularVolumenEsfera(radio));

	}

	public static boolean getOperacion() {
		return operacion;
	}

	public static void setOperacion(boolean operacion) {
		Ejercicio2corregido.operacion = operacion;
	}

}
