package controllers;

import java.util.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import play.*;
import play.mvc.BodyParser;                     
import play.libs.Json;
import play.libs.Json.*;
import play.mvc.*;
import play.mvc.Http.Cookie;
import views.html.*;

public class Upload extends Controller {
	
	public Result upload() {
		
		JsonNode upload = request().body().asJson();
		
		ObjectNode result = Json.newObject();
		
		String titel = upload.get("titel").asText();
		String link = upload.get("link").asText();
		String beschreibung = upload.get("beschreibung").asText();
		String stadt = upload.get("stadt").asText();
		String bundesland = upload.get("bundesland").asText();
		String datum = upload.get("datum").asText();
		int dauer = upload.get("dauer").asInt();
		
		//String studiengang = new String[2];
		String studiengang = "";
		
		System.out.println(upload.get("studiengang").size());
		System.out.println(upload.get("studiengang"));
		
		for(int i = 0; i < upload.get("studiengang").size(); i++) {
			
			//studiengang[i] = upload.findPath("studiengang").get(i).asText();	
			studiengang += upload.findPath("studiengang").get(i).asText() + ",";
		}
		
		studiengang = studiengang.substring(0, studiengang.length()-1);

		String emailCookie = request().cookies().get("data").value();
		
		System.out.println("Coookie: " + emailCookie);
			
		boolean ergebnis = model.Model.getInstance().getUpload().uploaden(emailCookie,titel,link,studiengang,beschreibung,stadt,
																			bundesland,datum,dauer);
		
		String erfolg = "Das Stellenangebot wurde erfolgreich eingetragen.";
		String fehler = "Angebot konnte nicht erstellt werden.";
		
		if (ergebnis == true) {
					
			result.put("status", "ok");
			result.put("message", erfolg);
			
			System.out.println(result);
			
			return ok(result);
			
		} else {
			
			result.put("status", "error");
			result.put("message", fehler);

			return badRequest(result);
		}
						
	}

}
