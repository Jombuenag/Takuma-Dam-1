package vista;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;

public class VistaApp extends JFrame {

	private JPanel contentPane;
	private JTextField nomUsuario;
	private JTextField passUsuario;
	private JLabel lblNewLabel;
	private JLabel lblUser;
	private JLabel lblContrasea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaApp frame = new VistaApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public VistaApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 475);
	
		
			//BARRA DEL MENU
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
			//BOTONES
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(265, 115, 90, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(265, 150, 90, 25);
		contentPane.add(btnNewButton_1);
	
			//TEXTO
		nomUsuario = new JTextField();
		nomUsuario.setBounds(15, 250, 175, 20);
		contentPane.add(nomUsuario);
		nomUsuario.setColumns(10);
		
		passUsuario = new JTextField();
		passUsuario.setBounds(15, 300, 175, 20);
		contentPane.add(passUsuario);
		passUsuario.setColumns(10);
		
		
			//IMAGEN
		lblNewLabel = new JLabel("IMAGEN");
		lblNewLabel.setBounds(15, 15, 175, 175);
		contentPane.add(lblNewLabel);
		
		lblUser = new JLabel("Usuario :");
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUser.setBounds(15, 210, 85, 40);
		contentPane.add(lblUser);
		
		lblContrasea = new JLabel("Contrase\u00F1a :");
		lblContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblContrasea.setBounds(15, 265, 110, 40);
		contentPane.add(lblContrasea);
		
	}
}
