import java.io.*;
import java.nio.file.*;
import java.nio.charset.Charset;
import java.util.*;

public class ReadFileLine{
	public static void main(String[] args) {
		//ArrayList<Integer> list1 = new ArrayList<Integer>();
		//List<String> list2 = new ArrayList<String>();
		// list1.add(1);
		// list1.remove(1);
		try{
			List<String> lines = Files.readAllLines(Paths.get("./input.txt"));
			for(String line:lines){
			  System.out.println(line);
			}
		} catch(Exception e){
			e.printStackTrace();
		}

		/*String line;
		try (
		    InputStream fIn = new FileInputStream("input.txt");
		    InputStreamReader isr = new InputStreamReader(fIn, "UTF-8");
	    	BufferedReader br = new BufferedReader(isr);

			FileOutputStream fOut = new FileOutputStream("output.txt");
		    InputStreamReader isw = new InputStreamReader(fOut, "UTF-8");
		    BufferedWriter bw = new BufferedWriter(isw);
		) {
		    while ((line = br.readLine()) != null) {
		        System.out.println(line);

		    }
		} catch(IOException e){
			e.printStackTrace();
		}*/
	}
}