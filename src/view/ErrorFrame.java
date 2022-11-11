package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.EventsController;

public class ErrorFrame extends JDialog {
	
	private final JPanel contentPanel = new JPanel();
	private JLabel errorMessage;
	private JButton closeButton;
	private EventsController control;
	
	public ErrorFrame(EventsController control) {
		
		this.control = control;
		
		setSize(250,300);
		setLocationRelativeTo(null);
		/*getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(140, 3, 199));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);*/
		setTitle("Error");
		contentPanel.setLayout(null);
		closeButton.addActionListener(control);
		
		inicializeComponents();
		
	}
	
	private void inicializeComponents() {
		
		errorMessage = new JLabel("Funcionalidad no disponible");
		errorMessage.setBounds(30, 30, 200, 30);
		add(errorMessage);
		
		closeButton = new JButton("OK");
		closeButton.setBounds(120, 200, 50, 30);
		add(closeButton);
		
	
	}
	
/*public void controller(EventsController control) {
		
		closeButton.addActionListener(control);
}*/

	public JButton getCloseButton() {
		return closeButton;
	}

}
