// A simple Swing application.
import javax.swing.*;

class SwingDemo {
	SwingDemo() {
		// Create a new JFrame container.
		JFrame jfrm = new JFrame("A Simple Swing Application");
		// Give the frame an initial size.
		jfrm.setSize(800, 600);
		// Terminate the program when the user closes the application.
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel jlab = new JLabel("Swing means powerful GUIs.");

		JButton jbtn = new JButton("I am button");
		jbtn.setBounds(50,100,95,30);  

		jfrm.add(jbtn);

		JTextField jtxt = new JTextField();

		jfrm.add(jtxt);
		// Add the label to the content pane.
		jfrm.add(jlab);
		// Display the frame.
		jfrm.setVisible(true);
	}
	public static void main(String args[]) {
		// Create the frame on the event dispatching thread.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingDemo();
			}
		});
	}
}