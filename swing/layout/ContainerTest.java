import java.awt.*;
import javax.swing.*;

public class ContainerTest extends JFrame{

	ContainerTest(){
		getGUI();
	}

	private void getGUI(){
		setTitle("Container Example");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);

		JPanel panel = new JPanel();
		panel.setBounds(0,0,200, 200);

		JLabel lbl = new JLabel();
		lbl.setText("This is a label.");
		panel.add(lbl);

		JPanel panel1 = new JPanel();
		panel.setBounds(0, 200, 200, 200);

		JTextField jtf = new JTextField();
		jtf.setSize(100, 30);
		panel1.add(lbl);

		add(panel);
		add(panel1);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContainerTest();
		
	}
}