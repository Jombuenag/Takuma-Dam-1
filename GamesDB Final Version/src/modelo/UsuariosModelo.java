package modelo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuariosModelo {

		private final static String USUARIOS_SEL="SELECT * FROM usuarios";
		private final static String USUARIO_COL="usuario";
		
		//CONEXION
		private Connection conexion = null; //ESTO MANEJA LA CONEXION
		private Statement instruccion = null;
		private ResultSet conjuntoResultados = null;
			
		//USUARIOSDB
		private ArrayList<String> usuarios = null;
		
		public UsuariosModelo(){
			//CON ESTO SE OBTIENE LA BASE DE DATOS
			conexion=ConexionDB.getConexion();
			//INCIALIZA EL ARRAY USUARIOS
			usuarios = new ArrayList<String>();
		}
		
		public ArrayList getUsuarios();
			try{
				instruccion = this.conexion.createStatement();
				conjuntoResultados = instruccion.executeQuery(USUARIOS_SEL);
				
				//SACAMOS UNA LISTA POR PANTALLA DE LOS DATOS
				while(conjuntoResultados.next()){
					usuarios.add(conjuntoResultados.getString(USUARIOS_COL));
				}
				return usuarios;
			}
			catch (SQLException excepcionSql){
				excepcionSql.printStackTrace();
				return usuarios;
			}
			finally{
				try{
					conjutonResultados.close();
					instrucion.close();
			}
			catch(SQLException excepcionSql)
			{
				excepcionSql.printStackTrace();
			}
		}
	}
}

