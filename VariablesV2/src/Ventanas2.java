//JORGE OMBUENA GONZALEZ

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Ventanas2 extends JFrame {

    private JPanel contentPane;
    private JTextField caja, caja2, caja3, caja4;
    String nombreCaja, edadCaja, direccionCaja, emailCaja;
    private JLabel lblEdad, lblEmail;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	  EventQueue.invokeLater(new Runnable() {
		public void run() {
		    try {
		    Ventanas2 frame = new Ventanas2();
		    frame.setVisible(true);
		    } catch (Exception e) {
		    e.printStackTrace();
		    }
		}
	  });
    } 

    /**
     * Create the frame.
     */
    public Ventanas2(){
	  //ZONA DE VARIABLES
	  int edad=26;
	  nombreCaja = "Jorge Ombuena Gonzalez";
	  direccionCaja= "Avda. Cami Real 74 ";
	  emailCaja=" Takumakun@gmail.com ";
	  
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setBounds(100, 100, 400, 300);
	  contentPane = new JPanel();
	  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	  setContentPane(contentPane);
	  contentPane.setLayout(null);

	  //JTextField PARA MOSTRAR INFORMACIÓN
	  caja = new JTextField();
	  caja.setBounds(15, 35, 184, 30);
	  contentPane.add(caja); 
	  caja.setColumns(10);
	  //VAMOS A HACER OTRA CAJA PARA PONER LA EDAD
	  caja2 = new JTextField();
	  caja2.setBounds(15,90,45,20);
	  contentPane.add(caja2);
	  caja2.setColumns(10);
	  //Y AHORA LA CAJA DE LA DIRECCION
	  caja3 = new JTextField();
	  caja3.setBounds(100, 90, 175, 20);
	  contentPane.add(caja3);
	  caja3.setColumns(10);
	  //LA ULTIMA CAJA ES LA DEL CORREO ELECTRONICO
	  caja4 = new JTextField();
	  caja4.setBounds(15,130,175,20);
	  contentPane.add(caja4);
	  caja4.setColumns(10);
	  
	  // ETIQUETAS
	  
	  // 1
	  JLabel lblNewLabel = new JLabel("Nombre completo");
	  lblNewLabel.setBounds(15, 15, 150, 20);
	  contentPane.add(lblNewLabel);
	  // 2
	  lblEdad = new JLabel("Edad");
	  lblEdad.setBounds(15, 75, 45, 15);
	  contentPane.add(lblEdad);
	  // 3
	  JLabel lblDireccion = new JLabel("Direccion");
	  lblDireccion.setBounds(100, 75, 81, 15);
	  contentPane.add(lblDireccion);
	  //4
	  lblEmail = new JLabel("Email");
	  lblEmail.setBounds(15,115,100,15);
	  contentPane.add(lblEmail);
	  
	  
	  //VISUALIZAR LA VARIABLE
	  edadCaja=Integer.toString(edad);
	  caja.setText(nombreCaja);
	  caja2.setText(edadCaja);
	  caja3.setText(direccionCaja);
	  caja4.setText(emailCaja);
	
	  //BOTONES 
	  JButton btnOk = new JButton("OK");
	  btnOk.addActionListener(new ActionListener() {
	  	public void actionPerformed(ActionEvent arg0) {
	  	   System.exit(0);
	  	}
	  });
	  btnOk.setBounds(80, 225, 89, 23);
	  contentPane.add(btnOk);
	  
	  JButton botonRestart = new JButton("Restart");
	  botonRestart.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			caja.setText("");
			caja2.setText("");
			caja3.setText("");
			caja4.setText("");
	  	}
	  });
	  {
	  	
	  };
	  botonRestart.setBounds(210, 225, 89, 23);
	  contentPane.add(botonRestart);
	  
    }
}
