package guiFuerRoboTest;

import javax.swing.JPanel;

import java.awt.Font;
import java.awt.List;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MainPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MainPanel() {
		setLayout(null);
		setSize(800, 400);

		List list = new List();
		list.setBounds(58, 79, 173, 190);
		add(list);

		List list_1 = new List();
		list_1.setBounds(361, 79, 173, 190);
		add(list_1);

		JLabel lblVersionen = new JLabel("Versionen");
		lblVersionen.setFont(new Font("Arial", 0, 20));
		lblVersionen.setBounds(58, 30, 87, 24);
		add(lblVersionen);
		
		JLabel lblTestprogramme = new JLabel("Testprogramme");
		lblTestprogramme.setFont(new Font("Arial", 0, 20));
		lblTestprogramme.setBounds(361, 38, 140, 24);
		add(lblTestprogramme);
		
		JButton btnAuswaehlen = new JButton("Ausw\u00e4hlen");
		btnAuswaehlen.setBounds(58, 275, 85, 23);
		add(btnAuswaehlen);
		
		JButton btnLoeschen = new JButton("L\u00f6schen");
		btnLoeschen.setBounds(142, 275, 89, 23);
		add(btnLoeschen);
		
		JButton btnAuswaehlen_1 = new JButton("Ausw\u00e4hlen");
		btnAuswaehlen_1.setBounds(403, 275, 85, 23);
		add(btnAuswaehlen_1);
	}
}
