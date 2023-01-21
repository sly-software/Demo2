package TextIO.java;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {
	public static void main(String[] args) throws IOException{
		// Create an output stream for file temp.dat
		try (
			DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
				){
			// Write student test scores to the file
			output.writeUTF("John");
			output.writeDouble(85.5);
			output.writeUTF("Jim");
			output.writeDouble(185.5);
			output.writeUTF("George");
			output.writeDouble(105.25);
		}
		
		// Read student test scores from the file 
		try (
			DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
				){
			System.out.println(input.readUTF() + " " + input.readDouble());
			System.out.println(input.readUTF() + " " + input.readDouble());
			System.out.println(input.readUTF() + " " + input.readDouble());
		}
		
	}

}
