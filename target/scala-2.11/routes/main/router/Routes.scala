
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/keremuyanik/Documents/WebT/play-java/conf/routes
// @DATE:Sun Oct 25 21:47:32 CET 2015

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
  Application_5: controllers.Application,
  // @LINE:23
  Assets_4: controllers.Assets,
  // @LINE:28
  Registrierung_1: controllers.Registrierung,
  // @LINE:29
  Login_3: controllers.Login,
  // @LINE:31
  Upload_0: controllers.Upload,
  // @LINE:35
  Profil_2: controllers.Profil,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_5: controllers.Application,
    // @LINE:23
    Assets_4: controllers.Assets,
    // @LINE:28
    Registrierung_1: controllers.Registrierung,
    // @LINE:29
    Login_3: controllers.Login,
    // @LINE:31
    Upload_0: controllers.Upload,
    // @LINE:35
    Profil_2: controllers.Profil
  ) = this(errorHandler, Application_5, Assets_4, Registrierung_1, Login_3, Upload_0, Profil_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_5, Assets_4, Registrierung_1, Login_3, Upload_0, Profil_2, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profil""", """controllers.Application.profil()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registrierung""", """controllers.Registrierung.registrierung()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Login.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Login.logout()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upload""", """controllers.Upload.upload()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """eigeneStellen""", """controllers.Profil.eigenestellen()"""),
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
    Application_5.startseite(),
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
    Application_5.startseite(),
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
    Application_5.nichtangemeldet(),
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
    Application_5.suche(),
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
    Application_5.upload(),
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
    Application_5.stellenangebot(),
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
    Application_5.contact(),
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

  // @LINE:20
  private[this] lazy val controllers_Application_profil7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profil")))
  )
  private[this] lazy val controllers_Application_profil7_invoker = createInvoker(
    Application_5.profil(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "profil",
      Nil,
      "GET",
      """""",
      this.prefix + """profil"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
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

  // @LINE:28
  private[this] lazy val controllers_Registrierung_registrierung9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registrierung")))
  )
  private[this] lazy val controllers_Registrierung_registrierung9_invoker = createInvoker(
    Registrierung_1.registrierung(),
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

  // @LINE:29
  private[this] lazy val controllers_Login_login10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Login_login10_invoker = createInvoker(
    Login_3.login(),
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

  // @LINE:30
  private[this] lazy val controllers_Login_logout11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Login_logout11_invoker = createInvoker(
    Login_3.logout(),
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

  // @LINE:31
  private[this] lazy val controllers_Upload_upload12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_Upload_upload12_invoker = createInvoker(
    Upload_0.upload(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Upload",
      "upload",
      Nil,
      "POST",
      """""",
      this.prefix + """upload"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Profil_eigenestellen13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eigeneStellen")))
  )
  private[this] lazy val controllers_Profil_eigenestellen13_invoker = createInvoker(
    Profil_2.eigenestellen(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Profil",
      "eigenestellen",
      Nil,
      "GET",
      """""",
      this.prefix + """eigeneStellen"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_startseite0_route(params) =>
      call { 
        controllers_Application_startseite0_invoker.call(Application_5.startseite())
      }
  
    // @LINE:8
    case controllers_Application_startseite1_route(params) =>
      call { 
        controllers_Application_startseite1_invoker.call(Application_5.startseite())
      }
  
    // @LINE:10
    case controllers_Application_nichtangemeldet2_route(params) =>
      call { 
        controllers_Application_nichtangemeldet2_invoker.call(Application_5.nichtangemeldet())
      }
  
    // @LINE:12
    case controllers_Application_suche3_route(params) =>
      call { 
        controllers_Application_suche3_invoker.call(Application_5.suche())
      }
  
    // @LINE:14
    case controllers_Application_upload4_route(params) =>
      call { 
        controllers_Application_upload4_invoker.call(Application_5.upload())
      }
  
    // @LINE:16
    case controllers_Application_stellenangebot5_route(params) =>
      call { 
        controllers_Application_stellenangebot5_invoker.call(Application_5.stellenangebot())
      }
  
    // @LINE:18
    case controllers_Application_contact6_route(params) =>
      call { 
        controllers_Application_contact6_invoker.call(Application_5.contact())
      }
  
    // @LINE:20
    case controllers_Application_profil7_route(params) =>
      call { 
        controllers_Application_profil7_invoker.call(Application_5.profil())
      }
  
    // @LINE:23
    case controllers_Assets_versioned8_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:28
    case controllers_Registrierung_registrierung9_route(params) =>
      call { 
        controllers_Registrierung_registrierung9_invoker.call(Registrierung_1.registrierung())
      }
  
    // @LINE:29
    case controllers_Login_login10_route(params) =>
      call { 
        controllers_Login_login10_invoker.call(Login_3.login())
      }
  
    // @LINE:30
    case controllers_Login_logout11_route(params) =>
      call { 
        controllers_Login_logout11_invoker.call(Login_3.logout())
      }
  
    // @LINE:31
    case controllers_Upload_upload12_route(params) =>
      call { 
        controllers_Upload_upload12_invoker.call(Upload_0.upload())
      }
  
    // @LINE:35
    case controllers_Profil_eigenestellen13_route(params) =>
      call { 
        controllers_Profil_eigenestellen13_invoker.call(Profil_2.eigenestellen())
      }
  }
}