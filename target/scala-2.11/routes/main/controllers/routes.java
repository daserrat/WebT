
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/keremuyanik/Documents/WebT/play-java/conf/routes
// @DATE:Sun Oct 25 21:47:32 CET 2015

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseRegistrierung Registrierung = new controllers.ReverseRegistrierung(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProfil Profil = new controllers.ReverseProfil(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLogin Login = new controllers.ReverseLogin(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUpload Upload = new controllers.ReverseUpload(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseRegistrierung Registrierung = new controllers.javascript.ReverseRegistrierung(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProfil Profil = new controllers.javascript.ReverseProfil(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLogin Login = new controllers.javascript.ReverseLogin(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUpload Upload = new controllers.javascript.ReverseUpload(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
