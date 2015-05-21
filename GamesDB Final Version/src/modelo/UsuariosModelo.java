package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuariosModelo {

		private final static String USUARIOS_SEL="SELECT * FROM usuarios";
		private static String USUARIO_COL="usuario";
		
		//CONEXION
		private Connection conexion;
		Statement instruccion = null;
		ResultSet conjuntoResultados = null;
			
		//USUARIOSDB
		private ArrayList<String> usuarios;
		
		
		public UsuariosModelo(ConexionDB conexion){
			//CON ESTO SE OBTIENE LA BASE DE DATOS
			this.conexion = conexion.getConexion();
			//INCIALIZA EL ARRAY USUARIOS
			usuarios = new ArrayList<String>();
		}
		
		public ArrayList<String> getUsuarios() {

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
			finally{
				try{
					instruccion.close();
					conjuntoResultados.close();
					conexion.close();
			}
			catch(SQLException excepcionSql){
			excepcionSql.printStackTrace();
			}
		}
		return usuarios;

	}
}

