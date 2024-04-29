package domaci3.press.subject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import domaci3.press.observer.Observer;

public abstract class News implements Subject{

	protected String title;
	protected LocalDate created;
	protected String content;
	
	private List<Observer> observers;
	
	
	public News(String title, LocalDate created, String content) {
		super();
		this.title = title;
		this.created = created;
		this.content = content;
		
		this.observers = new ArrayList<>();
	}


	public void publish() {
		for(Observer o : observers) {
			o.inform(this);
		}
	} 


	@Override
	public void attach(Observer o) {
		observers.add(o);
	}
	
	public abstract String printTitle();
	public abstract String printDate();
	
	public String printContent() {
		return content;
	}


	@Override
	public String toString() {
		return "News-" + printTitle() + ",  " + printDate()  + ",  "  + printContent();
	}
	
	
	
	
}
