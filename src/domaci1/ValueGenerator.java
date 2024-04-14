package domaci1;

public class ValueGenerator {

	private static ValueGenerator INSTANCE = new ValueGenerator();
	private static final int SLEEP_DURATION_SECOUNDS = 5;
	private double currentValue;

	//
	private ValueGenerator() {

	}

	public double getCurrentValue() {
		return currentValue;
	}

	public Thread generate(double MIN, double MAX) {

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						currentValue = MIN + Math.random() * (MAX - MIN);
						Thread.sleep(SLEEP_DURATION_SECOUNDS * 1000);						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t1.start();

		return t1;
	}

	public static ValueGenerator getInstanceVG() {
		return INSTANCE;
	}

}
