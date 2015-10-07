package database;

public class DBStarter {
	
	// Diese Klasse dient nur zur einfachen überprüfung der DB Verbindung

	public static void main(String[] args) {
		DBConnector connection = new DBConnector();
		System.out.println("Ich war bei der DB Connection");
	}

}
