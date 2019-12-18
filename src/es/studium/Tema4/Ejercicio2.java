package es.studium.Tema4;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Ejercicio2 extends Frame{
	private static final long serialVersionUID = 1L;

	Panel pnl1 = new Panel();
	Panel pnl2 = new Panel();
	TextField txtCampo1 = new TextField ();
	TextField txtCampo2 = new TextField ();
	TextField txtCampo3 = new TextField ();
	Label lblCan = new Label("Introduzca la Cantidad");
	Label lblPor = new Label("Introduzca el Porcentaje");
	Label lblRe = new Label("Resultado");
	Button btnCal = new Button("Calcular");

	public Ejercicio2() {
		setTitle("Calcular el IVA");
		

		setSize(600,175);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejercicio2();
	}
}

