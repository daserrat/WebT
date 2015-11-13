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

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Suche {
	public ObjectNode suchen(String bundesland, String dauer, String studiengang){
		
		ResultSet rs;
		Connection con;
		PreparedStatement ps;
		int id_unt_db = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/staj_db", "root", "root");
			return null;
		}
		catch (ClassNotFoundException e) {
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
