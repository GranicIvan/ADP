package domaci3.press.subject;

import java.time.LocalDate;
import java.util.Date;

public class RegularNews extends News{

	public RegularNews(String title, LocalDate created, String content) {
		super(title, created, content);
		
	}

	@Override
	public String printTitle() {
		return title;
	}

	@Override
	public String printDate() {
		return created.plusDays(1).toString();
	}

}
