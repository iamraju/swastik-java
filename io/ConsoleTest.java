/*
1	void flush()
This method flushes the console and forces any buffered output to be written immediately.

2	Console format(String fmt, Object... args)
This method writes a formatted string to this console's output stream using the specified format string and arguments.

3	Console printf(String format, Object... args)
This method is used to write a formatted string to this console's output stream using the specified format string and arguments.

4	Reader reader()
This method retrieves the unique Reader object associated with this console.

5	String readLine()
This method reads a single line of text from the console.

6	String readLine(String fmt, Object... args)
This method provides a formatted prompt, then reads a single line of text from the console.

7	char[] readPassword()
This method reads a password or passphrase from the console with echoing disabled.

8	char[] readPassword(String fmt, Object... args)
This method provides a formatted prompt, then reads a password or passphrase from the console with echoing disabled.

9	PrintWriter writer()
This method retrieves the unique PrintWriter object associated with this console.
*/

import java.io.Console;
import java.util.*;

public class ConsoleTest{
	public List<String> names = new ArrayList<String>();
	public List<Integer> ages = new ArrayList<Integer>();

	public static void main(String[] args) {
		Console console = System.console();
		Scanner scanner = new Scanner(System.in);
		ConsoleTest ct = new ConsoleTest();

		String name;
		int age;

		name = console.readLine("Enter Name: ");
		
		sp("Enter Age : ", false);
		age = scanner.nextInt();
		ct.ages.add(age);
		sp(ct.names(0));

		//sp("The entered name is: " + ct.names(0) + " and age is: " + ct.ages(0), true);
	}

	public static void sp(String str, Boolean isNewLn){
		if(isNewLn == true){
			System.out.println(str);
		}
		else{
			System.out.print(str);
		}
	}
}