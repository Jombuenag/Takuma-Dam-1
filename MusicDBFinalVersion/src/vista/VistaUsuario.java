package vista;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
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
		setBackground(new Color(0, 205, 210));
		this.mainVista = mainVista;
		setBounds(100, 100, 650, 600);
		setLayout(null);
		
		Image imgGuitar = new ImageIcon(this.getClass().getResource("/images/guitar.jpeg")).getImage();
		JLabel lblImgUsuario = new JLabel("lblImgUsuario");
		lblImgUsuario.setBounds(200, 80, 175, 175);
		lblImgUsuario.setIcon(new ImageIcon(imgGuitar));
		add(lblImgUsuario);
			
		JButton btnLogIn = new JButton("LogIn");
		btnLogIn.setForeground(new Color(155, 55, 205));
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLogIn.setContentAreaFilled(false);
		btnLogIn.setBounds(140, 425, 120, 30);
		add(btnLogIn);
		
		JButton btnReg = new JButton("Registrarse");
		btnReg.setForeground(new Color(205, 50, 255));
		btnReg.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReg.setBounds(280, 425, 135, 30);
		btnReg.setContentAreaFilled(false);
		btnReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnReg);
		
		JButton btnVistaMusic = new JButton("VistaMusic");
		btnVistaMusic.setBounds(500, 495, 90, 25);
		btnVistaMusic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainVista.VistaMusic();
			}
		});
		add(btnVistaMusic);
	
		
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
