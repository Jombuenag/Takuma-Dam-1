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
import javax.swing.JComboBox;
import javax.swing.JList;

public class VistaApp extends JFrame {

    private JPanel contentPane;
    private VistaPrincipal vistaPrincipal;
    private CardLayout cL;
    private JTextField textField;
    private JPasswordField passwordField;
    private JTextField textNomFiltros;
    private JTextField txtNombre;
    private JTextField txtGenero;
    private JTextField txtPlataforma;
    
    
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
	  btnLogin.addActionListener(new ActionListener() {
	  	public void actionPerformed(ActionEvent e) {
	  	}
	  });
	  btnLogin.setForeground(new Color(100, 150, 240));
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


	  
	  JPanel vistaJuegos = new JPanel();
	  contenedor.add(vistaJuegos, "Vista2");
	  vistaJuegos.setLayout(null);
	  
	  JButton button_1 = new JButton("<<");
	  button_1.addActionListener(new ActionListener() {
	  	public void actionPerformed(ActionEvent arg0) {
	  	    CardLayout c = (CardLayout)contenedor.getLayout();
	  	    c.show(contenedor, "Vista1");
	  	}
	  });
	  button_1.setBounds(335, 379, 89, 23);
	  vistaJuegos.add(button_1);
	  
	  JLabel lblFiltros = new JLabel("Filtros");
	  lblFiltros.setFont(new Font("Tahoma", Font.BOLD, 16));
	  lblFiltros.setBounds(175, 10, 80, 15);
	  vistaJuegos.add(lblFiltros);
	  
	  JLabel lblNomFiltros = new JLabel("Nombre");
	  lblNomFiltros.setBounds(20, 50, 55, 15);
	  vistaJuegos.add(lblNomFiltros);
	  
	  JLabel lblGenFiltos = new JLabel("Genero");
	  lblGenFiltos.setBounds(155, 50, 55, 15);
	  vistaJuegos.add(lblGenFiltos);
	  
	  JLabel lblPlatFiltros = new JLabel("Plataforma");
	  lblPlatFiltros.setBounds(295, 50, 80, 15);
	  vistaJuegos.add(lblPlatFiltros);
	  
	  JComboBox cmbGenFiltros = new JComboBox();
	  cmbGenFiltros.setBounds(155, 75, 120, 20);
	  vistaJuegos.add(cmbGenFiltros);
	  
	  textNomFiltros = new JTextField();
	  textNomFiltros.setBounds(20, 75, 120, 20);
	  vistaJuegos.add(textNomFiltros);
	  textNomFiltros.setColumns(10);
	  
	  JComboBox cmbPlatFiltros = new JComboBox();
	  cmbPlatFiltros.setBounds(295, 75, 120, 20);
	  vistaJuegos.add(cmbPlatFiltros);
	  
	  JList list = new JList();
	  list.setBounds(20, 125, 190, 250);
	  vistaJuegos.add(list);
	  
	  JLabel lblNombre = new JLabel("Nombre");
	  lblNombre.setBounds(245, 125, 70, 20);
	  vistaJuegos.add(lblNombre);
	  
	  txtNombre = new JTextField();
	  txtNombre.setBounds(245, 145, 175, 20);
	  vistaJuegos.add(txtNombre);
	  txtNombre.setColumns(10);
	  
	  JLabel lblGenero = new JLabel("Genero");
	  lblGenero.setBounds(245, 180, 75, 15);
	  vistaJuegos.add(lblGenero);
	  
	  txtGenero = new JTextField();
	  txtGenero.setBounds(245, 200, 175, 20);
	  vistaJuegos.add(txtGenero);
	  txtGenero.setColumns(10);
	  
	  JLabel lblPlataforma = new JLabel("Plataforma");
	  lblPlataforma.setBounds(245, 235, 90, 15);
	  vistaJuegos.add(lblPlataforma);
	  
	  txtPlataforma = new JTextField();
	  txtPlataforma.setBounds(245, 260, 175, 20);
	  vistaJuegos.add(txtPlataforma);
	  txtPlataforma.setColumns(10);
	  
	  JButton btnEditar = new JButton("Editar");
	  btnEditar.setForeground(new Color(100, 150, 240));
	  btnEditar.setFont(new Font("Tahoma", Font.BOLD, 16));
	  btnEditar.setBounds(245, 310, 130, 25);
	  vistaJuegos.add(btnEditar);
	  
	  JButton btnSalvar = new JButton("Salvar");
	  btnSalvar.setForeground(new Color(255, 165, 0));
	  btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 16));
	  btnSalvar.setBounds(245, 345, 130, 25);
	  vistaJuegos.add(btnSalvar);
    }	
}
