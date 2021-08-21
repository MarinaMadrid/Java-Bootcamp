package eventos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DemoEventos extends JFrame implements KeyListener, MouseListener, MouseWheelListener {
	private static final long serialVersionUID = 1L;
	private String linea1 = "", linea2 = "", linea3 = "", linea4 = "", linea5 = "", linea6 = "";
	private JTextArea areaTexto;

	public static void main(String args[]) {
		DemoEventos aplicacion = new DemoEventos();
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public DemoEventos() {
		super("Eventos");
		// Establecer objeto JTextArea
		areaTexto = new JTextArea(10, 15);
		areaTexto.setText("Oprima cualquier tecla en el teclado...");
		areaTexto.setEnabled(false);
		areaTexto.setDisabledTextColor(Color.blue);
		getContentPane().add(areaTexto);
		areaTexto.addMouseListener(this); // Añadimos el listener al componente
		addKeyListener(this); // Permitir al marco procesar eventos de teclas
		setSize(350, 100);
		setVisible(true);
	}

	// Manejar evento de pulsación de cualquier tecla
	public void keyPressed(KeyEvent evento) {
		linea1 = "Se oprimió tecla: " + KeyEvent.getKeyText(evento.getKeyCode());
		establecerLineas2y3(evento);
		escribirEnVentana();
	}

	// Manejar evento de liberación de cualquier tecla
	public void keyReleased(KeyEvent evento) {
		linea1 = "Se soltó tecla: " + KeyEvent.getKeyText(evento.getKeyCode());
		establecerLineas2y3(evento);
		escribirEnVentana();
	}

	// Manejar evento de pulsación de una tecla de acción
	public void keyTyped(KeyEvent evento) {
		linea1 = "Se matiene la tecla: " + evento.getKeyChar() + "pulsada.";
		establecerLineas2y3(evento);
		escribirEnVentana();
	}

	private void escribirEnVentana() {
		areaTexto
				.setText(linea1 + "\n" + linea2 + "\n" + linea3 + "\n" + linea4 + "\n" + linea5 + "\n" + linea6 + "\n");
	}

	// Establecer segunda y tercera líneas de salida
	private void establecerLineas2y3(KeyEvent evento) {
		// COMPRUEBA SI ES UNA TECLA DE FUNCION : F1 / F2 ... / F12
		if (evento.isActionKey()) {
			linea2 = "Esta tecla es una tecla de función";
		} else {
			linea2 = "Esta tecla no es una tecla de función";
		}

		// COMPRUEBA SI ES UNA TECLA MODIFICADORA : CTRL / SHIFT / ALT
		String aux = InputEvent.getModifiersExText(evento.getModifiersEx());
		if (aux.equals("")) {
			linea3 = "Teclas modificadoras oprimidas: ninguna";
		} else {
			linea3 = "Teclas modificadoras oprimidas: " + aux;
		}
	}

	// LISTENER RATON
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getClickCount() == 1) {
			linea6 = "Click " + e.getClickCount();
		}
		if (e.getClickCount() == 2) {
			linea6 = "Doble click " + e.getClickCount();
		}
		escribirEnVentana();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		linea5 = "Entramos en la caja de texto";
		escribirEnVentana();
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
	  linea5 = "Salimos de la caja de texto";
	  escribirEnVentana();
	}

	@Override
	public void mousePressed(MouseEvent e) {
	  linea4 = "Se pulsó el " + e.getButton();
	  linea5 = "Posición: X = "+ e.getX()+" Y = " + e.getY();
	  escribirEnVentana();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	  linea4 = "Se soltó el " + e.getButton();
	  escribirEnVentana();
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		int count = 0;
		count = count + e.getWheelRotation();
		areaTexto.setText("Ratón movido: " + count );
	}
}