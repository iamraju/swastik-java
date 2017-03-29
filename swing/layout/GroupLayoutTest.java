import java.awt.*;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.*;
import java.awt.event.*;

public class GroupLayoutTest {
 
  public static void main(String[] args) {
 
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("Group Layout");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
 
    JLabel label = new JLabel("Find");
    JTextField textField = new JTextField();
    JCheckBox checkBox1 = new JCheckBox("Match Case");
    JCheckBox checkBox2 = new JCheckBox("Wrap Around");
    JCheckBox checkBox3 = new JCheckBox("Whole Words");
    JCheckBox checkBox4 = new JCheckBox("Search Backwards");

    JButton findButton = new JButton("Find");
    JButton cancelButton = new JButton("Cancel");
 
    GroupLayout layout = new GroupLayout(frame.getContentPane());
    frame.setLayout(layout);
 
    layout.setAutoCreateGaps(true);
    layout.setAutoCreateContainerGaps(true);
 
    layout.setHorizontalGroup(layout.createSequentialGroup()
        .addComponent(label)

        .addGroup(layout.createParallelGroup(LEADING)
        .addComponent(textField)
            
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(LEADING)
                    .addComponent(checkBox1)
                    .addComponent(checkBox3))
                .addGroup(layout.createParallelGroup(LEADING)
                    .addComponent(checkBox2)
                    .addComponent(checkBox4))))
        .addGroup(layout.createParallelGroup(LEADING)
            .addComponent(findButton)
            .addComponent(cancelButton))
    );
 
    // make the size of two buttons same horizontally
    layout.linkSize(SwingConstants.HORIZONTAL, findButton, cancelButton);
 
    layout.setVerticalGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(BASELINE)
            .addComponent(label)
            .addComponent(textField)
            .addComponent(findButton))
        .addGroup(layout.createParallelGroup(LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(BASELINE)
                    .addComponent(checkBox1)
                    .addComponent(checkBox2))
                .addGroup(layout.createParallelGroup(BASELINE)
                    .addComponent(checkBox3)
                    .addComponent(checkBox4)))
            .addComponent(cancelButton))
    );
 
    frame.pack();
    frame.setVisible(true);

    // getLayoutForm();
  }

  private static void getLayoutForm(){
    // JFrame frame = new JFrame("GroupLayout");
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Container contentPane = frame.getContentPane();

    // GroupLayout groupLayout = new GroupLayout(contentPane);

    // String maleString = "Male";
    // String femaleString = "Female";
    // JRadioButton male = new JRadioButton(maleString);
    // // male.setMnemonic(KeyEvent.VK_M);
    // // male.setActionCommand(maleString);

    // JRadioButton female = new JRadioButton(femaleString);
    // // female.setMnemonic(KeyEvent.VK_F);
    // // female.setActionCommand(femaleString);

    // contentPane.setLayout(groupLayout);

    // JLabel label = new JLabel("Label");
    // JButton b2 = new JButton("Second Button");

    // groupLayout.setHorizontalGroup(
    //     groupLayout.createSequentialGroup(LEADING)
    //     .addComponent(label)
    //     .addComponent(b2)

    //     .addGroup(groupLayout.createParallelGroup(LEADING))
    //       .addComponent(male)
    //       .addComponent(female)
    // );

    // groupLayout.setVerticalGroup(
    //     groupLayout.createParallelGroup(BASELINE)
    //     .addComponent(label)
    //     .addComponent(b2)
        
    //     .addGroup(groupLayout.createParallelGroup(BASELINE))
    //       .addComponent(male)
    //       .addComponent(female)
    // );

    // frame.pack();
    // frame.setVisible(true);
  }
}