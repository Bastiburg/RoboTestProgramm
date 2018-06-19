package guiFuerRoboTest;

import javax.swing.JPanel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ChoosePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ChoosePanel() {
		setLayout(null);
		setSize(800, 400);

		JButton btnMark = new JButton("Mark 2");
		btnMark.setFont(new Font("Arial", 0, 20));
		btnMark.setBounds(349, 159, 95, 33);
		add(btnMark);

		JButton btnMark_1 = new JButton("Mark 3");
		btnMark_1.setBounds(349, 214, 95, 33);
		btnMark_1.setFont(new Font("Arial", 0, 20));
		add(btnMark_1);

		JLabel lblRoboterversionWaehlen = new JLabel("Roboterversion w\u00e4hlen");
		lblRoboterversionWaehlen.setBounds(295, 74, 211, 24);
		lblRoboterversionWaehlen.setFont(new Font("Arial", 0, 20));
		add(lblRoboterversionWaehlen);
	}
}
