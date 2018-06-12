package roboTest;


import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel lbActionPerformed;
	
	 

	

	public MainPanel() {

		lbActionPerformed = new JLabel();
		lbActionPerformed.setText("MOIN");
		lbActionPerformed.setLocation(100, 100);
		lbActionPerformed.setSize(100, 20);
		lbActionPerformed.setVisible(true);
		add(lbActionPerformed);

		setSize(800, 400);
		setLayout(null);
		setFocusable(true);
		setVisible(true);

		

		

	}

	
}
