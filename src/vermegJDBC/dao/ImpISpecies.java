package vermegJDBC.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import vermegJDBC.entities.Species;
import vermegJDBC.services.ISpecies;
import vermegJDBC.util.DBConnection;

public class ImpISpecies implements ISpecies{

	@Override
	public int addSpecies(Species obj){
		Connection con = DBConnection.openConnexion();
		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate("insert into species(nom) values('"+obj.getNom()+"')");
			System.out.println("Insertion avec succès!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateSpecies(Species obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteSpecies(Species obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void listSpecies() {
		Connection con = DBConnection.openConnexion();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select id, nom from species");
			while(rs.next()) {
				int id = rs.getInt("id");
			    String name = rs.getString("nom");
			    System.out.println("ID : "+id +" Nom : "+name); 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
