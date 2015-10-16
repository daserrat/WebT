package controllers;

import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import play.*;
import play.api.libs.json.Json;
import play.mvc.*;
import views.html.*;

public class Registrierung extends Controller {
	
	public Result registrierung() {
		
		JsonNode registrierung = request().body().asJson();
						
		String email = registrierung.get("email").toString();
		String name = registrierung.get("name").toString();
		String passwort = registrierung.get("passwort").toString();
		String passwortw = registrierung.get("passwortw").toString();
		
		System.out.println("Registrierungsdaten: " + registrierung);
		
		boolean ergebnis = model.Model.getInstance().getRegistrierung().registrieren(email,name,passwort,passwortw);
		
		String fehler = "Fehler";
		
		if (ergebnis == true) {
			
			response().setCookie("data", email);
			session("a", email);
			String user = session("a");
			
			System.out.println("ICH WAR IN TRUE DRIN");
		
			return ok(NachLogin.render());
			
			//return ok();
			
			//System.out.println("Die Email: " + email);
			
			//JsonNode object;
						
			//return ok(daten);
	
		} else {

			return ok(fehler);
		}
		
	}

}
