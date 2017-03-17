/*
String next()	it returns the next token from the scanner.

String nextLine()	it moves the scanner position to the next line and returns the value as a string.

byte nextByte()	it scans the next token as a byte.

short nextShort()	it scans the next token as a short value.

int nextInt()	it scans the next token as an int value.

long nextLong()	it scans the next token as a long value.

float nextFloat()	it scans the next token as a float value.

double nextDouble()	it scans the next token as a double value.
*/

import java.util.Scanner;

public class ScannerTest{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String myInput;
		
		sp("Enter Name : ", false);
		myInput = scanner.next();
		sp("The entered name is: " + myInput, true);
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