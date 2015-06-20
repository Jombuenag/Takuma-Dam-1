package vista;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainVista extends JFrame {
// JFRAME SOLO CARGA EL JPANEL Y EL MENU SUPERIOR
	private JPanel contentPane;
	private VistaUsuario vistaUsuario;
	private VistaMusic vistaMusic;

	public MainVista() {
		setTitle("MusicDB");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new CardLayout(0, 0));
		setContentPane(contentPane);
		
//		AÑADIMOS LOS PANELES, QUE LOS TENGA EN CUENTA PARA CUANDO LOS QUERAMOS LLAMAR
		vistaUsuario = new VistaUsuario(this);
		contentPane.add(vistaUsuario,"VistaUsuario");	
		vistaMusic = new VistaMusic(this);
		contentPane.add(vistaMusic,"VistaMusic");
		
//		ESTOS METODOS LLAMARAN A LOS PANELES
		
	}
	public void VistaUsuario(){
				
		CardLayout cL = (CardLayout)contentPane.getLayout();
		cL.show(contentPane, "VistaUsuario");		
}

	public void VistaMusic(){
		
		CardLayout cL = (CardLayout)contentPane.getLayout();
		cL.show(contentPane, "VistaMusic");
	}
}

		
	

