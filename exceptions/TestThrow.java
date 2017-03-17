public class TestThrow{  
  static void validate(int age){  
    if(age < 18)  
      throw new ArithmeticException("You are not valid to vote !");  
    else  
      System.out.println("Welcome to vote !");  
  }

  public static void main(String args[]){
    try{
      validate(13);  
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
    System.out.println("Rest of the code...");
  }
}