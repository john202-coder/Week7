/**
 * 
 */
package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbException;

/**
 * 
 */
public class DbConnection {
private static final String SCHEMA = "projects";
private static final String USER = "projects";
private static final String PASSWORD = "projects";
private static final String HOST ="localhost";
private static final int PORT = 3306;

public static Connection getconnection() {
	String url = String.format ("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false", 
			HOST, PORT, SCHEMA, USER, PASSWORD);
	
	System.out.println("Connenecting with url=" + url );
	
	
		try {
			Connection conn = DriverManager.getConnection(url);
			System.out.println("Successfully Obtained Connection!");
			return conn;
		
		} catch (SQLException e) {
			System.out.println("Error getting Connection.");
			throw new DbException(e);
		}
	}
}

