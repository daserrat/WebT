
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/keremuyanik/Documents/WebT/play-java/conf/routes
// @DATE:Tue Oct 20 15:34:49 CEST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:21
  Assets_0: controllers.Assets,
  // @LINE:26
  Registrierung_3: controllers.Registrierung,
  // @LINE:27
  Login_2: controllers.Login,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:21
    Assets_0: controllers.Assets,
    // @LINE:26
    Registrierung_3: controllers.Registrierung,
    // @LINE:27
    Login_2: controllers.Login
  ) = this(errorHandler, Application_1, Assets_0, Registrierung_3, Login_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, Registrierung_3, Login_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.startseite()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """startseite""", """controllers.Application.startseite()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """nichtangemeldet""", """controllers.Application.nichtangemeldet()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suche""", """controllers.Application.suche()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upload""", """controllers.Application.upload()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """stellenangebot""", """controllers.Application.stellenangebot()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.Application.contact()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registrierung""", """controllers.Registrierung.registrierung()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Login.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Login.logout()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_startseite0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_startseite0_invoker = createInvoker(
    Application_1.startseite(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "startseite",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_startseite1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("startseite")))
  )
  private[this] lazy val controllers_Application_startseite1_invoker = createInvoker(
    Application_1.startseite(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "startseite",
      Nil,
      "GET",
      """""",
      this.prefix + """startseite"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_nichtangemeldet2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("nichtangemeldet")))
  )
  private[this] lazy val controllers_Application_nichtangemeldet2_invoker = createInvoker(
    Application_1.nichtangemeldet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "nichtangemeldet",
      Nil,
      "GET",
      """""",
      this.prefix + """nichtangemeldet"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_suche3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suche")))
  )
  private[this] lazy val controllers_Application_suche3_invoker = createInvoker(
    Application_1.suche(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "suche",
      Nil,
      "GET",
      """""",
      this.prefix + """suche"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_upload4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_Application_upload4_invoker = createInvoker(
    Application_1.upload(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "upload",
      Nil,
      "GET",
      """""",
      this.prefix + """upload"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_stellenangebot5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stellenangebot")))
  )
  private[this] lazy val controllers_Application_stellenangebot5_invoker = createInvoker(
    Application_1.stellenangebot(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "stellenangebot",
      Nil,
      "GET",
      """""",
      this.prefix + """stellenangebot"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_contact6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_Application_contact6_invoker = createInvoker(
    Application_1.contact(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "contact",
      Nil,
      "GET",
      """""",
      this.prefix + """contact"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Registrierung_registrierung8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registrierung")))
  )
  private[this] lazy val controllers_Registrierung_registrierung8_invoker = createInvoker(
    Registrierung_3.registrierung(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Registrierung",
      "registrierung",
      Nil,
      "POST",
      """""",
      this.prefix + """registrierung"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Login_login9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Login_login9_invoker = createInvoker(
    Login_2.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Login",
      "login",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Login_logout10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Login_logout10_invoker = createInvoker(
    Login_2.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Login",
      "logout",
      Nil,
      "POST",
      """""",
      this.prefix + """logout"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_startseite0_route(params) =>
      call { 
        controllers_Application_startseite0_invoker.call(Application_1.startseite())
      }
  
    // @LINE:8
    case controllers_Application_startseite1_route(params) =>
      call { 
        controllers_Application_startseite1_invoker.call(Application_1.startseite())
      }
  
    // @LINE:10
    case controllers_Application_nichtangemeldet2_route(params) =>
      call { 
        controllers_Application_nichtangemeldet2_invoker.call(Application_1.nichtangemeldet())
      }
  
    // @LINE:12
    case controllers_Application_suche3_route(params) =>
      call { 
        controllers_Application_suche3_invoker.call(Application_1.suche())
      }
  
    // @LINE:14
    case controllers_Application_upload4_route(params) =>
      call { 
        controllers_Application_upload4_invoker.call(Application_1.upload())
      }
  
    // @LINE:16
    case controllers_Application_stellenangebot5_route(params) =>
      call { 
        controllers_Application_stellenangebot5_invoker.call(Application_1.stellenangebot())
      }
  
    // @LINE:18
    case controllers_Application_contact6_route(params) =>
      call { 
        controllers_Application_contact6_invoker.call(Application_1.contact())
      }
  
    // @LINE:21
    case controllers_Assets_versioned7_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:26
    case controllers_Registrierung_registrierung8_route(params) =>
      call { 
        controllers_Registrierung_registrierung8_invoker.call(Registrierung_3.registrierung())
      }
  
    // @LINE:27
    case controllers_Login_login9_route(params) =>
      call { 
        controllers_Login_login9_invoker.call(Login_2.login())
      }
  
    // @LINE:28
    case controllers_Login_logout10_route(params) =>
      call { 
        controllers_Login_logout10_invoker.call(Login_2.logout())
      }
  }
}