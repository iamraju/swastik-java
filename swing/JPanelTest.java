import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JPanelTest extends JFrame{
	public JPanelTest(){
		initUI();
	}

	private void initUI(){
		JPanel panel = new JPanel();

		JButton button = new JButton("button");
        panel.add(button);

        JTree tree = new JTree();
        panel.add(tree);

        JTextArea area = new JTextArea("text area");
        area.setPreferredSize(new Dimension(100, 100));

        panel.add(area);

        add(panel);

        pack();

        setTitle("FlowLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
            new JPanelTest();
        });
	}
}