package vista;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class VistaApp extends JFrame{
	
	private JPanel contentPane;
	
	
	public VistaApp(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 475);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu barPrincipal = new JMenu("Principal");
		menuBar.add(barPrincipal);
	}
}
