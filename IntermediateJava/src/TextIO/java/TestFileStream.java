package TextIO.java;

import java.io.*;

public class TestFileStream {
	public static void main(String[] args) throws Exception{
		
		// Create an output stream to the file
		FileOutputStream output = new FileOutputStream("temp.dat");
		// Output value to the file
		for (int i = 1; i < 10; i++) {
			output.write(i);
		}
		
		// Create an input stream 
		FileInputStream input = new FileInputStream("temp.dat");
		// Read value from a file
		int value;
		while ((value = input.read()) != -1) {
			System.out.print(value + " ");
		}
		
		output.close();
		input.close();
	}
}
