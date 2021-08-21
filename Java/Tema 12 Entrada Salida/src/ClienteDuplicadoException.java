public class ClienteDuplicadoException extends Exception {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		ClienteDuplicadoException(String nombre) {
	        super("No se encuentra el cliente " + nombre);
	    }
}

