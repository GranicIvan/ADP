package domaci2.command;

import domaci2.printStream.MyPrintStream;

public class AllUpperCase  extends Command{

	public AllUpperCase(MyPrintStream output) {
		super(output);
	}

	@Override
	protected Object process(String input) {
		
		return input.toUpperCase();
	}

}
