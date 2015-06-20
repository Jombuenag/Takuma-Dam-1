package vista;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VistaUsuario extends JPanel {
	
	CardLayout cL;
	
	private MainVista mainVista;
	private JTextField txtNomUsuario;
	private JPasswordField passwordField;
	
	public VistaUsuario(MainVista mainVista) {
		setBackground(new Color(205, 92, 92));
		this.mainVista = mainVista;
		setBounds(100, 100, 600, 550);
		setLayout(null);
		
		
		JLabel lblImgUsuario = new JLabel("lblImgUsuario");
		add(lblImgUsuario);
		lblImgUsuario.setBounds(200, 80, 175, 175);
		
		JButton btnLogIn = new JButton("LogIn");
		add(btnLogIn);
		btnLogIn.setBounds(140, 425, 120, 30);
		
		JButton btnVistaMusic = new JButton("VistaMusic");
		btnVistaMusic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainVista.VistaMusic();
			}
		});
		add(btnVistaMusic);
		btnVistaMusic.setBounds(500, 495, 90, 25);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(300, 425, 120, 30);
		add(btnNewButton);
		
		txtNomUsuario = new JTextField();
		txtNomUsuario.setBounds(175, 300, 220, 25);
		add(txtNomUsuario);
		txtNomUsuario.setColumns(10);
		
		JLabel lblNomUsuario = new JLabel("Usuario :");
		lblNomUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNomUsuario.setBounds(175, 275, 120, 20);
		add(lblNomUsuario);
		
		JLabel lblPassUsuario = new JLabel("Password :");
		lblPassUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassUsuario.setBounds(175, 330, 120, 20);
		add(lblPassUsuario);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(175, 355, 220, 25);
		add(passwordField);
		
		
		

		
	}
}
