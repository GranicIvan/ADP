package domaci2.command;

import domaci2.printStream.MyPrintStream;

public class Regular extends Command{

	public Regular(MyPrintStream output) {
		super(output);
		
	}

	@Override
	protected Object process(String input) {
		
		return input;
	}

}
		