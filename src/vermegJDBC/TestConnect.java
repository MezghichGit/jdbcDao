package vermegJDBC;

import java.sql.*;
import java.util.Scanner;

import vermegJDBC.dao.ImpISpecies;
import vermegJDBC.entities.Species;

public class TestConnect {
	public static void main(String[] args) {
		//Connection conn;
		//try {
			//conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vermegbd2021", "root", "");
			//System.out.println(conn);
			//Statement stmt = conn.createStatement();
			
			/*
		    Scanner sc = new Scanner(System.in);
			System.out.println("Donner un nom ");
			String nom = sc.next();
			Species myObj = new Species(nom);
			ImpISpecies daoSpecies = new ImpISpecies();
			daoSpecies.addSpecies(myObj);
			*/
			ImpISpecies daoSpecies = new ImpISpecies();
			daoSpecies.listSpecies();
			
			//int result = stmt.executeUpdate("insert into species(nom) values('"+nom+"')");
			// Insertion
			//int result = stmt.executeUpdate("insert into species(nom) values('Test')");
			//System.out.println(result); 
			//Update
			//int result = stmt.executeUpdate("update species set nom='FISH' where id='2'");
			//System.out.println(result); 
			
			//Delete
			//int result = stmt.executeUpdate("delete from species where id='3'");
			//System.out.println(result);
			/*ResultSet rs = stmt.executeQuery("select id, nom from species");
			while(rs.next()) {
				int id = rs.getInt("id");
			    String name = rs.getString("nom");
			    System.out.println("ID : "+id +" Nom : "+name); 
			}*/
			
		/*} catch (SQLException e) {
			//System.out.println("Problème de connexion à la base");
		}*/
		
	}
}
