package clasesUtiles;

public class Ejercicio6 {
	static int[][] matriz2 = {{1, 12, 3, 4}, {5, 16}, {7, 15, 9, 10, 7, 0}, {-1}};

	public static void main(String[] args) {
		System.out.println("El mayor número de la matriz es: "+ devolverMayor(matriz2));
	}
	

	// MOSTRAR EL MAYOR ELEMENTO
	public static int devolverMayor (int [][] array) {
		int mayorNumero = 0;
		for (int PosicionColumna = 0;
				 PosicionColumna < array.length;
				 PosicionColumna++) {
				 for (int PosicionFila = 0;
						  PosicionFila < array[PosicionColumna].length;
						  PosicionFila++) {
					if (array[PosicionColumna][PosicionFila] > mayorNumero) 
					{mayorNumero = array[PosicionColumna][PosicionFila];
					};
				}
			}
		return mayorNumero;
	}
}
