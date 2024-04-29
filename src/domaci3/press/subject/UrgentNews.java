package domaci3.press.subject;

import java.time.LocalDate;
import java.util.Date;

public class UrgentNews extends News{

	public UrgentNews(String title, LocalDate created, String content) {
		super(title, created, content);
	}

	@Override
	public String printTitle() {
		return title.toUpperCase();
	}

	@Override
	public String printDate() {
		return created.toString();
	}

}
