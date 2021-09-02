package clasesUtiles;

public class Ejercicio4 {
	final static String FECHANACIMIENTO = "22-03-2012";
	final static String FECHANACIMIENTOAMERICANA = "03-22-2012";
	static int dia;
	static int mes;
	static int año;
	
	
	//Versión española
	public static void main(String[] args) {
		fechaSpain(args);
		System.out.println();
		fechaAmericana(args);
	}
	
	//Versión española
	public static void fechaSpain(String[] args) {
	dia = Integer.parseInt(FECHANACIMIENTO.split("-")[0]);
	mes = Integer.parseInt(FECHANACIMIENTO.split("-")[1]);
	año = Integer.parseInt(FECHANACIMIENTO.split("-")[2]);
	
	System.out.println("La fecha de nacimiento es: " + FECHANACIMIENTO);

	System.out.println("DIA: " + dia);
	System.out.println("MES: " + mes);
	System.out.println("AÑO: " + año);
	}
	
	
	//Versión americana
	public static void fechaAmericana(String[] args) {
		dia = Integer.parseInt(FECHANACIMIENTOAMERICANA.split("-")[1]);
		mes = Integer.parseInt(FECHANACIMIENTOAMERICANA.split("-")[0]);
		año = Integer.parseInt(FECHANACIMIENTOAMERICANA.split("-")[2]);
		
		System.out.println("La fecha de nacimiento es: " + FECHANACIMIENTOAMERICANA);

		System.out.println("DIA: " + dia);
		System.out.println("MES: " + mes);
		System.out.println("AÑO: " + año);
	}
}
