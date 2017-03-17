import java.io.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.nio.file.Files;
import java.util.stream.Stream;

public class HelloWorld{
	public static void main(String[] args) {
		FileWriter out = null;

		try {
			out = new FileWriter("output.txt");

			File file = new File("input.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
				out.write(line);
			}
			fileReader.close();
			System.out.println("Contents of file:");
			System.out.println(stringBuffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}