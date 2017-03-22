
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class GridLayoutGapTest {

	private static JButton[] arrayBtn;
	
	public static void main(String[] args) {
	    
		// the frame that contains the components
		JFrame frame = new JFrame("GridLayoutTest from JCG");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    // set the size of the frame
	    frame.setSize(350, 350);
	    
	    // set the rows and cols of the grid, as well the distances between them
	    GridLayout grid = new GridLayout(5, 3, 10, 10);
	    // what layout we want to use for our frame
	    frame.setLayout(grid);
	    
	    // add a text field with a specified text to the frame
	    JTextArea text = new JTextArea();
        text.setText("Result");
        text.setEditable(false);
        frame.add(text);
	    
        // add buttons to the frame
	    frame.add(new JButton("+"));
	    frame.add(new JButton("="));

	    arrayBtn = new JButton[10];
	    // add JButtons dynamically
	    for(int i=0; i < arrayBtn.length; i++) {
	    	arrayBtn[i] = new JButton(Integer.toString(i));
	    	frame.add(arrayBtn[i]);
	    }
	   
	    frame.setVisible(true);

	}

}