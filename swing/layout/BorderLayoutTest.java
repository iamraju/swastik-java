import java.awt.*;  
import javax.swing.*;
  
public class BorderLayoutTest {  
    JFrame frame;
    BorderLayoutTest(){  
        getGUI();   
    }
    private void getGUI(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // This is for header
        JPanel headerPanel = new JPanel();
        ImageIcon icon = new ImageIcon("icon.gif");
        JLabel logoLabel = new JLabel("Company", icon, JLabel.RIGHT);
        headerPanel.add(logoLabel);
        headerPanel.add(new JButton("Top Button"));
        frame.add(headerPanel, BorderLayout.NORTH);

        // Menu bar
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(0, 1));
        JButton aboutUs = new JButton("About Us");
        aboutUs.setSize(50, 10);

        menuPanel.add(aboutUs);
        menuPanel.add(new JButton("Services"));
        menuPanel.add(new JButton("Features"));
        menuPanel.add(new JButton("Contact Us"));
        menuPanel.add(new JButton("Find Us"));
        frame.add(menuPanel, BorderLayout.WEST);

        // center
        JPanel centerPanel = new JPanel();
        JLabel centerLabel = new JLabel("Center Message");
        centerPanel.add(centerLabel);
        frame.add(centerLabel, BorderLayout.CENTER);

        // This is for right sidebar
        JPanel rightPanel = new JPanel();
        JLabel rightSideBar = new JLabel("Right sidebar");
        rightPanel.add(rightSideBar);
        frame.add(rightPanel, BorderLayout.EAST);

        // Footer
        JPanel southPanel = new JPanel();
        JTextField jtf = new JTextField(20);
        southPanel.add(jtf);
        frame.add(southPanel, BorderLayout.SOUTH);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {  
        new BorderLayoutTest();
    }
} 