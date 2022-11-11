package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.ErrorFrame;
import view.PrincipalFrame;

public class EventsController implements ActionListener{
	
		
		
		private PrincipalFrame frame;
		private ErrorFrame eFrame;
		
		
		public EventsController(PrincipalFrame frame) {
			this.frame = frame;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				if(e.getSource()== frame.getAddition()) {
					double x1 = Double.parseDouble(frame.getTextOne().getText());
					double x2 = Double.parseDouble(frame.getTextTwo().getText());
					frame.getFinalResult().setText(String.valueOf(x1+x2));
					frame.getTextOne().setText("");
					frame.getTextTwo().setText("");	
					frame.getTextOne().requestFocus();
				}
				else if(e.getSource()== frame.getMinus()) {
					double x1 = Double.parseDouble(frame.getTextOne().getText());
					double x2 = Double.parseDouble(frame.getTextTwo().getText());
					frame.getFinalResult().setText(String.valueOf(x1-x2));
					frame.getTextOne().setText("");
					frame.getTextTwo().setText("");
					frame.getTextOne().requestFocus();
				}
				else if(e.getSource()== frame.getMultiplication()) {
					double x1 = Double.parseDouble(frame.getTextOne().getText());
					double x2 = Double.parseDouble(frame.getTextTwo().getText());
					frame.getFinalResult().setText(String.valueOf(x1*x2));
					frame.getTextOne().setText("");
					frame.getTextTwo().setText("");
					frame.getTextOne().requestFocus();
				}
				else if(e.getSource()== frame.getDivision()) {
					double x1 = Double.parseDouble(frame.getTextOne().getText());
					double x2 = Double.parseDouble(frame.getTextTwo().getText());
					frame.getFinalResult().setText(String.valueOf(x1/x2));
					frame.getTextOne().setText("");
					frame.getTextTwo().setText("");
					frame.getTextOne().requestFocus();
				}
				else if(e.getSource()== frame.getR2()) {
					JOptionPane.showMessageDialog(frame, "Función prohibida,\n"
								+ " estas seguro de querer entrar?",null, 2);
					JOptionPane.showMessageDialog(frame, "Pues va a ser que no",null,0);
				}
				
				else if(e.getSource()== frame.getR3()) {
					String pass = JOptionPane.showInputDialog("Digite la contraseña");
					if(pass.equalsIgnoreCase("Raquel")) {
						double x1 = Double.parseDouble(frame.getTextOne().getText());
						double x2 = Double.parseDouble(frame.getTextTwo().getText());
						frame.getFinalResult().setText(String.valueOf(Math.cbrt(x1)));
						frame.getFinalResult().setText(String.valueOf(Math.cbrt(x2)));
						frame.getTextOne().setText("");
						
						frame.getTextTwo().setText("");
						frame.getTextOne().requestFocus();
					}
					else {
						JOptionPane.showMessageDialog(frame, "Contraseña incorrecta");
					}
				}
			} catch (NumberFormatException ex) {
				System.err.println("Ha ocurrido un error");
		}
			
	}
			
}


