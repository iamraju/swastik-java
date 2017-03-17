import java.awt.*;  
import javax.swing.*;  
  
public class BorderLayoutTest {  
    JFrame f;
    BorderLayoutTest(){  
        getGUI();   
    }
    private void getGUI(){
        f = new JFrame();

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b1 = new JButton("NORTH");
        JButton b2 = new JButton("SOUTH"); 
        JButton b3 = new JButton("EAST");
        JButton b4 = new JButton("WEST");
        JButton b5 = new JButton("CENTER");
        b5.setBounds(5, 5, 50, 50);
        JButton b6 = new JButton("CENTER1");
        b6.setBounds(60, 60, 50, 50);

        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);  
        f.add(b3,BorderLayout.EAST);  
        f.add(b4,BorderLayout.WEST);  
        f.add(b5,BorderLayout.CENTER);
        f.add(b6,BorderLayout.CENTER);
          
        f.setSize(300, 300);  
        f.setVisible(true);  
    }
    public static void main(String[] args) {  
        new BorderLayoutTest();
    }
} 