package domaci2.printStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public abstract class MyAbsPrintStream  implements MyPrintStream{

	private final File log;
	private PrintWriter pw;
	
	public MyAbsPrintStream(String logPath) throws FileNotFoundException {
		this.log = new File(logPath);
		this.pw = new PrintWriter(log);
	}

	
	@Override
	public void println(String input) {
		pw.print(input + "\n");
		pw.flush();
	}

	
	@Override
	public void close() {
		pw.close();
	}
	
}
