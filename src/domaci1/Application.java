package domaci1;

public class Application {
	public static final int MIN = 5;
	public static final	int MAX = 20;

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("start");
		
		ValueGeneratorAdapter VGA = new ValueGeneratorAdapter();
		
		Stock s = VGA.getValue();
		System.out.println(s.getStockMarketValue());
		
		Thread.sleep(6000);
		
		s = VGA.getValue();
		System.out.println(s.getStockMarketValue());
		
		
		System.err.println("end");
	}
	
}
