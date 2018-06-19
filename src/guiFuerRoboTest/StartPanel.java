package guiFuerRoboTest;

import javax.swing.JPanel;

import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class StartPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public StartPanel() {
		setLayout(null);
		setSize(800, 400);
		
		JLabel lblTuxLw = new JLabel("Tux LW");
		lblTuxLw.setSize(67, 26);
		lblTuxLw.setLocation(366, 123);
		lblTuxLw.setFont(new Font("Bolt",0, 20));
		add(lblTuxLw);
		
		JLabel lblRobotester = new JLabel("Robotester");
		lblRobotester.setSize(98, 26);
		lblRobotester.setLocation(353, 172);
		lblRobotester.setFont(new Font("Bolt", 0 ,20));
		add(lblRobotester);

	}
}
