package roboTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewProjektPanel extends JPanel {

	private MainFrame parent;
	private JDialog container;

	private JCheckBox cbGesammtprogrammMark3;
	private JCheckBox cbGesammtprogrammMark2;
	private JCheckBox cbTestprogrammMark3;
	private JCheckBox cbTestprogrammMark2;
	private JCheckBox cbWeitere;
	private ButtonGroup btgCB;
	
	private JButton btnErstellen;


	private JLabel lbAufforderungZurWahl;
	private JLabel lbNamenswahl;
	private JTextField tfName;
	
	private int targetDir;

	public NewProjektPanel(MainFrame parent, JDialog container) {

		this.parent = parent;
		this.container = container;

		setSize(400, 300);
		setLayout(null);
		setVisible(true);
		
		targetDir = 999;

		lbAufforderungZurWahl = new JLabel("Wähle ein Zielverzeichnis");
		lbAufforderungZurWahl.setSize(300, 10);
		lbAufforderungZurWahl.setLocation(5, 5);
		add(lbAufforderungZurWahl);
		
		lbNamenswahl = new JLabel("Wähle einen Namen");
		lbNamenswahl.setSize(300, 10);
		lbNamenswahl.setLocation(15, 150);
		add(lbNamenswahl);

		tfName = new JTextField();
		tfName.setSize(200, 20);
		tfName.setLocation(15, 180);
		add(tfName);

		cbGesammtprogrammMark3 = new JCheckBox("Gesammtprogramme Mark 3");
		cbGesammtprogrammMark3.setLocation(20, 30);
		cbGesammtprogrammMark3.setSize(300, 20);
		add(cbGesammtprogrammMark3);
		cbGesammtprogrammMark3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		cbGesammtprogrammMark2 = new JCheckBox("Gesammtprogramme Mark 2");
		cbGesammtprogrammMark2.setLocation(20, 50);
		cbGesammtprogrammMark2.setSize(300, 20);
		add(cbGesammtprogrammMark2);
		cbGesammtprogrammMark2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		cbTestprogrammMark3 = new JCheckBox("Testprogramme Mark 3");
		cbTestprogrammMark3.setLocation(20, 70);
		cbTestprogrammMark3.setSize(300, 20);
		add(cbTestprogrammMark3);
		cbTestprogrammMark3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			}

		});

		cbTestprogrammMark2 = new JCheckBox("Testprogramme Mark 2");
		cbTestprogrammMark2.setLocation(20, 90);
		cbTestprogrammMark2.setSize(300, 20);
		add(cbTestprogrammMark2);
		cbTestprogrammMark2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			}

		});

		cbWeitere = new JCheckBox("Weitere");
		cbWeitere.setLocation(20, 110);
		cbWeitere.setSize(300, 20);
		add(cbWeitere);
		cbWeitere.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		btgCB = new ButtonGroup();
		btgCB.add(cbGesammtprogrammMark3);
		btgCB.add(cbGesammtprogrammMark2);
		btgCB.add(cbTestprogrammMark3);
		btgCB.add(cbTestprogrammMark2);
		btgCB.add(cbWeitere);
		
		btnErstellen = new JButton("Erstellen");
		btnErstellen.setSize(150, 20);
		btnErstellen.setLocation(200, 220);
		add(btnErstellen);
		btnErstellen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (cbGesammtprogrammMark3.isSelected()) {
					targetDir = 1;
					parent.setTargetDir(targetDir);
				} else if (cbGesammtprogrammMark2.isSelected()) {
					targetDir = 2;
					parent.setTargetDir(targetDir);
				} else if (cbTestprogrammMark3.isSelected()) {
					targetDir = 3;
					parent.setTargetDir(targetDir);
				} else if (cbTestprogrammMark2.isSelected()) {
					targetDir = 4;
					parent.setTargetDir(targetDir);
				} else if (cbWeitere.isSelected()) {
					targetDir = 0;
					parent.setTargetDir(targetDir);
				} else if (btgCB.getSelection() == null) {
					JOptionPane.showMessageDialog(NewProjektPanel.this, "Kein Zielordner ausgewählt");
					targetDir = 999;
					parent.setTargetDir(999);
				}
				parent.setProjektName(tfName.getText());
				parent.setTargetDir(targetDir);
				
			}
		});

	}
}
