package domaci2.command;

import domaci2.printStream.MyPrintStream;

public class AllLowerCase extends Command{

	public AllLowerCase(MyPrintStream output) {
		super(output);
		
	}

	@Override
	protected Object process(String input) {
		
		return input.toLowerCase();
	}

}
