package controllers;

import java.sql.*;
import java.util.Map;

import play.*;
import play.mvc.*;
import play.mvc.Http.RequestBody;
import views.html.*;

public class TestClass extends Controller {
	
	public Result testen() {
		
		Map<String, String[]> daten = request().body().asFormUrlEncoded();
		
		String hallo = "Hallo";
		
		return ok(hallo);
		
		
	}

}
