package TextIO.java;

import java.io.File;
import java.util.Scanner;

public class ReadDataDemo {
	// The main method 
	public static void main(String[] args) throws Exception{
		// A file instance 
		File file = new File("C:\\Users\\user\\eclipse-workspace\\IntermediateJava\\textFiles\\temp.txt");
		
		// Scanner for a file 
		Scanner input = new Scanner(file);
		
		// Read data from a file
		while (input.hasNextLine()) {
			String textString = input.nextLine();
			System.out.println("This is what the file contains: '" + textString + "'");
		}
		
		// Close file 
		input.close();
	}

}
