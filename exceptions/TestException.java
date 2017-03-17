public class TestException {
	public static void main(String[] args) {
		// Look at the script without try... catch
		/*int data = 50 / 0;  
		System.out.println("rest of the code..."); */

		// Look with exception handled - ArithmeticException
		
		/*try{
			int data = 50 / 0;
		} catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("rest of the code...");*/

		// Multiple catch blocks
		/*try{  
			int a[] = new int[5];
			a[7] = 30 / 2;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of bounds: \n" + e.getMessage());
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic calculation error occured - \n" + e.getMessage());
		}
		catch(Exception e){
			System.out.println("Common task completed" + e.getMessage());
		}

		System.out.println("Rest of the code...");*/

		// Rule: All catch blocks must be ordered 
		// from most specific to most general i.e. catch for 
		// ArithmeticException must come before catch for Exception

		// The following will throw a compile time error because very general exception Exception is caught first
		try{  
			int a[] = new int[5];
			a[5] = 30 / 0;
		}
		catch(Exception e){
			System.out.println("common task completed");
		}
		catch(ArithmeticException|ArrayIndexOutOfBoundsException e){
			System.out.println("Either Arithmetic or ArrayIndexOutOfBounds exception caught.");
		}

		System.out.println("rest of the code...");
	}
}