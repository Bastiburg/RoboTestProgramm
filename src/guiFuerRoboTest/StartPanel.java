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
		
		JLabel lblTuxLw = new JLabel("Tux LW");
		lblTuxLw.setSize(67, 26);
		lblTuxLw.setLocation(184, 106);
		lblTuxLw.setFont(new Font("Bolt",0, 20));
		add(lblTuxLw);
		
		JLabel lblRobotester = new JLabel("Robotester");
		lblRobotester.setSize(98, 26);
		lblRobotester.setLocation(176, 144);
		lblRobotester.setFont(new Font("Bolt", 0 ,20));
		add(lblRobotester);

	}
}
