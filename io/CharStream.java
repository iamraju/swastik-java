import java.io.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.io.Console;

/*
String string = "004-034556";
String[] parts = string.split("-");
String part1 = parts[0]; // 004
String part2 = parts[1]; // 034556
*/

public class CharStream{
	public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("input.txt");
         //out = new FileWriter("output.txt");
         
         int data;
         while ((data = in.read()) != -1) {
            /*out.write(c);*/
            System.out.println(data);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
	}
}