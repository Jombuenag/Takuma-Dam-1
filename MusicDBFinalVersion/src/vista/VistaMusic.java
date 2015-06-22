package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class VistaMusic extends JPanel {
	
	private MainVista mainVista;
	
	public VistaMusic(MainVista mainVista) {
		this.mainVista = mainVista;
		setBounds(100, 100, 650, 600);
		setBackground(new Color(0, 205, 210));
		setLayout(null);
		
		JButton btnVistausuarios = new JButton("VistaUsuarios");
		btnVistausuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainVista.VistaUsuario();
			}
		});
		btnVistausuarios.setBounds(428, 471, 148, 34);
		add(btnVistausuarios);
		
		JLabel lblIcono = new JLabel("Icono");
		lblIcono.setBounds(15, 455, 85, 85);
		add(lblIcono);
		
		JList list = new JList();
		list.setBackground(new Color(255, 250, 240));
		list.setBounds(335, 25, 250, 415);
		add(list);
	}
}
