package domaci2.command;

import domaci2.printStream.MyPrintStream;

public abstract class Command {
	
	private final MyPrintStream output;
	

	
	public Command(MyPrintStream output) {
		super();
		this.output = output;
	}




	public void execute(String input) {
		output.println(String.format("%s", process(input)));
	}


	protected abstract Object process(String input);
	
	
}
