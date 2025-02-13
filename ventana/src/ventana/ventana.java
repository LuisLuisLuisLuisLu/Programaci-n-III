package ventana;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class ventana extends JFrame {
	public  ventana (String title) {
		
		this.setTitle("7.- SImplementa el componente JLabel para color");
		this.setSize(1000,1000);
		this.setLayout(null);
		this.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setSize(1000,1000);
		panel.setVisible(true);
		panel.setOpaque(true);
		panel.setBackground(new Color (201, 57, 57));
		panel.setLocation(0,0);
		getContentPane().add(panel);
		
		JLabel etiqueta = new JLabel("Bienvenido");
			etiqueta.setSize(500, 500);
			etiqueta.setLocation(500,500);
			etiqueta.setBackground(new Color(252, 186, 5));
			etiqueta.setVisible(true);
			etiqueta.setOpaque(true);
		panel.add  (etiqueta);
		
			
		
	}
	


}
