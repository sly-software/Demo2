package TextIO.java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test {

	public static void main(String[] args) throws IOException{
		try (ObjectOutputStream output = new ObjectOutputStream (new FileOutputStream("object.dat"));){
			output.writeObject(new A());
		}
	}
}

@SuppressWarnings("serial")
class A implements Serializable{
	B b = new B();
}

class B implements Serializable{
	
}
