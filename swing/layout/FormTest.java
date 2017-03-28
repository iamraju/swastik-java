import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormTest{
    private JFrame frame;
    private JPanel panel;

    FormTest(){
        prepareForm();
    }

    public static void main(String[] args) {
        new FormTest();
    }

    private void prepareForm(){
        frame = new JFrame();
        frame.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setSize(500, 200);
        panel.setLayout(new GridLayout(0, 2, 10,10));

        panel.add(new JLabel("Name : "));
        panel.add(new JTextField(20));

        panel.add(new JLabel("Email : "));
        panel.add(new JTextField(20));
        
        String[] gender = {"Male", "Female"};
        JComboBox cmbGender = new JComboBox<>(gender);
        panel.add(new JLabel("Gender"));
        panel.add(cmbGender);
        frame.add(panel);

        panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, 10,10));
        panel.add(new JLabel("About You : "));
        panel.add(new JTextArea(5, 20));
        frame.add(panel);

        panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));
        JLabel response = new JLabel();
        
        JButton btnRegister = new JButton("Register Now");

        // Add action listener for Alpha.
        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                response.setText("Button clicked");
            }
        });
        
        panel.add(btnRegister);
        frame.add(panel);

        panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));
        panel.add(response);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}