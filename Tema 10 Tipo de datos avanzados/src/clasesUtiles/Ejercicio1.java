package clasesUtiles;

public class Ejercicio1 {
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
		int numeroCaracteres = cantidadDeCaracteres(DONQUIJOTE);
		System.out.println("El número de carácteres de este fragmento es: " + numeroCaracteres);
	}
	
	// OBTENER TOTAL DE CARACTERES
	public static int cantidadDeCaracteres(String texto) {
		int numeroCaracteres = texto.length();
		return numeroCaracteres;
	}

}
