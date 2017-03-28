import java.awt.*;
import javax.swing.*;

class Gui extends JFrame {
	GridBagLayout gbl = new GridBagLayout();

	Gui() {
		setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,480);
		setLocationRelativeTo(null);

		//instantiates Border panels.
		BorderPanel pnlA = new BorderPanel("Panel A");
		BorderPanel pnlB = new BorderPanel("Panel B");
		BorderPanel pnlC = new BorderPanel("Panel C");
		BorderPanel pnlD = new BorderPanel("Panel D");
		BorderPanel pnlE = new BorderPanel("Panel E");
		BorderPanel pnlF = new BorderPanel("Panel F");

		//adding all panels to main contentPane.
		add(pnlA);
		add(pnlB);
		add(pnlC);
		add(pnlD);
		add(pnlE);
		add(pnlF);

		//set constraints of each panel.
		makeConstraints(gbl, pnlA, 1, 2, 0, 0, 2.0, 1.0);
		makeConstraints(gbl, pnlB, 2, 1, 1, 0, 2.0, 2.0);
		makeConstraints(gbl, pnlC, 1, 1, 0, 2, 1.0, 1.0); 
		makeConstraints(gbl, pnlD, 1, 2, 1, 1, 1.0, 1.0);
		makeConstraints(gbl, pnlE, 1, 1, 2, 1, 1.0, 1.0);
		makeConstraints(gbl, pnlF, 1, 1, 2, 2, 1.0, 1.0);
	}

	/**
	  * Generate constraints for Swing components
	  * @param gbl     a gridbaglayout that used to embed Swing component
	  * @param comp    a Swing component intended to be embedded in gbl
	  * @param w       desired component width
	  * @param h       desired component height
	  * @param x       desired location in x-axis
	  * @param y       desired location in y-axis
	  * @param weightx desired weight in terms of x-axis
	  * @param weighty desired weight in terms of y-axis
	  */
	public void makeConstraints(GridBagLayout gbl, JComponent comp, int w, int h, int x, int y,double weightx, double weighty) {
		GridBagConstraints constraints  = new GridBagConstraints();
		constraints.fill                = GridBagConstraints.BOTH;
		constraints.gridwidth           = w;
		constraints.gridheight          = h;
		constraints.gridx               = x;
		constraints.gridy               = y;
		constraints.weightx             = weightx;
		constraints.weighty             = weighty;
        
		gbl.setConstraints(comp, constraints);
	}

	//Main method
	public static void main (String [] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Gui().setVisible(true);
			}
		});
	}
}

class BorderPanel extends JPanel {
	BorderPanel(String title) {
		setBorder(BorderFactory.createTitledBorder(title));
	}
}