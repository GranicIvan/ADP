package domaci3.press.observer;

import domaci3.press.subject.Subject;

public class User implements Observer{

	private String email;
	
	
	
	public User(String email) {
		super();
		this.email = email;
	}



	@Override
	public void inform(Subject s) {
		System.out.println("Usr:" + email + "receved: " + s);
		
	}
	
	
	public void sendEmail(String target) {
		System.out.println("Usr:" + email + "senty: " + target);
	}



	public String getEmail() {
		
		return email;
	}

}
