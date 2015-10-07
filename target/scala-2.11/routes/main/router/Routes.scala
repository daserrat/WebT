
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/keremuyanik/Documents/WebT/play-java/conf/routes
// @DATE:Wed Oct 07 22:01:31 CEST 2015

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
  // @LINE:17
  Assets_0: controllers.Assets,
  // @LINE:22
  TestClass_2: controllers.TestClass,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:17
    Assets_0: controllers.Assets,
    // @LINE:22
    TestClass_2: controllers.TestClass
  ) = this(errorHandler, Application_1, Assets_0, TestClass_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, TestClass_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.startseite()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """startseite""", """controllers.Application.startseite()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suche""", """controllers.Application.suche()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upload""", """controllers.Application.upload()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """stellenangebot""", """controllers.Application.stellenangebot()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """testPost""", """controllers.TestClass.testen()"""),
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
  private[this] lazy val controllers_Application_suche2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suche")))
  )
  private[this] lazy val controllers_Application_suche2_invoker = createInvoker(
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

  // @LINE:12
  private[this] lazy val controllers_Application_upload3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_Application_upload3_invoker = createInvoker(
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

  // @LINE:14
  private[this] lazy val controllers_Application_stellenangebot4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stellenangebot")))
  )
  private[this] lazy val controllers_Application_stellenangebot4_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
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

  // @LINE:22
  private[this] lazy val controllers_TestClass_testen6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("testPost")))
  )
  private[this] lazy val controllers_TestClass_testen6_invoker = createInvoker(
    TestClass_2.testen(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TestClass",
      "testen",
      Nil,
      "POST",
      """""",
      this.prefix + """testPost"""
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
    case controllers_Application_suche2_route(params) =>
      call { 
        controllers_Application_suche2_invoker.call(Application_1.suche())
      }
  
    // @LINE:12
    case controllers_Application_upload3_route(params) =>
      call { 
        controllers_Application_upload3_invoker.call(Application_1.upload())
      }
  
    // @LINE:14
    case controllers_Application_stellenangebot4_route(params) =>
      call { 
        controllers_Application_stellenangebot4_invoker.call(Application_1.stellenangebot())
      }
  
    // @LINE:17
    case controllers_Assets_versioned5_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:22
    case controllers_TestClass_testen6_route(params) =>
      call { 
        controllers_TestClass_testen6_invoker.call(TestClass_2.testen())
      }
  }
}