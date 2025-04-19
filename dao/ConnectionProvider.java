
package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    
    
	private static final String URL = "jdbc:mysql://localhost:3306/projects?useSSL=false&serverTimezone=UTC";

    private static final String USER = "root";
    private static final String PASSWORD = "Trainz01";  

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("❌ JDBC Error: " + e.getMessage());  // Print the actual cause
            throw new RuntimeException("Error connecting to the database", e);
        }
    }

}



