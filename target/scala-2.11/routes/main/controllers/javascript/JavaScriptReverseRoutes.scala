
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/keremuyanik/Documents/WebT/play-java/conf/routes
// @DATE:Tue Oct 20 15:34:49 CEST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:27
  class ReverseLogin(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Login.logout",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:27
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Login.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseRegistrierung(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def registrierung: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Registrierung.registrierung",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registrierung"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def upload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.upload",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
        }
      """
    )
  
    // @LINE:12
    def suche: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.suche",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suche"})
        }
      """
    )
  
    // @LINE:10
    def nichtangemeldet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.nichtangemeldet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "nichtangemeldet"})
        }
      """
    )
  
    // @LINE:16
    def stellenangebot: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.stellenangebot",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stellenangebot"})
        }
      """
    )
  
    // @LINE:6
    def startseite: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.startseite",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
    // @LINE:18
    def contact: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.contact",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
        }
      """
    )
  
  }


}