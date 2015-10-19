package model;

public class Model {
	
	private static Model instance;
	
	Registrierung registrierung = new Registrierung();
	Login login = new Login();

	
	
	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Registrierung getRegistrierung() {
		
		return registrierung;
	}
	
	public void setRegistrierung(Registrierung registrierung) {
		
		this.registrierung = registrierung;
		
	}
	
	
	public static Model getInstance() {
		if (instance == null) {

			instance = new Model();
		}

		return instance;
	}

}
