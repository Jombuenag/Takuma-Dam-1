package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class VistaMusic extends JPanel {
	
	private MainVista mainVista;
	
	public VistaMusic(MainVista mainVista) {
		this.mainVista = mainVista;
		setBounds(100, 100, 600, 550);
		setBackground(new Color(205, 92, 92));
		setLayout(null);
		
		JButton btnVistausuarios = new JButton("VistaUsuarios");
		btnVistausuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainVista.VistaUsuario();
			}
		});
		btnVistausuarios.setBounds(126, 75, 148, 34);
		add(btnVistausuarios);
	}
}
