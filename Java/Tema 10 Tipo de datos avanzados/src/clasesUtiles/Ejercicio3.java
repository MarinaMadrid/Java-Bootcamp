package clasesUtiles;
import java.text.Normalizer;

public class Ejercicio3 {
	final static String DONQUIJOTE = "En un lugar de la Mancha, de cuyo nombre "
			+ "no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los "
			+ "de lanza en astillero adarga antigua, rocín flaco y galgo corredor. "
			+ "Una olla de algo más vaca que carnero, salpicón las más noches, duelos"
			+ " y quebrantos los sábados, lantejas los viernes, algún palomino de "
			+ "añadidura los domingos, consumían las tres partes de su hacienda."
			+ " El resto della concluían sayo de velarte, calzas de velludo para "
			+ "las fiestas, con sus pantuflos de lo mesmo, y los días de entresemana "
			+ "se honraba con su vellorí de lo más fino.";

	public static void main(String[] args) {
		String palabraRepetida = "de";
		
		resultadoBusqueda(palabraRepetida, repeticionesDePalabra(DONQUIJOTE,palabraRepetida));
		
		palabraRepetida = "Mancha";
		
		resultadoBusqueda(palabraRepetida,repeticionesDePalabra(DONQUIJOTE,palabraRepetida));
	}
	
	
	//Limpieza del texto de caracteres especiales como comas, tildes, signos de puntuación
	public static String limpiarTexto(String texto) {
		String textoLimpio = null;
	    if (texto != null) {
	        String textoALimpiar = texto;
	        textoALimpiar = textoALimpiar.toUpperCase(); //lo pone en mayúsculas
	        // Elimina acentos, dieresis, cedillas y tildes
	        textoLimpio = Normalizer.normalize(textoALimpiar, Normalizer.Form.NFD);
	        // Quitar caracteres no ASCII excepto los signos interrogacion, exclamacion, con dieresis, acentos, etc
	        /*
	         * u303: ~
	         * u00A1: ¡
	         * uFF01: !
	         * u00BF: ¿
	         * uFF1F: ?
	         * u0308: ¨
	         * u003B: ;
	         * u003A: :
	         * u002C: ,
	         * u002E: .
	         * u0301: ´
	         * u00E0: `
	         * */
	        textoLimpio = textoLimpio.replaceAll("[^\\p{ASCII}(E\u0303)(\u00A1)(\\uFF01)(\u00BF)(\uFF1F)(E\u0308)(\u003B)(\u003A)(\u002C)(\u002E)(E\u0301)(E\u00E0)(A\u0303)(A\u0308)(A\u0301)(A\u00E0)]", "");
	    }
		return textoLimpio;
	}
	
	//Devuelve las veces que se repite la palabra
	public static int repeticionesDePalabra(String texto, String palabra) {
		String textoLimpio = limpiarTexto(texto);
		String[] textoLimpioSinEspacios = textoLimpio.split(" "); //quita espacios
		int vecesRepetida = 0;
		for (int palabraActual = 0; palabraActual < textoLimpioSinEspacios.length; palabraActual++) {
			if (textoLimpioSinEspacios[palabraActual].replaceAll("[^a-zA-Z0-9]","").equals(palabra.toUpperCase())) {
				vecesRepetida++;
			}
		}
		return vecesRepetida;
	}
	
	//Imprime cuántas veces se repite
	private static void resultadoBusqueda(String palabraRepetida, int vecesRepetida) {
		if (vecesRepetida == 0) {
			System.out.println("La palabra " + palabraRepetida + " no se encuentra en el texto.");
		} else if (vecesRepetida == 1) {
			System.out.println("La palabra " + palabraRepetida + " se encuentra solo una vez en el texto.");
		} else {
			System.out.println("La palabra " + palabraRepetida + " se encuentra " + vecesRepetida + " veces en el texto.");
		}
		
	}
}

