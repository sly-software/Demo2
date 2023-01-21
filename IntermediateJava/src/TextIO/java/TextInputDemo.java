package TextIO.java;

import java.io.File;
import java.io.PrintWriter;

public class TextInputDemo {
	// The main class 
	public static void main(String[] args) throws Exception {
		// Creating file object
		File file = new File("C:\\Users\\user\\eclipse-workspace\\IntermediateJava\\textFiles\\temp.txt");
		
		if (file.exists()) {
			System.out.println("File already exist");
			System.exit(1);
		}
		
		try (
		// writing object
		PrintWriter output = new PrintWriter(file)) {
			output.print("Java 101");
		}
		
		
	}

}
