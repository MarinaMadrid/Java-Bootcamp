package tema05ej01;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
	// Clase encargada de la entrada y salida del teclado
		static Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		
	public static void main(String[] args) {	
		System.out.println("EJERCICIO 1");
		int llueve = estadoTiempoLluvia();
		int paraguas = necesitaParaguas();
		comoActuarDiaLluvioso(llueve, paraguas);
		
		entrada.close();
	}

	
	public static int estadoTiempoLluvia() {
		System.out.println("¿Está lloviendo?: ");
		System.out.println("1 - Si / 2 - No");
		// Permite capturar lo que se escribe por teclado
		int llueve = entrada.nextInt();
		return llueve;
	}
	
	public static int necesitaParaguas() {
		System.out.println("¿Tienes paraguas?: ");
		System.out.println("1 - Si / 2 - No");
		// Permite capturar lo que se escribe por teclado
		int paraguas = entrada.nextInt();
		return paraguas;
	}
	
	public static void actuarParaguas(int paraguas) {
		if (paraguas == 1) {
			System.out.println("Coge el paraguas.");
		} else {
			System.out.println("Compra un paraguas.");
		}
	}
	
	public static void comoActuarDiaLluvioso(int llueve, int paraguas) {
		if (llueve == 2) {
			System.out.println("Vamos a la playa.");
		} else {
			actuarParaguas(paraguas);
		}
	}
}
