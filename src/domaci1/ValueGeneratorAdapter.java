package domaci1;

public class ValueGeneratorAdapter {

	public ValueGeneratorAdapter() throws InterruptedException {
		ValueGenerator.getInstanceVG().generate(Application.MIN, Application.MAX);
		Thread.sleep(20); // Novi Thread se ne napravi dovoljno brzo i onda prvi vrednost je uvek 0
	}
	
	
	//Ovo je adapter 
	public Stock getValue() throws InterruptedException {
		
		Stock stock = new Stock(ValueGenerator.getInstanceVG().getCurrentValue());
		return stock;
	}

	
	
}
