package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JuegosModelo {
	
	private final static String JUEGOS_SEL="SELECT * FROM juegos";
	private final static String ALLJUEGOS_SEL="SELECT * FROM juegos WHERE nomJuego =";
	private static String NOMJUEGO_COL="nomJuego";
	private static String GENJUEGO_COL="genJuego";
	private static String PLATJUEGO_COL="platJuego";
	
	
//	CONEXION
	private Connection conexion;
	Statement instruccion = null;
	ResultSet conjuntoResultados = null;
			
//	JUEGOSDB
	private static ArrayList<String> juegos;
	private static ArrayList<String> genJuegos;
	private static ArrayList<String> platJuegos;
	private static ArrayList<String[]> allJuegos;
			
	public JuegosModelo(ConexionDB conexion){
		this.conexion = conexion.getConexion();
//	INICIALICEMOS EL ARRAY JUEGOS
		

	}
	
	public ArrayList<String>getJuegos(){
		juegos = new ArrayList<String>();

		try{
			instruccion = this.conexion.createStatement();
			conjuntoResultados = instruccion.executeQuery(JUEGOS_SEL);
			
//			PARA SACAR LA LISTA DE JUEGOS DE LA BASE DE DATOS
			while(conjuntoResultados.next()){
				juegos.add(conjuntoResultados.getString(NOMJUEGO_COL));
				
			}
		}
		catch(SQLException excepcionSql){
			excepcionSql.printStackTrace();
		}finally{
			try{
				instruccion.close();
				conjuntoResultados.close();
			}catch(SQLException excepcion){
				excepcion.printStackTrace();
			}
		}
		return juegos;
	}
	
	public ArrayList<String>getGenJuegos(){
		genJuegos = new ArrayList<String>();
		try{
			instruccion = this.conexion.createStatement();
			conjuntoResultados = instruccion.executeQuery(JUEGOS_SEL);
//			PARA SACAR LA LISTA DE GENEREOS DE LOS JUEGOS
			while(conjuntoResultados.next()){
				genJuegos.add(conjuntoResultados.getString(GENJUEGO_COL));
				
			}
		}
		catch(SQLException excepcionSql){
			excepcionSql.printStackTrace();
		}
		return genJuegos;
		
	}
	
	public ArrayList<String>getPlatJuegos(){

		platJuegos = new ArrayList<String>();
		try{
			instruccion = this.conexion.createStatement();
			conjuntoResultados = instruccion.executeQuery(JUEGOS_SEL);
//			PARA SACAR LA LISTA DE PLATAFORMAS
			while(conjuntoResultados.next()){
				platJuegos.add(conjuntoResultados.getString(PLATJUEGO_COL));
			}
		}
		catch(SQLException excepcionSql){
			excepcionSql.printStackTrace();
		}
		return platJuegos;
	}
	
	public ArrayList<String[]>getAllJuegos(String nomJuegoList){
		allJuegos = new ArrayList<String[]>();
		try{
			instruccion = this.conexion.createStatement();
			conjuntoResultados = instruccion.executeQuery("SELECT * FROM juegos WHERE nomJuego='"+nomJuegoList+"'");
//			PARA SACAR LA INFO DE LA LISTA DE JUEGOS
			while(conjuntoResultados.next()){
				String[] allJuegosInfo = new String[3];
					allJuegosInfo[0]=conjuntoResultados.getString(NOMJUEGO_COL);
					allJuegosInfo[1]=conjuntoResultados.getString(GENJUEGO_COL);
					allJuegosInfo[2]=conjuntoResultados.getString(PLATJUEGO_COL);
					allJuegos.add(allJuegosInfo);
			}
		}
		catch(SQLException excepcionSql){
			excepcionSql.printStackTrace();
		}finally{
			try{
				instruccion.close();
				conjuntoResultados.close();
			}catch(SQLException excepcion){
				excepcion.printStackTrace();
			}
		}
		return allJuegos;
	}
	
}
