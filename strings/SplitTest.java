import java.io.*;

import java.nio.file.*;

public class SplitTest{
	public static void main(String[] args) {
		try{
			FileReader file = new FileReader("input.txt");
			System.out.println(file.read());
		}
		catch(IOException ioe){
			System.err.println("IOException: " + ioe.getMessage());
		}

		/*String name = "Raju Gautam";

		String[] names = name.split(" ");
		System.out.println(names[0]);*/
	}
}