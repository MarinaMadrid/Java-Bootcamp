import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GestionFacturas {
	Log log;

	public GestionFacturas() {
		log = new Log();
	}

	// CARGAR DATOS
	// Clientes
	public void cargarClientes(ArrayList<String> lista) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("datos/clientes.txt"));
		String texto;
		while ((texto = bf.readLine()) != null) {
			lista.add(texto);
		}
		bf.close();
		log.escribirEnLog("Clientes cargados");
	}
	
	//Facturas
	public void cargarFacturas(ArrayList<Factura> lista) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("datos/facturas.txt"));
		String texto;
		while ((texto = bf.readLine()) != null) {
			lista.add(obtenerFactura(texto));
		}
		bf.close();
		log.escribirEnLog("Facturas cargadas");
	}

	// GUARDAR DATOS
	private String crearEstructuraFactura(Factura factura){
		String codigo = factura.getCodigo();
		String cliente = factura.getCliente();
		String descuento = String.valueOf(factura.getDescuento());
		String importe = String.valueOf(factura.getImporte());
		return codigo + "/" + cliente + "/" + descuento + "/" + importe;
	}
	
	public void guardarDatos(ArrayList<String> clientes, ArrayList<Factura> facturas) throws IOException {
		FileWriter ficheroClientes = new FileWriter("datos/clientes.txt", true);
		PrintWriter printWriterClientes = new PrintWriter(ficheroClientes, false);
		for (int actualCliente = 0;
				actualCliente < clientes.size();
				actualCliente++) {
			printWriterClientes.println(clientes.get(actualCliente));
		}
		printWriterClientes.close();
		
		FileWriter ficheroFacturas = new FileWriter("datos/facturas.txt", true);
		PrintWriter printWriterFacturas = new PrintWriter(ficheroFacturas, false);
		for (int actualFactura = 0;
				actualFactura < facturas.size();
				actualFactura++) {
			printWriterFacturas.println(crearEstructuraFactura(facturas.get(actualFactura)));
		}
		printWriterFacturas.close();
		
		log.escribirEnLog("Todo guardado");
	}

	// CREAR DATOS
	//Clientes
	public int crearCliente(ArrayList<String> lista, String cliente) throws ClienteDuplicadoException {

		for (String aux : lista) {

			if (aux.equals(cliente)) {

				throw new ClienteDuplicadoException(cliente);

			}
		}
		lista.add(cliente);
		log.escribirEnLog("Cliente creado: " + cliente);
		return lista.indexOf(cliente);
	}
	
	//Facturas
	public Factura crearFactura(ArrayList<Factura> facturas, String id, String cliente, double importe, int descuento)
			throws FacturaNegativaException, MaximoFacturasAnyoException {

		if (facturas.size() > 12) {
			throw new MaximoFacturasAnyoException();
		}
		if (importe < 0) {
			throw new FacturaNegativaException();
		}

		Factura fac = new Factura(id, cliente, importe);
		fac.setDescuento(descuento);
		facturas.add(fac);
		log.escribirEnLog("Factura creada: " + fac.toString());
		return fac;
	}

	// BORRA UN CLIENTE Y TODAS SUS FACTURAS ASOCIADAS
	public void borrarCliente(ArrayList<Factura> facturas, ArrayList<String> clientes, String cliente) {

		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).equals(cliente)) {
				clientes.remove(i);
				break;
			}
		}

		for (int i = 0; i < facturas.size(); i++) {
			if (facturas.get(i).getCliente().equals(cliente)) {
				facturas.remove(i);
				i--; // como eliminamos un elemento de la lista necesitamos retroceder una casilla.
			}
		}
		
		log.escribirEnLog("Cliente borrado: " + cliente);

	}

	// CONSULTAR
	//Una factura
	private Factura obtenerFactura(String texto) {

		String[] aux = texto.split("/");

		String codigo = aux[0];
		String cliente = aux[1];
		int descuento = Integer.parseInt(aux[2]);
		double importe = Double.parseDouble(aux[3]);

		return new Factura(codigo, cliente, descuento, importe);

	}
	
	//Clientes
	public void mostrarClientes(ArrayList<String> clientes) {

		for (int i = 0; i < clientes.size(); i++) {
			System.out.println("Cod.cliente: " + i + " / Nombre: " + clientes.get(i));

		}
	}
	
	//Facturas
	public void mostrarFacturas(ArrayList<Factura> facturas) {

		for (int i = 0; i < facturas.size(); i++) {
			System.out.println(facturas.get(i).toString());
		}
	}
	
	//Facturas y clientes
	public void mostrarFacturasCliente(ArrayList<Factura> facturas, String cliente) {

		for (int i = 0; i < facturas.size(); i++) {

			if (facturas.get(i).getCliente().equals(cliente)) {
				System.out.println(facturas.get(i).toString());
			}
		}
	}
	
	//Sumar Facturas y Clientes
	public double sumarFacturasCliente(ArrayList<Factura> facturas, String cliente) {
		double total = 0;

		for (int i = 0; i < facturas.size(); i++) {

			if (facturas.get(i).getCliente().equals(cliente)) {
				total += facturas.get(i).getImporte();
			}
		}

		return total;
	}

}
