package domaci3.app;

import java.util.ArrayList;
import java.util.List;

import domaci3.press.observer.User;

public class UserRepo {

	private List<User> korisnici;

	public UserRepo() {
		korisnici = new ArrayList<User>();
	}
	
	
	public List<User> getUsers() {
		return korisnici;
	}

	public void addUsers(User... inputUsers) {
		for (User korisnik : inputUsers) {
			korisnici.add(korisnik);
		}
	}
	
	
	
}
