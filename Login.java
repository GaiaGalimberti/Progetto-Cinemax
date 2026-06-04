package bin;

public class Login{
	//campi
	String username;
	String password;

	//costruttore
	public Login(String username, String password){
		this.username = username;
		this.password = password;
	}

	//metodi
	public boolean login(Utente utente){
		if(utente.getUsername() == username && utente.getPassword() == password)
			return true;
		else
			System.out.println("username o password non corretti");
			return false;
	}
}