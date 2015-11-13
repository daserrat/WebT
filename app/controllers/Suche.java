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

public class Suche extends Controller{
	public Result suchen(){
		JsonNode suche = request().body().asJson();
		
		ObjectNode result = Json.newObject();
		
		String studiengang = suche.get("studiengang").asText();
		String dauer = suche.get("dauer").asText();
		String bundesland = suche.get("bundesland").asText();
		
		result = model.Model.getInstance().getSuche().suchen(bundesland, dauer, studiengang);
		return null;
	}
}
