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

public class VistaApp extends JFrame {

    private JPanel contentPane;
    private VistaPrincipal vistaPrincipal;
    private CardLayout cL;
    
    
    public VistaApp() {
	  
	  vistaPrincipal = new VistaPrincipal();
	  vistaPrincipal.setBounds(100, 100, 450, 475);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setBounds(100, 100, 460, 485);
	  
	  JMenuBar menuBar = new JMenuBar();
	  setJMenuBar(menuBar);
	  
	  JMenuItem mntmPrincipal = new JMenuItem("Principal");
	  mntmPrincipal.addActionListener(new ActionListener() {
	  	public void actionPerformed(ActionEvent arg0) {
	  	    cL = (CardLayout)(vistaPrincipal.getLayout());
	  	    cL.show(vistaPrincipal,"Principal");
	  	}
	  });
	  menuBar.add(mntmPrincipal);
	  JMenuItem mntmUsuario = new JMenuItem("Usuario");
	  mntmUsuario.addActionListener(new ActionListener() {
	  	public void actionPerformed(ActionEvent e) {
	  	    cL = (CardLayout)(vistaPrincipal.getLayout());
	  	    cL.show(vistaPrincipal,"Usuario");
	  	}
	  });
	  menuBar.add(mntmUsuario);
	  JMenuItem mntmOpciones = new JMenuItem("Opciones");
	  mntmOpciones.addActionListener(new ActionListener() {
	  	public void actionPerformed(ActionEvent e) {
	  	  cL = (CardLayout)(vistaPrincipal.getLayout());
	  	    cL.show(vistaPrincipal,"Opciones");
	  	}
	  });
	  
	  menuBar.add(mntmOpciones);
	  
	  contentPane = new JPanel();
	  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	  setContentPane(contentPane);
	  contentPane.setLayout(new BorderLayout(0, 0));
	  
	  JPanel contenedor = new JPanel();
	  contentPane.add(contenedor, BorderLayout.CENTER);
	  contenedor.setLayout(new CardLayout(0, 0));
	  contenedor.add(vistaPrincipal, "Principal");
	  
	  JPanel panel = new JPanel();
	  contenedor.add(panel, "name_482512736307");
	  panel.setLayout(null);
    }	
}
