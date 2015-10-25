package model;

import play.*;
import play.mvc.*;
import play.mvc.Http.Cookie;
import views.html.*;

import java.net.HttpCookie;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;

public class Upload {
	
	
	public boolean uploaden(String emailCookie, String titel, String link, String studiengang, String beschreibung, String stadt, 
			String bundesland, String datum, int dauer) {
		
		ResultSet rs;
		Connection con;
		PreparedStatement ps;
		int id_unt_db = 0;
		
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
					
			ps = con.prepareStatement("INSERT INTO staj_db.praktikumsangebot (id_unt, titel, beschreibung, stadt, bundesland, "
					+ "link, studiengang, dauer, datum) VALUES (?,?,?,?,?,?,?,?,?);");
			
			ps.setInt(1, id_unt_db);
			ps.setString(2, titel);
			ps.setString(3, beschreibung);
			ps.setString(4, stadt);
			ps.setString(5, bundesland);
			ps.setString(6, link);
			ps.setString(7, studiengang);
			ps.setInt(8, dauer);
			ps.setString(9, datum);
			
			ps.executeUpdate();
			
			con.commit();
			
			System.out.println("------------Stelle eingetragen------------");
			
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
