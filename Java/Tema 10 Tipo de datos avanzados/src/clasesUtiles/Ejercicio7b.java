package clasesUtiles;

import java.util.ArrayList;

public class Ejercicio7b {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Madrid");
		lista.add("Valencia");
		lista.add("Barcelona");
		lista.add("Sevilla");
		lista.add("Bilbao");
		lista.add("Valencia");
		lista.add("Bilbao");
		lista.add("Bilbao");

		System.out.println(lista);
		System.out.println();

		int repeticiones = sacarDeLaCaja(lista, "Bilbao");
		resultadoBusqueda("Bilbao", repeticiones);
		
		System.out.println();
		System.out.println(lista);
	}

	public static int sacarDeLaCaja(ArrayList<String> caja, String elemento) {
		if (caja.isEmpty()) {
			return 0;
		}

		int vecesRepetida = 0;

		for (int actualPosicionProvincias = caja.size(); 
				 actualPosicionProvincias > 0; 
				 actualPosicionProvincias--) {
			if (caja.get(actualPosicionProvincias - 1).equals(elemento)) {
				caja.remove(actualPosicionProvincias - 1);
				vecesRepetida++;
			}
		}
		return vecesRepetida;
	}

	// Imprime cuántas veces se repite
	private static void resultadoBusqueda(String elemento, int vecesRepetida) {
		if (vecesRepetida == 0) {
			System.out.println("La provincia de " + elemento + " no se encuentra en la lista.");
		} else if (vecesRepetida == 1) {
			System.out.println("La provincia de " + elemento + " se ha borrado solo una vez de la lista.");
		} else {
			System.out.println("La provincia de " + elemento + " se ha borrado " + vecesRepetida + " veces de la lista.");
		}
	}
}
