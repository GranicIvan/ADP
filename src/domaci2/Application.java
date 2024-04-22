package domaci2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import domaci2.command.AllLowerCase;
import domaci2.command.AllUpperCase;
import domaci2.command.Command;
import domaci2.command.Regular;
import domaci2.printStream.LowerCaseStream;
import domaci2.printStream.MyPrintStream;
import domaci2.printStream.RegularCase;
import domaci2.printStream.UpperCaseStream;

public class Application {

	private static MyPrintStream lowerCaseStream;
	private static MyPrintStream upperCaseStream;
	private static MyPrintStream regularCaseStream;

	private static Command lowerCaseCommand;
	private static Command upperCaseCommand;
	private static Command regularCaseCommand;

	private static BufferedReader br;
	private static String input;

	public static void main(String[] args) {
		System.out.println("Program started, type:");

		try {
			lowerCaseStream = new LowerCaseStream("logs/lower.txt");
			upperCaseStream = new UpperCaseStream("logs/upper.txt");
			regularCaseStream = new RegularCase("logs/regular.txt");
			
			try {
				lowerCaseCommand =  new AllLowerCase(lowerCaseStream);
				upperCaseCommand =   new AllUpperCase(upperCaseStream);
				regularCaseCommand =  new Regular(regularCaseStream);
				
				br = new BufferedReader(new InputStreamReader(System.in));
				
				while(! "STOP".equals(input)) {
					input = br.readLine();
					
					System.out.println("Input: " + input);
					
					if (Character.isLowerCase(input.charAt(0)))
						lowerCaseCommand.execute(input);
					else if (Character.isUpperCase(input.charAt(0)))
						upperCaseCommand.execute(input);			
					else
						regularCaseCommand.execute(input);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lowerCaseStream.close();
			upperCaseStream.close();
			regularCaseStream.close();
		}

	}
}
