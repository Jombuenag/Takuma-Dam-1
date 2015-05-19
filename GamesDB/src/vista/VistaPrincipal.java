package vista;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;



	public class VistaPrincipal extends JPanel {
	  
		private JPanel contentPane;
		private JTextField nomUsuario;
		private JTextField passUsuario;
		private JLabel lblImage;
		private JLabel lblUser;
		private JLabel lblPass;

		
		public VistaPrincipal() {
			setLayout(null);
			this.setBounds(100, 100, 425, 475);
		}
	{
	//BOTONES
	JButton btnJuegos = new JButton("Juegos");
	btnJuegos.setBounds(265, 115, 90, 25);
	contentPane.add(btnJuegos);
	
	JButton btnPerfil = new JButton("Perfil");
	btnPerfil.setBounds(265, 150, 90, 25);
	contentPane.add(btnPerfil);
	
	//INPUT TEXTO
	nomUsuario = new JTextField();
	nomUsuario.setBounds(15, 250, 175, 20);
	contentPane.add(nomUsuario);
	nomUsuario.setColumns(10);

	passUsuario = new JTextField();
	passUsuario.setBounds(15, 300, 175, 20);
	contentPane.add(passUsuario);
	passUsuario.setColumns(10);
	
	JButton btnLogin = new JButton("Login");
	btnLogin.setBounds(15, 340, 175, 20);
	btnLogin.setContentAreaFilled(false);
	contentPane.add(btnLogin);
	
	JButton btnReg = new JButton("Registrarse");
	btnReg.setBounds(15, 370, 175, 20);
	btnReg.setContentAreaFilled(false);
	contentPane.add(btnReg);
	
	//IMAGENES
	Image niggerCobra = new ImageIcon(this.getClass().getResource("/NiggerCobra.jpg")).getImage();
	JLabel lblImage = new JLabel();
	lblImage.setBounds(15, 15, 175, 175);
	lblImage.setIcon(new ImageIcon(niggerCobra));
	this.add(lblImage);
	
	
	//--------------------------------------------//
	
	//TEXTO
	lblUser = new JLabel("Usuario : ");
	lblUser.setHorizontalAlignment(SwingConstants.CENTER);
	lblUser.setFont(new Font("Tahoma", Font.BOLD, 15));
	lblUser.setBounds(15, 210, 85, 40);
	contentPane.add(lblUser);
	
	lblPass = new JLabel("Contrase\u00F1a : ");
	lblPass.setHorizontalAlignment(SwingConstants.CENTER);
	lblPass.setFont(new Font("Tahoma", Font.BOLD, 15));
	lblPass.setBounds(15, 265, 110, 40);
	contentPane.add(lblPass);
	}
}
