
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/keremuyanik/Documents/WebT/play-java/conf/routes
// @DATE:Fri Nov 06 17:48:18 CET 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:23
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:31
  class ReverseRegistrierung(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def registrierung: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Registrierung.registrierung",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registrierung"})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseProfil(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def loeschen: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Profil.loeschen",
      """
        function(id_pra) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "stelleLoeschen/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id_pra", id_pra)})
        }
      """
    )
  
    // @LINE:27
    def eigenestellen: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Profil.eigenestellen",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "eigeneStellen"})
        }
      """
    )
  
  }

  // @LINE:32
  class ReverseLogin(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Login.logout",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:32
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Login.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseUpload(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def upload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Upload.upload",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
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
  
    // @LINE:20
    def profil: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.profil",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profil"})
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