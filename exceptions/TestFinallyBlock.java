/**
* Checked exceptions
* All exceptions other than Runtime Exceptions are known as Checked exceptions as the compiler checks them during compilation to see whether the programmer has handled them or not. If these exceptions are not handled/declared in the program, it will give compilation error.
* - ClassNotFoundException
* - IllegalAccessException
* - NoSuchFieldException
* - EOFException etc.
* 
* Unchecked Exceptions
* Runtime Exceptions are also known as Unchecked Exceptions as the compiler do not check whether the programmer has handled them or not but it’s the duty of the programmer to handle these exceptions and provide a safe exit.
* - ArithmeticException
* - ArrayIndexOutOfBoundsException
* - NullPointerException
* - NegativeArraySizeException etc.
*/

class TestFinallyBlock{  
	public static void main(String args[]){  
		// Case 1, finally executed even if everything goes well
		try{
			int result = 25 / 5;
			System.out.println(result);  
		} catch ( NullPointerException e ) {
			System.out.println("Null " + e.getMessage());
		} finally {
			System.out.println("finally block is always executed");
		}
		
		System.out.println("rest of the code...");

		// Case 2: Finally gets executed even if there is an error
		/*try{  
			int data = 25 / 0;  
			System.out.println(data);  
		} catch ( NullPointerException e ) {
			System.out.println( e );
		}
		finally{
			System.out.println("Finally block is always executed.");
		}
		System.out.println("Rest of the code...");
*/
		// Case 3: Finally is executed even if the proper exception handling is there
		/*try{  
			int data = 25 / 0;  
			System.out.println(data);  
		} catch( ArithmeticException e ) {
			System.out.println( e );
		}
		finally{
			System.out.println("Finally block is always executed.");
		}
		System.out.println("Rest of the code..."); */
	}  
} 