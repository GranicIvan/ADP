package domaci3.app;

import java.util.ArrayList;
import java.util.List;

import domaci3.press.subject.News;

public class NewsRepo {

	private List<News> vesti;
	
	public NewsRepo() {
		vesti = new ArrayList<News>();
	}

	public List<News> getNews(){
		return vesti;
	}
	
	public void addNews(News... news){
		for(News vest : news) {
			vesti.add(vest);
		}
	}
	
}
