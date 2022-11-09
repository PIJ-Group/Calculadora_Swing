package view;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class PrincipalFrame extends JFrame {
	
	
	
	
	public PrincipalFrame () {
		setSize(450,650);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Calculadora");
		setIconImage(Toolkit.getDefaultToolkit().getImage("img/calculadora3.png"));
		setLayout(null);
		
		inicializeComponents();
		
		setVisible(true);
	}
	
	private void inicializeComponents() {
		
	}

}
