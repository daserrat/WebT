package model;

import play.*;
import play.libs.Json;
import play.mvc.*;
import views.html.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.sql.*;

import org.apache.commons.codec.digest.DigestUtils;

public class Profil {

	public ArrayNode eigenestellenholen(String emailCookie) {
		
		ResultSet rs;
		Connection con;
		PreparedStatement ps;
		int id_unt_db = 0;
		
		ArrayNode allResults = Json.newArray();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/staj_db", "root", "root");
			
			System.out.println("Datenbankverbindung hergestellt");
			
			con.setAutoCommit(false);
			
			System.out.println("Emailcookie: " + emailCookie);
			
			ps = con.prepareStatement("select id_unt from staj_db.unternehmen where email = ?");
			
			ps.setString(1, emailCookie);
			
			rs = ps.executeQuery();
	
			while(rs.next()){
			
				id_unt_db = rs.getInt("id_unt");
				System.out.println("Unt db: " + id_unt_db);
			}
		
		//return;
		
		ps = con.prepareStatement("select id_pra,titel,beschreibung,stadt,bundesland,link,studiengang,dauer,datum from staj_db.praktikumsangebot where id_unt = ?");
		
		ps.setInt(1, id_unt_db);
		
		rs = ps.executeQuery();
		int index = 0;
		
		while(rs.next()) {
			ObjectNode result = Json.newObject();
			result.put("id_pra", rs.getInt("id_pra"));
			result.put("titel", rs.getString("titel"));
			result.put("beschreibung", rs.getString("beschreibung"));
			result.put("stadt", rs.getString("stadt"));
			result.put("bundesland", rs.getString("bundesland"));
			result.put("link", rs.getString("link"));
			result.put("studiengang", rs.getString("studiengang"));
			result.put("dauer", rs.getString("dauer"));
			result.put("datum", rs.getString("datum"));
			
			allResults.insert(index, result);
			index++;
		}
		
		System.out.println("------------Stelle aufgerufen------------");
		
		return allResults;
	
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		
		System.out.println("Dieser Fehler ist aufgetreten: " + e.getMessage());
		e.printStackTrace();
		
		return null;
	}
	
	return null;
		
	}
	
}
