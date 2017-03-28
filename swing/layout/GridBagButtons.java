import java.awt.*;

import javax.swing.*;

public class GridBagButtons {

  private static final Insets insets = new Insets(0, 0, 0, 0);

  public static void main(final String args[]) {
    final JFrame frame = new JFrame("GridBagLayout");
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new GridBagLayout());
    
    JButton button;

    // Row One - Three Buttons
    // newPanel = new JPanel()
    button = new JButton("tab");
    addComponent(frame, button, 0, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("q");
    addComponent(frame, button, 1, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("w");
    addComponent(frame, button, 2, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("e");
    addComponent(frame, button, 3, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("r");
    addComponent(frame, button, 4, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("t");
    addComponent(frame, button, 5, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("y");
    addComponent(frame, button, 5, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("u");
    addComponent(frame, button, 6, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("i");
    addComponent(frame, button, 7, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("o");
    addComponent(frame, button, 8, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("p");
    addComponent(frame, button, 9, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("{");
    addComponent(frame, button, 10, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("}");
    addComponent(frame, button, 11, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    
    // Row Two - Two Buttons
    button = new JButton("caps lock");
    addComponent(frame, button, 0, 1, 2, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("a");
    addComponent(frame, button, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("s");
    addComponent(frame, button, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("d");
    addComponent(frame, button, 3, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("f");
    addComponent(frame, button, 4, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("g");
    addComponent(frame, button, 5, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("h");
    addComponent(frame, button, 6, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("j");
    addComponent(frame, button, 7, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("k");
    addComponent(frame, button, 8, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("l");
    addComponent(frame, button, 9, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton(";");
    addComponent(frame, button, 10, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("'");
    addComponent(frame, button, 11, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    
    // Row Three - Two Buttons
    button = new JButton("ctrl");
    addComponent(frame, button, 0, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("fn");
    addComponent(frame, button, 1, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("linux");
    addComponent(frame, button, 2, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("alt");
    addComponent(frame, button, 3, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("space");
    addComponent(frame, button, 4, 2, 2, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("alt");
    addComponent(frame, button, 6, 2, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("option");
    addComponent(frame, button, 7, 2, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("ctrl");
    addComponent(frame, button, 8, 2, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
    button = new JButton("shift");
    addComponent(frame, button, 9, 2, 1, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH);

    frame.setSize(1000, 800);
    frame.setVisible(true);
  }

  private static void addComponent(Container container, 
    Component component, 
    int gridx, 
    int gridy, 
    int gridwidth, 
    int gridheight, 
    int anchor, 
    int fill) {
    GridBagConstraints gbc = new GridBagConstraints(gridx, 
        gridy, 
        gridwidth, 
        gridheight, 
        1.0, 
        1.0, 
        anchor, 
        fill, 
        insets, 
        0, 
        0);
    container.add(component, gbc);
  }
}