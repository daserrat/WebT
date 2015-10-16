package model;

import play.*;
import play.mvc.*;
import views.html.*;

import java.sql.*;

import org.apache.commons.codec.digest.DigestUtils;

public class Registrierung {
	
	public boolean registrieren(String email, String name, String passwort, String passwortw) {
		
		ResultSet rs;
		Connection con;
		PreparedStatement ps;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/staj_db", "root", "root");
			
			System.out.println("Datenbankverbindung hergestellt");
			
			con.setAutoCommit(false);
			
			String hashpw = DigestUtils.md5Hex(passwort);
			
			ps = con.prepareStatement("INSERT INTO staj_db.unternehmen (unt_name, email, passwort) VALUES (?,?,?);");
			
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, hashpw);
			
			ps.executeUpdate();
			
			System.out.println("User in Datenbank gespeichert");
			
			con.commit();
			
			System.out.println("-----------Registriert------------");
			
			return true;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			System.out.println("Dieser Fehler ist aufgetreten: " + e.getMessage());
			e.printStackTrace();
			
			return false;
		}
		
		
		return false;
		
		
	}

}
