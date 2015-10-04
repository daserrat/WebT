package controllers;

import play.*;
import play.mvc.*;
import views.html.*;

import views.html.*;

public class Application extends Controller {

    public Result startseite() {
        return ok(startseite.render());
    }

}
