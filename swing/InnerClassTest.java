import javax.swing.*;

class InnerClassTest {

  public static void main(String args[]){
    
    InnerClassTest inclass = new InnerClassTest();


    InnerClassTest.InnerClass inC = inclass.new InnerClass();
    
    inC.invokeInnerClassMethod();
  }

  private class InnerClass{
    public void invokeInnerClassMethod(){
      System.out.println("This is from inner class.");
    }
  }

  public class AnotherInnerClass{

  }
}

class anotherclass extends InnerClassTest{
    public static void main(String[] args) {
        super();
        InnerClassTest pc = new InnerClassTest();

        InnerClassTest.AnotherInnerClass inC = pc.new AnotherInnerClass();
    }
}