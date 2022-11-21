package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.EventsController;

public class PrincipalFrame extends JFrame {
	
	//Declaración de variables
	private static final long serialVersionUID = 1L;
	private JLabel numberOne, numberTwo, result, finalResult, logo;
	private JButton addition, minus, multiplication, division, r2, r3;
	private JTextField textOne, textTwo;
	private Image img;
		
	//Constructor de la ventana
	public PrincipalFrame () {
		setSize(410,650);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Calculadora Jurásica");
		setIconImage(Toolkit.getDefaultToolkit().getImage("img/calculadora3.png"));
		setLayout(null);
		
		inicializeComponents();
		
		setVisible(true);
	}
	
	//Inicialización de componentes
	private void inicializeComponents() {
		
		getContentPane().setBackground(new Color(229,220,55));
		
		img = new ImageIcon("img/Jpark.jpg").getImage();
		logo = new JLabel(new ImageIcon(img.getScaledInstance(420, 320, Image.SCALE_SMOOTH)));
		logo.setBounds(0, 0, 400, 240);
		add(logo);
		
		numberOne = new JLabel("Número 1 :");
		numberOne.setBounds(50, 270, 120, 30);
		numberOne.setFont(new Font("Dialog", Font.BOLD, 14));
		numberOne.setForeground(Color.DARK_GRAY);
		add(numberOne);
		
		textOne = new JTextField();
		textOne.setBounds(130, 270, 60, 30);
		textOne.setFont(new Font("Dialog", Font.BOLD, 14));
		textOne.setForeground(Color.BLACK);
		textOne.setBackground(Color.WHITE);
		add(textOne);
		
		numberTwo = new JLabel("Número 2 :");
		numberTwo.setBounds(200, 270, 120, 30);
		numberTwo.setFont(new Font("Dialog", Font.BOLD, 14));
		numberTwo.setForeground(Color.DARK_GRAY);
		add(numberTwo);
		
		textTwo = new JTextField();
		textTwo.setBounds(285, 270, 60, 30);
		textTwo.setFont(new Font("Dialog", Font.BOLD, 14));
		textTwo.setForeground(Color.BLACK);
		textOne.setBackground(Color.WHITE);
		add(textTwo);
		
		addition = new JButton("SUMAR");
		addition.setBounds(60, 320, 130, 50);
		addition.setFont(new Font("Dialog", Font.BOLD, 14));
		addition.setForeground(Color.WHITE);
		addition.setBackground(Color.BLACK);
		add(addition);
		
		minus = new JButton("RESTAR");
		minus.setBounds(220, 320, 130, 50);
		minus.setFont(new Font("Dialog", Font.BOLD, 14));
		minus.setForeground(Color.WHITE);
		minus.setBackground(Color.BLACK);
		add(minus);
		
		multiplication = new JButton("MULTIPLICAR");
		multiplication.setBounds(60, 380, 130, 50);
		multiplication.setFont(new Font("Dialog", Font.BOLD, 14));
		multiplication.setForeground(Color.WHITE);
		multiplication.setBackground(Color.BLACK);
		add(multiplication);
		
		division = new JButton("DIVIDIR");
		division.setBounds(220, 380, 130, 50);
		division.setFont(new Font("Dialog", Font.BOLD, 14));
		division.setForeground(Color.WHITE);
		division.setBackground(Color.BLACK);
		add(division);
		
		r2 = new JButton("√2");
		r2.setBounds(60, 440, 130, 50);
		r2.setFont(new Font("Dialog", Font.BOLD, 14));
		r2.setForeground(Color.WHITE);
		r2.setBackground(Color.BLACK);
		add(r2);
		
		r3 = new JButton("√3");
		r3.setBounds(220, 440, 130, 50);
		r3.setFont(new Font("Dialog", Font.BOLD, 14));
		r3.setForeground(Color.WHITE);
		r3.setBackground(Color.BLACK);
		add(r3);
		
		result = new JLabel("Resultado:");
		result.setBounds(100, 520, 120, 30);
		result.setFont(new Font("Dialog", Font.BOLD, 14));
		result.setForeground(Color.DARK_GRAY);
		add(result);
		
		finalResult = new JLabel();
		finalResult.setBounds(190, 520, 120, 30);
		finalResult.setFont(new Font("Dialog", Font.BOLD, 14));
		finalResult.setForeground(Color.DARK_GRAY);
		add(finalResult);
			
	}
	
	//Controlador de eventos (Listener)
	public void controller(EventsController control) {
		
		addition.addActionListener(control);
		minus.addActionListener(control); 
		multiplication.addActionListener(control); 
		division.addActionListener(control);
		r2.addActionListener(control);
		r3.addActionListener(control);		
	}

	//Getters
	public JLabel getFinalResult() {
		return finalResult;
	}

	public JButton getAddition() {
		return addition;
	}

	public JButton getMinus() {
		return minus;
	}

	public JButton getMultiplication() {
		return multiplication;
	}

	public JButton getDivision() {
		return division;
	}

	public JButton getR2() {
		return r2;
	}

	public JButton getR3() {
		return r3;
	}

	public JTextField getTextOne() {
		return textOne;
	}

	public JTextField getTextTwo() {
		return textTwo;
	}
	

}
