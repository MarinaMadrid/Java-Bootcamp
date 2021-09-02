package clasesUtiles;

public class Ejercicio5 {
	static double[][] matriz = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9, 10, 11, 12}, {13}};
	//El primer número se encuentra en [0][0]
	//El último número se encuentra en [3][0]
	
	public static void main(String[] args) {
		System.out.println("Los números extraídos de la matriz son : ");
		mostrarNumeros(matriz);
	}
	
	public static void mostrarNumeros(double[][] array) {
		//Columnas
		for (int PosicionColumna = 0;
				 PosicionColumna < array.length; 
				 PosicionColumna++) {
				//Filas
				for (int PosicionFila = 0; 
						 PosicionFila < array[PosicionColumna].length;
						 PosicionFila++) {
					//Imprime el elemento[columna][fila]
					System.out.println(array[PosicionColumna][PosicionFila]);
				}
			}
	}
}
