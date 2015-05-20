package vista;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;

public class VistaApp extends JFrame {

    private JPanel contentPane;
    private VistaPrincipal vistaPrincipal;
    private CardLayout cL;
    private JTextField textField;
    private JPasswordField passwordField;
    
    
    public VistaApp() {
	  
	  vistaPrincipal = new VistaPrincipal();
	  vistaPrincipal.setForeground(new Color(255, 140, 0));
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setBounds(100, 100, 460, 485);
	  
	  JMenuBar menuBar = new JMenuBar();
	  setJMenuBar(menuBar);
	  
	  JMenuItem mntmInicio = new JMenuItem("Inicio");
	  menuBar.add(mntmInicio);
	  JMenuItem mntmUsuario = new JMenuItem("Usuario");
	  menuBar.add(mntmUsuario);
	  JMenuItem mntmJuegos = new JMenuItem("Juegos");
	  menuBar.add(mntmJuegos);
	  
	  contentPane = new JPanel();
	  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	  setContentPane(contentPane);
	  contentPane.setLayout(new BorderLayout(0, 0));
	  
	  JPanel contenedor = new JPanel();
	  contentPane.add(contenedor, BorderLayout.CENTER);
	  contenedor.setLayout(new CardLayout(0, 0));
	  contenedor.add(vistaPrincipal, "Vista1");
	  
	  //INSERTAMOS LA IMAGEN
	  Image niggerCobra = new ImageIcon(this.getClass().getResource("/NiggerCobra.jpg")).getImage();
	  JLabel lblImage = new JLabel();
	  vistaPrincipal.add(lblImage);
	  lblImage.setBounds(10, 10, 175, 175);
	  lblImage.setIcon(new ImageIcon(niggerCobra));
	  vistaPrincipal.add(lblImage);
	  
	  JLabel lblUsuario = new JLabel("Usuario :");
	  lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
	  lblUsuario.setBounds(10, 200, 105, 20);
	  vistaPrincipal.add(lblUsuario);
	  
	  textField = new JTextField();
	  textField.setBounds(10, 230, 155, 20);
	  vistaPrincipal.add(textField);
	  textField.setColumns(10);
	  
	  JButton btnPerfil = new JButton("Perfil");
	  btnPerfil.setFont(new Font("Tahoma", Font.BOLD, 12));
	  btnPerfil.addActionListener(new ActionListener() {
	  	public void actionPerformed(ActionEvent arg0) {
	  	    CardLayout c = (CardLayout)contenedor.getLayout();
	  	    c.show(contenedor, "Vista2");
	  	}
	  });
	  btnPerfil.setBounds(275, 80, 125, 25);
	  vistaPrincipal.add(btnPerfil);
	  
	  JLabel lblPassword = new JLabel("Password :");
	  lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
	  lblPassword.setBounds(10, 260, 105, 20);
	  vistaPrincipal.add(lblPassword);
    	  passwordField = new JPasswordField();
    	  passwordField.setBounds(10, 290, 155, 20);
    	  vistaPrincipal.add(passwordField);
        	  
	  JButton btnJuegos = new JButton("Juegos");
	  btnJuegos.setFont(new Font("Tahoma", Font.BOLD, 12));
	  btnJuegos.setBounds(275, 35, 125, 25);
	  vistaPrincipal.add(btnJuegos);
	  
	  JButton btnLogin = new JButton("LogIn");
	  btnLogin.setForeground(SystemColor.textHighlight);
	  btnLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
	  btnLogin.setContentAreaFilled(false);
	  btnLogin.setBorderPainted(false);
	  btnLogin.setBounds(10, 335, 155, 25);
	  vistaPrincipal.add(btnLogin);
	  
	  JButton btnRegistrarse = new JButton("Registrate!");
	  btnRegistrarse.setForeground(new Color(255, 165, 0));
	  btnRegistrarse.setFont(new Font("Tahoma", Font.BOLD, 16));
	  btnRegistrarse.setContentAreaFilled(false);
	  btnRegistrarse.setBorderPainted(false);
	  btnRegistrarse.setBounds(10, 365, 155, 25);
	  vistaPrincipal.add(btnRegistrarse);
	  
	  //IMAGEN TRIFORCE

	  Image triforce = new ImageIcon(this.getClass().getResource("/Triforce.png")).getImage();
  	  JLabel lblTriforce = new JLabel();
  	  vistaPrincipal.add(lblTriforce);
  	  lblTriforce.setBounds(100, 100, 265, 265);
  	  lblTriforce.setIcon(new ImageIcon(triforce));
  	  vistaPrincipal.add(lblTriforce);


	  
	  JPanel vista2 = new JPanel();
	  contenedor.add(vista2, "Vista2");
	  vista2.setLayout(null);
	  
	  JButton button_1 = new JButton("<<");
	  button_1.addActionListener(new ActionListener() {
	  	public void actionPerformed(ActionEvent arg0) {
	  	    CardLayout c = (CardLayout)contenedor.getLayout();
	  	    c.show(contenedor, "Vista1");
	  	}
	  });
	  button_1.setBounds(296, 118, 89, 23);
	  vista2.add(button_1);
    }	
}
