package model;

public class Model {
	
	private static Model instance;
	
	Registrierung registrierung = new Registrierung();
	
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
