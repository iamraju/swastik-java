import java.io.*;

import java.nio.file.*;
import java.nio.charset.Charset;
import java.util.*;

public class WriteToFile{
	public static void main(String[] args) {
		try
		{
			String filename = "students.txt";
			FileWriter fw = new FileWriter(filename, true); //the true will append the new data
			FileReader in = new FileReader(filename);

			Console console = System.console();
			Scanner scanner = new Scanner(System.in);

			try{
				if(Integer.parseInt(args[0]) == 1){
					int rollno;
					String name, address;

					System.out.print("Roll No. : ");
					rollno = scanner.nextInt();

					name = console.readLine("Full Name: ");
					console.flush();
					address = console.readLine("Address: ");

					// Write title if the file students.txt is empty
					/*if(file.read() != -1){
						fw.write("rollno-name-address\n");
					}*/

					fw.write(rollno + "-" + name + "-" + address + "\n");
					fw.close();
				}
				
			} catch(Exception e){
				e.printStackTrace();
			} finally {
				fw.close();
			}

			listStudents(filename);
		}
		catch(IOException ioe)
		{
			System.err.println("IOException: " + ioe.getMessage());
		}
	}

	public static void listStudents(String filename){
		try{
			List<String> lines = Files.readAllLines(Paths.get(filename));
			System.out.println("RollNo.\t | Name \t\t | Address");
			System.out.println("------------------------------------------------------");
			
			for(String line: lines){
	      		String[] student = line.split("-");
				for(int i = 0; i < student.length; i++){
					System.out.print(student[i] + "\t");
					if(i < student.length - 1){
						System.out.print(" | ");
					}
				}
				System.out.print("\n");
				//System.out.println(student[0] + "\t | " + student[1] + "\t\t | " + student[2]);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}