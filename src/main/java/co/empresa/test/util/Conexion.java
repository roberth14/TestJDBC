package co.empresa.test.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {
	
	private Connection con = null;
	private PreparedStatement preparedStatement;
	
	private static final String url ="jdbc:mysql://localhos:3306/";
	private static final String dbName="prueba";
	private static final String driver="co.mysql.jdbc.Driver";
	private static final String userName="root";
	private static final String password ="";
	
	public Conexion(String driver, String url,String dbName,String userName,String password) {
		try {
		Class.forName(driver).newInstance();
		con = (Connection)DriverManager.getConnection(url+dbName,userName,password);
		}catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
