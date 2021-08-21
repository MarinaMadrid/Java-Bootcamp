public class FacturaNegativaException extends Exception {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		FacturaNegativaException() {
	        super("No puedes crear una factura con importe negativo." +
	        		" Si deseas devolver dinero crea un Abono");
	    }

}
