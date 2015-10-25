package controllers;

import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import play.*;
import play.mvc.BodyParser;                     
import play.mvc.Result;
import play.libs.Json;
import play.libs.Json.*;
import play.mvc.*;
import views.html.*;

public class Profil extends Controller {
	
	@BodyParser.Of(BodyParser.Json.class)
	public Result eigenestellen() {
		
		String emailCookie = request().cookies().get("data").value();
		
		ObjectNode result = Json.newObject();
		
		return ok();
	}

}
