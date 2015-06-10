package vista;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import modelo.ConexionDB;
import modelo.UsuariosModelo;

public class VistaApp extends JFrame {

    private JPanel contentPane;
    private VistaPrincipal vistaPrincipal;
    private JPasswordField passwordField;
    private JTextField textNomFiltros;
    private JTextField txtNombre;
    private JTextField txtGenero;
    private JTextField txtPlataforma;
    private JComboBox<String> cmbUsuario,cmbGenFiltros,cmbPlatFiltros;
    private JList<String> listaJuegos;
    //DATOS PARA 
    UsuariosModelo usuarios;
    
    ConexionDB conexion;
    
    public VistaApp(ConexionDB gameDB) {
    		this.conexion = gameDB;
	//VISTA PRINCIPAL Y PANELES
	  
	vistaPrincipal = new VistaPrincipal();
		vistaPrincipal.setForeground(new Color(255, 140, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 485);
		  
	contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		  	
	JPanel contenedor = new JPanel();
		contentPane.add(contenedor, BorderLayout.CENTER);
		contenedor.setLayout(new CardLayout(0, 0));
		contenedor.add(vistaPrincipal, "Vista1");
	
	//BARRA DE MENU  
	JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
	//ITEMS DE LA BARRA DE MENU
	JMenuItem mnbtnInicio = new JMenuItem("Inicio");
	mnbtnInicio.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			CardLayout c = (CardLayout)contenedor.getLayout();
			c.show(contenedor, "Vista1");
			}
		});
		menuBar.add(mnbtnInicio);
	JMenuItem mnbtnUsuario = new JMenuItem("Usuario");
	mnbtnUsuario.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		    CardLayout c = (CardLayout)contenedor.getLayout();
		    c.show(contenedor, "Vista3");
		}
	});
		menuBar.add(mnbtnUsuario);
	JMenuItem mnbtnJuegos = new JMenuItem("Juegos");
		mnbtnJuegos.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			CardLayout c = (CardLayout)contenedor.getLayout();
			c.show(contenedor, "Vista2");
	  		}
		});
		menuBar.add(mnbtnJuegos);
	  
	 
	  //INSERTAMOS LA IMAGEN DE PERFIL
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
	  
	JButton btnPerfil = new JButton("Usuario");
		btnPerfil.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		      CardLayout c = (CardLayout)contenedor.getLayout();
		      c.show(contenedor, "Vista3");
			}   
		});
		btnPerfil.setFont(new Font("Tahoma", Font.BOLD, 12));
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
		btnJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout)contenedor.getLayout();
				c.show(contenedor, "Vista2");
				}
			});
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
	
		cmbUsuario = new JComboBox<String>();
		cmbUsuario.setBounds(10, 230, 155, 20);
		vistaPrincipal.add(cmbUsuario);
			usuarios = new UsuariosModelo(conexion);
			Iterator<String> it = usuarios.getUsuarios().iterator();
			while(it.hasNext())
		cmbUsuario.addItem((String)it.next());

	JButton btnRegistrarse = new JButton("Registrate!");
		btnRegistrarse.setForeground(new Color(255, 165, 0));
		btnRegistrarse.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnRegistrarse.setContentAreaFilled(false);
		btnRegistrarse.setBorderPainted(false);
		btnRegistrarse.setBounds(10, 365, 155, 25);
		vistaPrincipal.add(btnRegistrarse);
	  
	//IMAGEN TRIFORCE INICIO
	Image triforce = new ImageIcon(this.getClass().getResource("/Triforce.png")).getImage();
	JLabel lblTriforce = new JLabel();
		vistaPrincipal.add(lblTriforce);
		lblTriforce.setBounds(85, 100, 265, 265);
		lblTriforce.setIcon(new ImageIcon(triforce));
		vistaPrincipal.add(lblTriforce);
	
	JPanel vistaJuegos = new JPanel();
		contenedor.add(vistaJuegos, "Vista2");
		vistaJuegos.setLayout(null);
	
	JLabel lblFiltros = new JLabel("Filtros");
		lblFiltros.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFiltros.setBounds(175, 10, 80, 15);
		vistaJuegos.add(lblFiltros);
	
	JLabel lblNomFiltros = new JLabel("Nombre");
		lblNomFiltros.setBounds(20, 50, 55, 15);
		vistaJuegos.add(lblNomFiltros);
		
	textNomFiltros = new JTextField();
		textNomFiltros.setBounds(20, 75, 120, 20);
		vistaJuegos.add(textNomFiltros);
		textNomFiltros.setColumns(10);
	
	JLabel lblGenFiltos = new JLabel("Genero");
		lblGenFiltos.setBounds(155, 50, 55, 15);
		vistaJuegos.add(lblGenFiltos);
	
	JLabel lblPlatFiltros = new JLabel("Plataforma");
		lblPlatFiltros.setBounds(295, 50, 80, 15);
		vistaJuegos.add(lblPlatFiltros);
	  
	cmbGenFiltros = new JComboBox<String>();
	cmbGenFiltros.setBounds(155, 75, 120, 20);
	vistaJuegos.add(cmbGenFiltros);
	
	  
	cmbPlatFiltros = new JComboBox<String>();
	cmbPlatFiltros.setBounds(295, 75, 120, 20);
	vistaJuegos.add(cmbPlatFiltros);
	  
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
		btnEditar.setBorderPainted(false);
		btnEditar.setContentAreaFilled(false);
		btnEditar.setBounds(260, 310, 130, 25);
		vistaJuegos.add(btnEditar);
	  
	JButton btnSalvar = new JButton("Salvar");
	btnSalvar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalvar.setForeground(new Color(255, 165, 0));
		btnSalvar.setBorderPainted(false);
		btnSalvar.setContentAreaFilled(false);
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSalvar.setBounds(260, 345, 130, 25);
		vistaJuegos.add(btnSalvar);
		
		listaJuegos = new JList<String>();
		listaJuegos.setBounds(20, 125, 190, 250);
		vistaJuegos.add(listaJuegos);
		
		//IMAGEN TRIFORCE JUEGOS
		JLabel lblTriforceJuegos = new JLabel();
		lblTriforceJuegos.setBounds(85, 100, 265, 265);
		vistaJuegos.add(lblTriforceJuegos);
		lblTriforceJuegos.setIcon(new ImageIcon(triforce));
			
		JPanel vistaUsuario = new JPanel();
		contenedor.add(vistaUsuario, "Vista3");
		vistaUsuario.setLayout(null);
		//IMAGEN TRIFORCE USUARIOS
		JLabel lblTriforceUsuarios = new JLabel();
		lblTriforceUsuarios.setBounds(85, 100, 265, 265);
		vistaUsuario.add(lblTriforceUsuarios);
		lblTriforceUsuarios.setIcon(new ImageIcon(triforce));
		
		JLabel lblPantallaUsuariosEn = new JLabel("Pantalla Usuarios en mantenimiento, disculpen las molestias.");
		lblPantallaUsuariosEn.setForeground(Color.RED);
		lblPantallaUsuariosEn.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPantallaUsuariosEn.setHorizontalAlignment(SwingConstants.CENTER);
		lblPantallaUsuariosEn.setBounds(0, 28, 434, 46);
		vistaUsuario.add(lblPantallaUsuariosEn);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    CardLayout c = (CardLayout)contenedor.getLayout();
			    c.show(contenedor, "Vista1");
			}
		});
		btnVolver.setForeground(Color.ORANGE);
		btnVolver.setBorderPainted(false);
		btnVolver.setContentAreaFilled(false);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnVolver.setBounds(155, 355, 110, 30);
		vistaUsuario.add(btnVolver);
	}
    
    
}

