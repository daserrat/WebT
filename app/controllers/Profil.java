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
	
	public Result eigenedaten() {
		
		String emailCookie = request().cookies().get("data").value();

		ObjectNode result = model.Model.getInstance().getProfil().eigenedatenholen(emailCookie);

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
	
	public Result emailBearbeiten() {
		
		JsonNode emailBearbeiten = request().body().asJson();
		ObjectNode result = Json.newObject();
		
		String email = emailBearbeiten.get("email").asText();
		String aktPasswort = emailBearbeiten.get("aktPasswort").asText();
		String emailCookie = request().cookies().get("data").value();
		
		boolean ergebnis = model.Model.getInstance().getProfil().emailBearbeiten(email, emailCookie, aktPasswort);
		
		String fehler = "Fehler, E-Mail existiert schon";
		
		if(ergebnis == true) {
			
			response().setCookie("data", email);
			session("a", email);
			String user = session("a");
			
			result.put("status", "ok");
			result.put("message", email);
			
			System.out.println(result);
			
			return ok(result);
		} else {
			result.put("status", "error");
			result.put("message", fehler);

			return ok(fehler);
		}
		
	}
	
	public Result passwortBearbeiten() {
		
		JsonNode passwortBearbeiten = request().body().asJson();
		ObjectNode result = Json.newObject();
		
		String passwort = passwortBearbeiten.get("passwort").asText();
		String aktPasswort = passwortBearbeiten.get("aktPasswort").asText();
		String emailCookie = request().cookies().get("data").value();
		
		boolean ergebnis = model.Model.getInstance().getProfil().passwortBearbeiten(passwort, emailCookie, aktPasswort);
		
		String fehler = "Fehler, Passwort konnte nicht geändert werden";
		
		if(ergebnis == true) {
			
			result.put("status", "ok");
			result.put("message", "Passwort erfolgreich gespeichert");
			
			System.out.println(result);
			
			return ok(result);
		} else {
			result.put("status", "error");
			result.put("message", fehler);

			return ok(fehler);
		}
		
	}
	
	public Result bearbeiten(int id_pra) {
		
		JsonNode bearbeiten = request().body().asJson();
		
		String titel = bearbeiten.get("titel").asText();
		String beschreibung = bearbeiten.get("beschreibung").asText();
		String stadt = bearbeiten.get("stadt").asText();
		String bundesland = bearbeiten.get("bundesland").asText();
		String link = bearbeiten.get("link").asText();
		int dauer = bearbeiten.get("dauer").asInt();
		String datum = bearbeiten.get("datum").asText();
		
		String studiengang = "";
		
		for(int i = 0; i < bearbeiten.get("studiengang").size(); i++) {
			
			//studiengang[i] = upload.findPath("studiengang").get(i).asText();	
			studiengang += bearbeiten.findPath("studiengang").get(i).asText() + ",";
		}
		
		studiengang = studiengang.substring(0, studiengang.length()-1);
		
		System.out.println("Titel: " + titel);
		System.out.println("Besch: " + beschreibung);
		System.out.println("stadt: " + stadt);
		System.out.println("bundesland: " + bundesland);
		System.out.println("link: " + link);
		System.out.println("studiengang: " + studiengang);
		System.out.println("dauer: " + dauer);
		System.out.println("datum: " + datum);



		ObjectNode result = Json.newObject();
		
		System.out.println("Bearbeite id_pra: " + id_pra);
		
		String emailCookie = request().cookies().get("data").value();
		
		boolean ergebnis = model.Model.getInstance().getProfil().stelleBearbeiten(emailCookie, id_pra,
				titel, beschreibung, stadt, bundesland, link, studiengang, dauer, datum);

		String fehler = "Fehler";
		String erfolg = "Stelle erfolgreich upgedated";
		
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
