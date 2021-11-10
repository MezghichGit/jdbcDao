package vermegJDBC.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection openConnexion()
	{
		Connection conn=null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vermegbd2021", "root", "");
			//System.out.println(conn);
		} catch (SQLException e) {
			System.out.println("Problème de connexion à la base");
		}
		return conn;
	}
	
	public static void closeConnexion()
	{
		
	}

}
