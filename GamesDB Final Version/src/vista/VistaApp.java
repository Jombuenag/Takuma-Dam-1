package vista;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class VistaApp extends JFrame {

    private JPanel contentPane;
    private VistaPrincipal vistaPrincipal;
    private CardLayout cL;
    private JTextField textField;
    
    
    public VistaApp() {
	  
	  vistaPrincipal = new VistaPrincipal();
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
	  contenedor.add(vistaPrincipal, "Vista 1");
	  
	  JLabel lblImagen = new JLabel("");
	  lblImagen.setBounds(10, 10, 175, 175);
	  vistaPrincipal.add(lblImagen);
	  
	  JLabel lblUsuario = new JLabel("Usuario :");
	  lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
	  lblUsuario.setBounds(20, 200, 105, 20);
	  vistaPrincipal.add(lblUsuario);
	  
	  textField = new JTextField();
	  textField.setBounds(20, 230, 155, 20);
	  vistaPrincipal.add(textField);
	  textField.setColumns(10);
	  
	  JPanel vista2 = new JPanel();
	  contenedor.add(vista2, "Vista 2");
	  vista2.setLayout(null);
    }	
}
