package model;

import play.*;
import play.mvc.*;
import views.html.*;

import java.sql.*;

import org.apache.commons.codec.digest.DigestUtils;

public class Login {
	
	public boolean login(String email, String passwort) {
		
		ResultSet rs;
		Connection con;
		PreparedStatement ps;
		String emailDB = "";
		String pwDB = "";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/staj_db", "root", "root");
			
			System.out.println("Datenbankverbindung hergestellt");
			
			Statement stmt = con.createStatement();
			
			rs = stmt.executeQuery("select email, passwort from staj_db.unternehmen");
			
			String hashpw = DigestUtils.md5Hex(passwort);
			
			while(rs.next()) {
				
				emailDB = rs.getString("email");
				pwDB = rs.getString("passwort");
				
				if(email.equals(emailDB) && hashpw.equals(pwDB)) {
					
					return true;
					
				}
				
			}
			
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
