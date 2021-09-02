package clasesUtiles;

import java.util.ArrayList;

public class Ejercicio7a {
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

		if (sacarDeLaCaja(lista, "Bilbao")) {
			System.out.println("Bilbao borrado");
		} else {
			System.out.println("Bilbao no encontrado");
		}
		
		System.out.println();
		System.out.println(lista);
	}

	public static boolean sacarDeLaCaja(ArrayList<String> caja, String elemento) {
		if (caja.isEmpty()) {
			return false;
		}
		boolean enLista = false;
		int indiceElementoEncontrado = caja.indexOf(elemento);
		
		if(indiceElementoEncontrado != -1) {
			caja.remove(indiceElementoEncontrado);
			enLista = true;
			return enLista;
		} else {
			return enLista;
		}
		
	}
	
}