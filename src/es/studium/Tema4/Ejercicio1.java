package es.studium.Tema4;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio1  extends Frame {
	private static final long serialVersionUID = 1L;
	Button btnCel = new Button("Celsius a  Fahrenheit ");
	Button btnFa = new Button("Fahrenheit a Celsius");
	TextField txtCampo1 = new TextField ();
	TextField txtCampo2 = new TextField ();
	Label lblFa = new Label("Fahrenheit");
	Label lblCel = new Label("Celsius");
	
	public Ejercicio1() {
		setLayout(new GridLayout(3,2));
		setTitle("Conversión de Temperaturas");
		add(lblCel);
		add(txtCampo1);
		add(lblFa);
		add(txtCampo2);
		add(btnCel);
		add(btnFa);
		setSize(600,175);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ejercicio1();
	}
}
