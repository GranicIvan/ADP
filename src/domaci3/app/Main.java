package domaci3.app;

import java.time.LocalDate;
import java.util.Random;

import domaci3.press.observer.User;
import domaci3.press.subject.News;
import domaci3.press.subject.RegularNews;
import domaci3.press.subject.UrgentNews;

public class Main {

	private static UserRepo userRepo = new UserRepo();
	private static NewsRepo newsRepo = new NewsRepo();
	
	
	public static void main(String[] args) {
		
		
		userRepo.addUsers(
				new User("test1@gmail.com"), 
				new User("test2@gmail.com"), 
				new User("test3@gmail.com"),
				new User("test4@gmail.com"));

		newsRepo.addNews(
				new RegularNews("Regular ", LocalDate.now(), "regular txt."),
				new UrgentNews("Urgent ", LocalDate.now(), "urgent txt"));

		for (News news : newsRepo.getNews()) {
			for (User user : userRepo.getUsers()) {
				if (new Random().nextDouble() < 0.5) {
					news.attach(user);
				}
			}
		}

		for (News news : newsRepo.getNews()) {
			news.publish();
		}

		for (User sender : userRepo.getUsers()) {
			for (User target : userRepo.getUsers()) {
				if (new Random().nextDouble() < 0.5) {
					sender.sendEmail(target.getEmail());
				}
			}
		}
		
		
	}
}
