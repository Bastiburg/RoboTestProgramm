package roboTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ImportPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5023271668446571695L;

	private JButton btnImport;
	private JButton btnChoose;

	private JLabel lbAufforderungZurWahl;
	private JTextField tfPath;

	private JCheckBox cbGesammtprogrammMark3;
	private JCheckBox cbGesammtprogrammMark2;
	private JCheckBox cbTestprogrammMark3;
	private JCheckBox cbTestprogrammMark2;
	private JCheckBox cbWeitere;
	private ButtonGroup btgCB;

	private MainFrame parent;
	private JDialog container;
	private String importPath;
	private int targetDir;

	private ActionListener al, alCB;

	private String[] testChoice = { "Infrarot", "Kompass", "Motoren", "Lichtsensoren", "Bluetooth empfangen",
			"weitere" };
	private JComboBox<String> testChooser;

	public ImportPanel(MainFrame parent, JDialog container) {

		this.parent = parent;
		this.container = container;

		al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				doWhenImportIsHit();

			}
		};

		alCB = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnChoose.requestFocus();

			}
		};

		setSize(400, 300);
		setLayout(null);
		setVisible(true);

		importPath = "";
		targetDir = 0;

		btnImport = new JButton("Importieren");
		btnImport.setSize(150, 20);
		btnImport.setLocation(200, 220);
		add(btnImport);

		lbAufforderungZurWahl = new JLabel("Wähle ein Zielverzeichnis");
		lbAufforderungZurWahl.setSize(300, 10);
		lbAufforderungZurWahl.setLocation(5, 5);
		add(lbAufforderungZurWahl);

		tfPath = new JTextField();
		tfPath.setSize(350, 20);
		tfPath.setLocation(5, 180);
		tfPath.setVisible(false);
		add(tfPath);

		testChooser = new JComboBox<String>(testChoice);
		testChooser.setLocation(20, 150);
		testChooser.setSize(150, 20);
		testChooser.setVisible(false);
		add(testChooser);
		testChooser.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnChoose.requestFocus();
				
			}
		});

		cbGesammtprogrammMark3 = new JCheckBox("Gesammtprogramme Mark 3");
		cbGesammtprogrammMark3.setLocation(20, 30);
		cbGesammtprogrammMark3.setSize(300, 20);
		add(cbGesammtprogrammMark3);
		cbGesammtprogrammMark3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				testChooser.setVisible(false);

			}
		});

		cbGesammtprogrammMark2 = new JCheckBox("Gesammtprogramme Mark 2");
		cbGesammtprogrammMark2.setLocation(20, 50);
		cbGesammtprogrammMark2.setSize(300, 20);
		add(cbGesammtprogrammMark2);
		cbGesammtprogrammMark2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				testChooser.setVisible(false);

			}
		});

		cbTestprogrammMark3 = new JCheckBox("Testprogramme Mark 3");
		cbTestprogrammMark3.setLocation(20, 70);
		cbTestprogrammMark3.setSize(300, 20);
		add(cbTestprogrammMark3);
		cbTestprogrammMark3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (cbTestprogrammMark3.isSelected()) {
					testChooser.setVisible(true);
				} else {
					testChooser.setVisible(false);
				}
			}
		});

		cbTestprogrammMark2 = new JCheckBox("Testprogramme Mark 2");
		cbTestprogrammMark2.setLocation(20, 90);
		cbTestprogrammMark2.setSize(300, 20);
		add(cbTestprogrammMark2);
		cbTestprogrammMark2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (cbTestprogrammMark2.isSelected()) {
					testChooser.setVisible(true);
				} else {
					testChooser.setVisible(false);
				}
			}
		});

		cbWeitere = new JCheckBox("Weitere");
		cbWeitere.setLocation(20, 110);
		cbWeitere.setSize(300, 20);
		add(cbWeitere);
		cbWeitere.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				testChooser.setVisible(false);

			}
		});

		btgCB = new ButtonGroup();
		btgCB.add(cbGesammtprogrammMark3);
		btgCB.add(cbGesammtprogrammMark2);
		btgCB.add(cbTestprogrammMark3);
		btgCB.add(cbTestprogrammMark2);
		btgCB.add(cbWeitere);

		cbGesammtprogrammMark3.addActionListener(alCB);
		cbGesammtprogrammMark2.addActionListener(alCB);
		cbTestprogrammMark3.addActionListener(alCB);
		cbTestprogrammMark2.addActionListener(alCB);
		cbWeitere.addActionListener(alCB);

		btnChoose = new JButton("Pfad Angeben");
		btnChoose.setSize(150, 20);
		btnChoose.setLocation(20, 220);
		add(btnChoose);
		btnChoose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				doWhenChooseIsHit();

			}
		});
		btnChoose.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				doWhenChooseIsHit();

			}
		});

		btnImport.addActionListener(al);
		// btnImport.grabFocus();
		btnImport.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					doWhenImportIsHit();
				}

			}
		});

	}

	public void doWhenImportIsHit() {
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
			JOptionPane.showMessageDialog(ImportPanel.this, "Kein Zielordner ausgewählt");
			targetDir = 999;
			parent.setTargetDir(999);
		}

		if (tfPath.getText().equals("")) {
			JOptionPane.showMessageDialog(ImportPanel.this, "Es wurde kein Pfad angegeben");
			parent.setImportPath("");
		} else {
			importPath = tfPath.getText();
			parent.setImportPath(importPath);

		}

		if (!tfPath.getText().equals("") && btgCB.getSelection() != null)
			container.dispose();

	}

	public void doWhenChooseIsHit() {
		JFileChooser fc = new JFileChooser();
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fc.setDialogTitle(".ino Datei importieren");
		int status = fc.showDialog(ImportPanel.this, "Best�tigen");
		if (status == JFileChooser.APPROVE_OPTION) {
			File sf = fc.getSelectedFile();
			tfPath.setText(sf.getAbsolutePath());
			tfPath.setVisible(true);
			btnImport.requestFocus();
		}
	}
}
