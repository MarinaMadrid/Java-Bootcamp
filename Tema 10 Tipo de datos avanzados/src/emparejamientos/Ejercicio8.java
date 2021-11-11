package emparejamientos;

import java.util.ArrayList;

public class Ejercicio8 {
	private static ArrayList<String> caja = new ArrayList<String>();
	private static ArrayList<String> emparejamiento = new ArrayList<String>();

	public static void main(String[] args) {
		addEquipos(caja);
		emparejarEquipos(caja, emparejamiento);
		System.out.println(emparejamiento.get(0) + " - " + emparejamiento.get(1));
		System.out.println(emparejamiento.get(2) + " - " + emparejamiento.get(3));
		System.out.println(emparejamiento.get(4) + " - " + emparejamiento.get(5));
		System.out.println(emparejamiento.get(6) + " - " + emparejamiento.get(7));
	}
	
	private static void addEquipos(ArrayList<String> equipos) {
		equipos.add("Italia");
		equipos.add("España");
		equipos.add("Alemania");
		equipos.add("Portugal");
		equipos.add("Inglaterra");
		equipos.add("Francia");
		equipos.add("Croacia");
		equipos.add("Irlanda");		
	}

	private static void emparejarEquipos(ArrayList<String> equipos, ArrayList<String> emparejamiento) {
		//Para no eliminar equipos de la lista oficial, se crea una copia de equipos donde se van borrar conforme van saliendo aleatoriamente
		ArrayList<String> disponiblesEquipos = new ArrayList<String>(equipos);
		
		//Se elige un equipo al azar
		for (int actualEquipo = 0;
				 actualEquipo < equipos.size();
				 actualEquipo++) {
			String aleatorioEquipo = seleccionarAleatorioEquipo(disponiblesEquipos);
			
			//Se añade en la lista emparejamiento
			emparejamiento.add(aleatorioEquipo);
			
			//Se elimina de la lista de equipos disponibles
			disponiblesEquipos.indexOf(aleatorioEquipo); //busca el índice del equipo aleatorio
			disponiblesEquipos.remove(aleatorioEquipo); 
		}
	}

	private static String seleccionarAleatorioEquipo (ArrayList<String> equipos) {
		int totalEquipos = equipos.size(); //obtiene el número de equipos totales
		int numeroAleatorioEquipo = (int)Math.round(Math.random()*(totalEquipos-1)); //saca un número al azar
		String aleatorioEquipo = equipos.get(numeroAleatorioEquipo); //nombre del equipo que ha salido al azar
		return aleatorioEquipo;		
	}

}
