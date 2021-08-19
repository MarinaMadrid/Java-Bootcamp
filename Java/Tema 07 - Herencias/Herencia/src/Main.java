import java.util.Locale;
import java.util.Scanner;

import Figuras.Circulo;
import Figuras.Cuadrado;
import Figuras.Figura;
import Figuras.Rectangulo;
import Figuras.Triangulo;

public class Main {

	// Clase encargada de la entrada y salida del teclado
	static Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

	public static void main(String[] args) {

		int operacion;
		boolean salir = false;

		// CREAR OBJETOS
		// RELLENAR
		Rectangulo rec = new Rectangulo();
		Triangulo tri = new Triangulo();
		Cuadrado cua = new Cuadrado();
		Circulo cir = new Circulo();

		while (!salir) {
			System.out
					.println("\nElige el tipo de figura que quieres consultar: ");
			System.out
					.println(" 1 - Rectángulo / 2 - Círculo / 3 - Triángulo / 4 - Cuadrado / 5 - Comparar"
							+ " / 6 - Salir");
			// Permite capturar lo que se escribe por teclado y lo deja en la
			// variable operaci�n.
			operacion = entrada.nextInt();

			switch (operacion) {
			case 1:
				System.out.println(rec.toString());
				break;

			case 2:
				System.out.println(cir.toString());
				break;

			case 3:
				System.out.println(tri.toString());
				break;

			case 4:
				System.out.println(cua.toString());
				break;

			case 5:
				System.out.println("\nElige la figura que deseas comparar: ");
				System.out.println(" 1 - Rectángulo / 2 - Círculo / 3 - Triángulo / 4 - Rectángulo");
				int caso1 = entrada.nextInt();
				Figura figura1 = elegirFigura(caso1);
				
				System.out.println("\nElige otra figura: ");
				System.out.println(" 1 - Rectángulo / 2 - Círculo / 3 - Triángulo / 4 - Rectángulo");
				int caso2 = entrada.nextInt();
				Figura figura2 = elegirFigura(caso2);
				
				if (compararAreasFiguras(figura1, figura2)) {
					System.out
							.println("La primera figura es más grande que la segunda");
				} else {
					System.out
							.println("La segunda figura es más grande o igual que la primera");
				}

				break;
			case 6:
				System.out.println("Bye bye");
				salir = true;
				break;
			default:
				System.out.println("Seleccione otra operación");
				
			}
		}

	}

	public static boolean compararAreasFiguras(Figura figura1, Figura figura2) {
		  return figura1.getArea() > figura2.getArea();
		}

	public static boolean compararRectanguloConLimite(Rectangulo rect, int lim) {
		return rect.getArea() > lim;
	}
	
	public static Figura elegirFigura(int caso) {
		switch (caso) {
		case 1: 
			Rectangulo rec = new Rectangulo();
			Figura figura = rec; 
			return figura;
		case 2:
			Circulo cir = new Circulo();
			Figura figura1 = cir;
			return figura1;
		case 3:
			Triangulo tri = new Triangulo();
			Figura figura2 = tri;
			return figura2;
		case 4:
			Cuadrado cua = new Cuadrado();
			Figura figura3 = cua;
			return figura3;
		default:
			System.out.println("Seleccione una opción válida");
			return null;
		}

	}

}