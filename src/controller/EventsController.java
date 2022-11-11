package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.ErrorFrame;
import view.PrincipalFrame;

public class EventsController implements ActionListener{

		private PrincipalFrame frame;
		private ErrorFrame eFrame;
		private double x1, x2; 

		public EventsController(PrincipalFrame frame) {
			this.frame = frame;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			try {
				x1 = Double.parseDouble(frame.getTextOne().getText());
				x2 = Double.parseDouble(frame.getTextTwo().getText());
				
				if(e.getSource()== frame.getAddition()) {
					frame.getFinalResult().setText(String.valueOf(x1+x2));
					resetAndFocus();
				}
				
				else if(e.getSource()== frame.getMinus()) {
					frame.getFinalResult().setText(String.valueOf(x1-x2));
					resetAndFocus();
				}
				
				else if(e.getSource()== frame.getMultiplication()) {
					frame.getFinalResult().setText(String.valueOf(x1*x2));
					resetAndFocus();
				}
				
				else if(e.getSource()== frame.getDivision()) {
					if(x2!=0) {
						frame.getFinalResult().setText(String.valueOf(x1/x2));
						resetAndFocus();
					}
					else {
						JOptionPane.showMessageDialog(frame, "No se puede dividir por 0", "¡ERROR!", 2);
						resetAndFocus();
					}
					/* Funcionalidad con Integer, arrojando excepción y recogiendola.
					try {
					
						int x1 = Integer.parseInt(frame.getTextOne().getText());
						int x2 = Integer.parseInt(frame.getTextTwo().getText());	
								
						frame.getFinalResult().setText(String.valueOf(x1/x2));
							
					}catch (ArithmeticException ex) {
						
						ex.printStackTrace();
						JOptionPane.showMessageDialog(frame, "No se puede dividir por 0, imbécil", "¡ERROR!", 2);
							
					}
					
					frame.getTextOne().setText("");
					frame.getTextTwo().setText("");
					frame.getTextOne().requestFocus();
					*/	
				}
				
				else if(e.getSource()== frame.getR2()) {
					JOptionPane.showMessageDialog(frame, "Función prohibida,\n"
								+ " estas seguro de querer entrar?","¡ADVERTENCIA!", 2);
					JOptionPane.showMessageDialog(frame, "Pues va a ser que no","¡ERROR!",0);
				}
				
				else if(e.getSource()== frame.getR3()) {
					
					String pass = JOptionPane.showInputDialog("Digite la contraseña");
					if(pass.equals("Raquel")) {
						String r3Response = JOptionPane.showInputDialog("Inserte un número para calcular su raíz cúbica");
						Double x3 = Double.parseDouble(r3Response);
						frame.getFinalResult().setText(String.valueOf(Math.cbrt(x3)));
						//frame.getFinalResult().setText(String.valueOf(Math.cbrt(x2)));
						
					}
					else {
						JOptionPane.showMessageDialog(frame, "Contraseña incorrecta");
					}
				}
				
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(frame, "Dato insertado incorrecto. \n\n"
						 + "Recuerde no dejar campos en blanco \n"
						 + " e introducir valores númericos.", "¡ADVERTENCIA!", 2);
			}
			
			
		
		
		}
		
		public void resetAndFocus(){
			frame.getTextOne().setText("");
			frame.getTextTwo().setText("");
			frame.getTextOne().requestFocus();
		}
			
}


