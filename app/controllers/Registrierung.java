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

public class Registrierung extends Controller {
	
	@BodyParser.Of(BodyParser.Json.class)
	public Result registrierung() {
		
		JsonNode registrierung = request().body().asJson();
		
		ObjectNode result = Json.newObject();
			
		String email = registrierung.get("email").asText();
		String name = registrierung.get("name").asText();
		String passwort = registrierung.get("passwort").asText();
		String passwortw = registrierung.get("passwortw").asText();
		
		System.out.println("Registrierungsdaten: " + registrierung);
		
		boolean ergebnis = model.Model.getInstance().getRegistrierung().registrieren(email,name,passwort,passwortw);
		
		String fehler = "Fehler, E-Mail existiert schon";
		
		if (ergebnis == true) {
			
			response().setCookie("data", email);
			session("a", email);
			String user = session("a");
			
			System.out.println("ICH WAR IN TRUE DRIN");
					
			result.put("status", "ok");
			result.put("message", email);
			
			System.out.println(result);
			
			return ok(result);
			
		} else {
			
			result.put("status", "error");
			result.put("message", fehler);

			return badRequest(fehler);
		}
		
	}

}
