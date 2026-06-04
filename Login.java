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
	public boolean login(String username, String password){
		if(Utente.getUsername() == username && Utente.getPassword() == password)
			return true;
		else
			system.out.println("username o password non corretti");
			return false;
	}