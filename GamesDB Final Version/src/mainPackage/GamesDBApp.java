package mainPackage;

import modelo.ConexionDB;
import vista.VistaApp;

public class GamesDBApp {
    
	public static void main(String[] args) {
		//ESTABLECER LA CONEXION A LA BASE DE DATOS
		ConexionDB gameDB;
		
		//CREDENCIALES
		gameDB = new ConexionDB("localhost","GamesDB","root","tonphp");
		
		if(gameDB.connectDB()==true)System.out.println("ESTAMOS DENTRO!");
			else System.out.println("ERROR DE ENTRADA");
		
		VistaApp vistaApp = new VistaApp(gameDB);
		vistaApp.setVisible(true);
	}

}
