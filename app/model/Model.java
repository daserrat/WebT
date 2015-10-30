package model;

public class Model {
	
	private static Model instance;
	
	Registrierung registrierung = new Registrierung();
	Login login = new Login();
	Upload upload = new Upload();
	Profil profil = new Profil();
	
	
	public Profil getProfil() {
		return profil;
	}

	public void setProfil(Profil profil) {
		this.profil = profil;
	}

	public Upload getUpload() {
		return upload;
	}

	public void setUpload(Upload upload) {
		this.upload = upload;
	}

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
