package ejercicios_tema5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3corregido {
	// Clase encargada de la entrada y salida del teclado
		static Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		private static int num1;
		private static int num2;
		
	public static void main(String[] args) {
		int repiticion = 0;
		int resultado = 0;
		try {
			System.out.println("EJERCICIO 3");
			System.out.println("Escribe un n�mero: ");
			num1 = entrada.nextInt();
			System.out.println("Escribe otro n�mero: ");
			num2 = entrada.nextInt();
		} catch (Exception exception) {
			System.out.println("Solo se puede introducir números.");
		} finally {
			entrada.close();
		}
		
		do {
			resultado =  resultado + num1;
		    ++repiticion;
		} while (repiticion != num2);

		System.out.println("El resultado es: "+ resultado);
	}

}
