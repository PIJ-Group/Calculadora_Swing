package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

import view.PrincipalFrame;

public class EventsController implements ActionListener{

		private PrincipalFrame frame;
		private double x1, x2; 

		public EventsController(PrincipalFrame frame) {
			this.frame = frame;
		}
		
		//Gestión de eventos de los componentes
		@Override
		public void actionPerformed(ActionEvent e) {
			
			try {
				
				//Suma
				if(e.getSource() == frame.getAddition()) {
					initVarText();
					playSound("sounds/Rexy_Roar.wav");
					frame.getFinalResult().setText(String.valueOf(x1+x2));
					resetAndFocus();
				}
				
				//Resta
				else if(e.getSource() == frame.getMinus()) {
					initVarText();
					playSound("sounds/Compsognathus_Roar.wav");					
					frame.getFinalResult().setText(String.valueOf(x1-x2));
					resetAndFocus();
				}
				
				//Multiplicación
				else if(e.getSource() == frame.getMultiplication()) {
					initVarText();
					playSound("sounds/Velociraptor_Roar.wav");					
					frame.getFinalResult().setText(String.valueOf(x1*x2));
					resetAndFocus();
				}
				
				//División
				else if(e.getSource() == frame.getDivision()) {
					initVarText();							
					if(x2 != 0) {	
						playSound("sounds/Spinosaurus_Roar.wav");
						frame.getFinalResult().setText(String.valueOf(round(x1/x2)));
						resetAndFocus();
					}
					else {
						playSound("sounds/Caos.wav");
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
					
					resetAndFocus();
					*/	
				}
				
				//Raíz cuadrada
				else if(e.getSource() == frame.getR2()) {
					playSound("sounds/Therizinosaurus_Roar.wav");
					JOptionPane.showMessageDialog(frame, "Función prohibida,\n"
								+ " estas seguro de querer entrar?","¡ADVERTENCIA!", 2);
					JOptionPane.showMessageDialog(frame, "Pues va a ser que no","¡ERROR!",0);					
				}
				
				//Raíz cúbica
				else if(e.getSource()== frame.getR3()) {
					playSound("sounds/Carnotaurus_Roar.wav");
					String pass = JOptionPane.showInputDialog("Digite la contraseña");					
					if(pass.equals("Raquel")) {						
						String r3Response = JOptionPane.showInputDialog("Inserte un número para calcular su raíz cúbica");
						double x3 = Double.parseDouble(r3Response);
						frame.getFinalResult().setText(String.valueOf(round(Math.cbrt(x3))));
						playSound("sounds/Hammond.wav");
						
					}
					else {
						playSound("sounds/Error_Nedry.wav");
						JOptionPane.showMessageDialog(frame, "Contraseña incorrecta");
					}
					
					resetAndFocus();
				}
				
			} catch (NumberFormatException ex) {
				playSound("sounds/error.wav");
				JOptionPane.showMessageDialog(frame, "Dato insertado incorrecto. \n\n"
						 + "Recuerde no dejar campos en blanco \n"
						 + " e introducir valores númericos.", "¡ADVERTENCIA!", 2);
			}

		}
		
		//Resetea las cajas de texto y pone el foco
		public void resetAndFocus(){
			frame.getTextOne().setText("");
			frame.getTextTwo().setText("");
			frame.getTextOne().requestFocus();
		}
		
		//Inicializador de variables
		public void initVarText() {
			x1 = Double.parseDouble(frame.getTextOne().getText());
			x2 = Double.parseDouble(frame.getTextTwo().getText());
		}
		
		//Función para redondear los decimales
		public double round(double num) {
            return Math.round(num * 100.0)/100.0;
        }
		
		//Procedimiento para agregar sonido a los eventos
        public void playSound(String sound){
            try {

                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(sound).getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            }catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                System.out.println("Error al reproducir el sonido.");
            }
        }
			
}


