package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuariosModelo {

		private final static String USUARIOS_SEL="SELECT * FROM usuarios";
		private static String USUARIO_COL="usuario";
		private static String NOMBRE_COL="nombre";

		
		//CONEXION
		private Connection conexion;
		Statement instruccion = null;
		ResultSet conjuntoResultados = null;
			
		//USUARIOSDB
		private static ArrayList<String> usuarios;
		private static ArrayList<String> nombres;
		
		
		public UsuariosModelo(ConexionDB conexion){
			//CON ESTO SE OBTIENE LA BASE DE DATOS
			this.conexion = conexion.getConexion();
			//INCIALIZA EL ARRAY USUARIOS
			usuarios = new ArrayList<String>();
		}
		
		
		public ArrayList<String>getNombres(){
			
			try{
				instruccion = this.conexion.createStatement();
				conjuntoResultados = instruccion.executeQuery(USUARIOS_SEL);
				
//				HAY QUE SACAR LA LISTA DE NOMBRES DE LA BASE DE DATOS
				while(conjuntoResultados.next()){
					nombres.add(conjuntoResultados.getString(NOMBRE_COL));
				}
			}
			catch(SQLException excepcionSql){
				excepcionSql.printStackTrace();	
			}
			return nombres;
		
					
	}
				
		public ArrayList<String>getUsuarios(){
		
			try{
				instruccion = this.conexion.createStatement();
				conjuntoResultados = instruccion.executeQuery(USUARIOS_SEL);
				
				//SACAMOS UNA LISTA POR PANTALLA DE LOS DATOS
				while(conjuntoResultados.next()){
					usuarios.add(conjuntoResultados.getString(USUARIO_COL));
				}
			}
			catch (SQLException excepcionSql){
				excepcionSql.printStackTrace();
			}
		return  usuarios;

	}



}

