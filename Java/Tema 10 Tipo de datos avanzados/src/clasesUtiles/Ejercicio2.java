package clasesUtiles;

public class Ejercicio2 {
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
		int[] numeros = {1, 2, 3, 4, 5, 6};
		System.out.println("Los números del array son: ");
		for (int actualNumero = 0;
				actualNumero < numeros.length;
				actualNumero++) {
			System.out.println(numeros[actualNumero]);
		}
		
		System.out.println();
		
		String[] frasesQuijote = devolverFrases(DONQUIJOTE);
		System.out.println("Las frases del párrafo son: ");
		for (int actualFrase = 0;
				actualFrase < frasesQuijote.length;
				actualFrase++) {
			System.out.println(frasesQuijote[actualFrase].trim());
		}
		
		System.out.println();
		
	}
	
	// OBTENER ARRAY DE FRASES
	public static String[] devolverFrases(String texto) {
		return texto.split("[.]");
	}
}
