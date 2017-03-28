import java.awt.*;
import javax.swing.*;

public class GridBagTest {
    public static void addComponentsToPane(Container pane) {

        JButton jbnButton;
        pane.setLayout(new GridBagLayout());
        GridBagConstraints gBC = new GridBagConstraints();
        gBC.fill = GridBagConstraints.HORIZONTAL;

        jbnButton = new JButton("Button 1");
        gBC.weightx = 0.5;
        gBC.gridx = 0;
        gBC.gridy = 0;
        pane.add(jbnButton, gBC);

        JTextField jtf = new JTextField("TextField 1");
        gBC.gridx = 2;
        gBC.gridy = 0;
        jtf.setEditable(false);
        pane.add(jtf, gBC);

        jbnButton = new JButton("Button 3");
        gBC.gridx = 3;
        gBC.gridy = 0;
        pane.add(jbnButton, gBC);

        jbnButton = new JButton("Button x");
        gBC.gridx = 4;
        gBC.gridy = 0;
        pane.add(jbnButton, gBC);

        jbnButton = new JButton("Button 4");
        gBC.ipady = 20; //This component has more breadth compared to other buttons
        gBC.weightx = 0.0;
        gBC.gridwidth = 4;
        gBC.gridx = 0;
        gBC.gridy = 1;
        pane.add(jbnButton, gBC);

        JComboBox countries = new JComboBox<>(new String[]{"Nepal","Bangladesh","Bhutan", "Maldivs", "Pakistan", "Sri Lanka"});
        gBC.ipady = 0;
        gBC.weighty = 1.0;
        gBC.anchor = GridBagConstraints.PAGE_END;
        gBC.insets = new Insets(10, 0, 0, 0);  //Padding
        gBC.gridx = 2;
        gBC.gridwidth = 2;
        gBC.gridy = 4;
        pane.add(countries, gBC);
    }

    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("GridBagLayout Source Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
 }