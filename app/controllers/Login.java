package controllers;

import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import play.*;
import play.mvc.BodyParser;                     
import play.libs.Json;
import play.libs.Json.*;
import play.mvc.*;
import views.html.*;

public class Login extends Controller {
	
	public Result login() {
		
		JsonNode logindaten = request().body().asJson();
		
		ObjectNode result = Json.newObject();
		
		String email = logindaten.get("email").asText();
		String passwort = logindaten.get("passwort").asText();
		
		boolean ergebnis = model.Model.getInstance().getLogin().login(email,passwort);
		
		String fehler = "Falsche E-Mail oder Passwort";
		
		if (ergebnis == true) {
			
			response().setCookie("data", email);
			session("a", email);
			String user = session("a");
			
			System.out.println("ICH WAR IN TRUE DRIN BEIM LOGIN");
			
			result.put("status", "ok");
			result.put("message", email);
			
			System.out.println(result);
			
			return ok(result);
			
	
		} else {
			
			result.put("status", "error");
			result.put("message", fehler);

			return ok(result);
		}
		
		
	}
	
	public Result logout() {
		
		System.out.println("abgemeldet");
		response().discardCookie("data");
		session().clear();

		return ok();
		
	}

}
