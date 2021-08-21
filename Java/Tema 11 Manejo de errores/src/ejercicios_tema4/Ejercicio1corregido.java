package ejercicios_tema4;

import java.util.Scanner;

public class Ejercicio1corregido {
	public static Scanner Entrada;
	private static int numero1;
	private static int numero2;
	private static boolean operacion = true;

	public static void main(String[] ARGUMENTOS) {
		Entrada = new Scanner(System.in);
		try {
			System.out.print("Introduce el primer número: ");
			numero1 = Entrada.nextInt();
			System.out.print("Introduce el segundo número: ");
			numero2 = Entrada.nextInt();
		} catch (Exception exception) {
			System.out.println("Solo se puede introducir números.");
			operacion = false;
		} finally {
			Entrada.close();
		}

		if (operacion) {
			System.out.println("El resultado de sumar los números es: " + sumarNumeros(numero1, numero2));
			System.out.println("El resultado de restar los números es: " + restarNumeros(numero1, numero2));
			System.out.println("El resultado de multiplicar los números es: " + multiplicarNumeros(numero1, numero2));
			System.out.println("El resultado de dividir los números es: " + dividirNumeros(numero1, numero2));
		}
	}

	public static int sumarNumeros(int numero1, int numero2) {
		int total = numero1 + numero2;
		return total;
	}

	public static int restarNumeros(int numero1, int numero2) {
		int total = numero1 - numero2;
		return total;
	}

	public static int multiplicarNumeros(int numero1, int numero2) {
		int total = numero1 * numero2;
		return total;
	}

	public static  Object dividirNumeros(int numero1, int numero2) {
		try {int total = numero1 / numero2;
		return total;
		} catch (ArithmeticException exception) {
			System.out.println("No se puede dividir entre 0.");
			return null;
		}
	}
}
