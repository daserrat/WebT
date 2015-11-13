package controllers;

import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import play.*;
import play.mvc.BodyParser;                     
import play.mvc.Result;
import play.libs.Json;
import play.libs.Json.*;
import play.mvc.*;
import views.html.*;

public class Profil extends Controller {
	
	//@BodyParser.Of(BodyParser.Json.class)
	public Result eigenestellen() {
		
		System.out.println("Ich war im Controller");
		
		String emailCookie = request().cookies().get("data").value();
		
		ArrayNode result = model.Model.getInstance().getProfil().eigenestellenholen(emailCookie);
		
		return ok(result);
	}
	
	public Result loeschen(int id_pra) {
		
		//id_pra = request().getQueryString("id_pra");
		
		ObjectNode result = Json.newObject();
		
		System.out.println("Delete id_pra: " + id_pra);
		
		String emailCookie = request().cookies().get("data").value();
		
		boolean ergebnis = model.Model.getInstance().getProfil().stelleLoeschen(emailCookie, id_pra);

		String fehler = "Fehler, E-Mail existiert schon";
		String erfolg = "Stelle erfolgreich gelöscht";
		
		if (ergebnis == true) {

			result.put("status", "ok");
			result.put("message", erfolg);
			
			System.out.println(result);
			
			return ok(result);
			
		} else {
			
			result.put("status", "error");
			result.put("message", fehler);

			return ok(result);
		}
		
		
	}

}
