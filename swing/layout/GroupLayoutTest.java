import java.awt.*;
import javax.swing.*;
import javax.xml.bind.util.JAXBResult;

import static javax.swing.GroupLayout.Alignment.*;
import java.awt.event.*;

public class GroupLayoutTest {
 
  public static void main(String[] args) {
 
    // JFrame.setDefaultLookAndFeelDecorated(true);
    // JFrame frame = new JFrame("Group Layout");
    // frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
 
    // JLabel lblFind = new JLabel("Find");
    // JTextField findText = new JTextField();
    // JCheckBox matchCase = new JCheckBox("Match Case");
    // JCheckBox wrapAround = new JCheckBox("Wrap Around");
    // JCheckBox wholeWords = new JCheckBox("Whole Words");
    // JCheckBox searchBackwards = new JCheckBox("Search Backwards");

    // JButton findButton = new JButton("Find");
    // JButton cancelButton = new JButton("Cancel");
 
    // GroupLayout layout = new GroupLayout(frame.getContentPane());
    // frame.setLayout(layout);
 
    // layout.setAutoCreateGaps(true);
    // layout.setAutoCreateContainerGaps(true);
 
    // layout.setHorizontalGroup(layout.createSequentialGroup()
    //     .addComponent(lblFind)

    //     .addGroup(layout.createParallelGroup(LEADING)
    //     .addComponent(findText)
            
    //         .addGroup(layout.createSequentialGroup()
    //             .addGroup(layout.createParallelGroup(LEADING)
    //                 .addComponent(matchCase)
    //                 .addComponent(wholeWords))
    //             .addGroup(layout.createParallelGroup(LEADING)
    //                 .addComponent(wrapAround)
    //                 .addComponent(searchBackwards))))
    //     .addGroup(layout.createParallelGroup(LEADING)
    //         .addComponent(findButton)
    //         .addComponent(cancelButton))
    // );
 
    // // make the size of two buttons same horizontally
    // layout.linkSize(SwingConstants.HORIZONTAL, findButton, cancelButton);
 
    // layout.setVerticalGroup(layout.createSequentialGroup()
    //     .addGroup(layout.createParallelGroup(BASELINE)
    //         .addComponent(lblFind)
    //         .addComponent(findText)
    //         .addComponent(findButton))
    //     .addGroup(layout.createParallelGroup(LEADING)
    //         .addGroup(layout.createSequentialGroup()
    //             .addGroup(layout.createParallelGroup(BASELINE)
    //                 .addComponent(matchCase)
    //                 .addComponent(wrapAround))
    //             .addGroup(layout.createParallelGroup(BASELINE)
    //                 .addComponent(wholeWords)
    //                 .addComponent(searchBackwards)))
    //         .addComponent(cancelButton))
    // );
 
    // frame.pack();
    // frame.setVisible(true);

    getLayoutForm();
  }

  private static void getLayoutForm(){
   JFrame frame = new JFrame("GroupLayout");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = frame.getContentPane();

    JPanel panel = new JPanel();
    panel.setBackground(Color.WHITE);
    panel.setBorder(
            BorderFactory.createTitledBorder("Top Panel"));
    GroupLayout layout = new GroupLayout(panel);

    panel.setLayout(layout);

    JButton btn1 = new JButton("One");
    JButton btn2 = new JButton("Two");
    JButton btn3 = new JButton("Three");
    JButton btn4 = new JButton("Four");
    
    layout.setAutoCreateGaps(true);

    layout.setHorizontalGroup(layout.createSequentialGroup()
      .addComponent(btn1)
      .addComponent(btn2)
      .addComponent(btn4)
      .addGroup(layout.createParallelGroup(LEADING)
        .addComponent(btn3)
      )
    );

    // layout.linkSize(SwingConstants.HORIZONTAL, btn3, btn4);

    layout.setVerticalGroup(layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(btn1)
        .addComponent(btn2)
        .addComponent(btn3)
      )
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addComponent(btn4)
      )
    );

    frame.add(panel);
    frame.setSize(800, 600);
    frame.setVisible(true); 
  }
}