import java.awt.*;  
import javax.swing.*;  
  
public class GridLayoutTest extends JFrame{  
    private JLabel lbl;
    private JFrame frame;

    GridLayoutTest(){  
        getGUI();   
    }

    private void getGUI(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(3, 3));
        lbl = new JLabel("Grid Layout Test", JLabel.CENTER);
        
        add(lbl);
        
        setSize(300, 300);  
        setVisible(true);  
    }

    private void addButtons(){
        setTitle("Grid Layout in Java");
        
        //JPanel controlPanel = new JPanel();
        //controlPanel.setLayout(new FlowLayout());

        JPanel panel = new JPanel();

        panel.setBackground(Color.darkGray);
        panel.setSize(300, 300);

        GridLayout layout = new GridLayout(0, 2);
        layout.setHgap(10);
        layout.setVgap(10);

        panel.setLayout(layout);
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));
        
        add(panel);

        //add(controlPanel);
        setVisible(true);
    }

    public static void main(String[] args) {  
        /*new GridLayoutTest();*/

        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                GridLayoutTest gridLayoutTest = new GridLayoutTest();
                gridLayoutTest.addButtons();
            }
        });
    }
} 