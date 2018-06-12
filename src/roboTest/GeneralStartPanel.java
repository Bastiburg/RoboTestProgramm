package roboTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;

public class GeneralStartPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel lbMark3;
	private JLabel lbMark3AktuelleProjekte;
	private JLabel lbMark3Test;

	private JButton btnArduinoIDEopener;
	private JButton btnTestStarter;
	private JButton btnOeffnenMark3Gesammt;
	private JButton btnLoeschenMark3Gesammt;
	private JButton btnOeffnenMark3Test;
	private JButton btnLoeschenMark3Test;

	private String arduinoPath = "";
	private String testPath = "";
	private String oe = "\u00F6";
	private String ae = "\u00E4";
	private String ue = "\u00FC";

	private MainFrame parent;

	private JScrollPane scrollPaneAktuelleProjekteMark3;
	private JList<String> listAktuelleProjekteMark3;
	private DefaultListModel<String> projekteMark3;

	private JScrollPane scrollPaneTestMark3;
	private JList<String> listTestMark3;
	private DefaultListModel<String> testMark3;

	private DateienVerwaltung dv;

	public GeneralStartPanel(MainFrame parent, DateienVerwaltung dv) {

		this.parent = parent;
		this.dv = dv;

		lbMark3 = new JLabel();
		lbMark3.setText("Mark 3");
		lbMark3.setSize(300, 20);
		lbMark3.setLocation(20, 20);
		add(lbMark3);

		lbMark3AktuelleProjekte = new JLabel();
		lbMark3AktuelleProjekte.setText("Aktuelle Projekte");
		lbMark3AktuelleProjekte.setSize(300, 20);
		lbMark3AktuelleProjekte.setLocation(20, 50);
		add(lbMark3AktuelleProjekte);

		lbMark3Test = new JLabel();
		lbMark3Test.setText("Testprogramme");
		lbMark3Test.setSize(300, 20);
		lbMark3Test.setLocation(340, 50);
		add(lbMark3Test);

		btnArduinoIDEopener = new JButton("Arduino IDE " + oe + "ffnen");
		btnArduinoIDEopener.setSize(200, 30);
		btnArduinoIDEopener.setLocation(550, 20);
		add(btnArduinoIDEopener);

		btnArduinoIDEopener.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Process p;
				System.out.println(arduinoPath);
				try {
					p = Runtime.getRuntime().exec(arduinoPath);
					OutputStream out = p.getOutputStream();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();

					JOptionPane.showMessageDialog(GeneralStartPanel.this,
							"ï¿½berprï¿½fen Sie den angegebenen Pfad zur Arduino IDE. \n Zu finden unter: \n Datei>Einstellungen>Arduino Pfad");
				}

			}
		});

		btnTestStarter = new JButton("starten");
		btnTestStarter.setLocation(550, 70);
		btnTestStarter.setSize(100, 30);
		add(btnTestStarter);

		btnTestStarter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Process p;
				//
				// try {
				// p = Runtime.getRuntime().exec(arduinoPath + " " + testPath);
				// OutputStream out = p.getOutputStream();
				// } catch (IOException e1) {
				// // TODO Auto-generated catch block
				// e1.printStackTrace();
				// }

				System.out.println(parent.getImportPath());
				System.out.println(parent.getTargetDir());

			}
		});

		scrollPaneAktuelleProjekteMark3 = new JScrollPane();
		scrollPaneAktuelleProjekteMark3.setBounds(20, 80, 300, 100);
		add(scrollPaneAktuelleProjekteMark3);
		listAktuelleProjekteMark3 = new JList<String>();
		scrollPaneAktuelleProjekteMark3.setViewportView(listAktuelleProjekteMark3);
		projekteMark3 = new DefaultListModel<String>();
		listAktuelleProjekteMark3.setModel(projekteMark3);

		for (int i = 0; i < dv.getProjkete(1).length; i++) {
			projekteMark3.add(i, dv.getProjkete(1)[i]);
		}

		scrollPaneTestMark3 = new JScrollPane();
		scrollPaneTestMark3.setBounds(340, 80, 200, 100);
		add(scrollPaneTestMark3);
		listTestMark3 = new JList<String>();
		scrollPaneTestMark3.setViewportView(listTestMark3);
		testMark3 = new DefaultListModel<String>();
		listTestMark3.setModel(testMark3);

		for (int i = 0; i < dv.getProjkete(3).length; i++) {
			testMark3.add(i, dv.getProjkete(3)[i]);
		}

		btnOeffnenMark3Gesammt = new JButton(oe + "ffnen");
		btnOeffnenMark3Gesammt.setSize(85, 20);
		btnOeffnenMark3Gesammt.setLocation(20, 190);
		add(btnOeffnenMark3Gesammt);
		btnOeffnenMark3Gesammt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				List<String> l = listAktuelleProjekteMark3.getSelectedValuesList();
				while (!l.isEmpty()) {

					dv.openInoFile(1, l.get(l.size() - 1).toString());
					l.remove(l.size() - 1);
				}

			}
		});

		btnLoeschenMark3Gesammt = new JButton("L" + oe + "schen");
		btnLoeschenMark3Gesammt.setSize(95, 20);
		btnLoeschenMark3Gesammt.setLocation(125, 190);
		add(btnLoeschenMark3Gesammt);
		btnLoeschenMark3Gesammt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				List<String> l = listAktuelleProjekteMark3.getSelectedValuesList();

				while (!l.isEmpty()) {
					System.out.println("button läuft");
					int index = l.size() - 1;
					dv.delteProjekt(1, l.get(index).toString());
					l.remove(index);

				}

				aktualisiereProjekte(1, dv);
				listAktuelleProjekteMark3.repaint();
				scrollPaneAktuelleProjekteMark3.repaint();

			}
		});

		btnOeffnenMark3Test = new JButton(oe + "ffnen");
		btnOeffnenMark3Test.setSize(85, 20);
		btnOeffnenMark3Test.setLocation(340, 190);
		add(btnOeffnenMark3Test);
		btnOeffnenMark3Test.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				List<String> l = listTestMark3.getSelectedValuesList();
				while (!l.isEmpty()) {

					dv.openInoFile(3, l.get(l.size() - 1).toString());
					l.remove(l.size() - 1);
				}

			}
		});

		btnLoeschenMark3Test = new JButton("L" + oe + "schen");
		btnLoeschenMark3Test.setSize(95, 20);
		btnLoeschenMark3Test.setLocation(445, 190);
		add(btnLoeschenMark3Test);
		btnLoeschenMark3Test.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				List<String> l = listTestMark3.getSelectedValuesList();

				while (!l.isEmpty()) {
					System.out.println("button läuft");
					int index = l.size() - 1;
					dv.delteProjekt(3, l.get(index).toString());
					l.remove(index);

				}

				aktualisiereProjekte(3, dv);
				listTestMark3.repaint();
				scrollPaneTestMark3.repaint();

			}
		});

		setSize(800, 400);
		setLayout(null);
		setVisible(true);

	}

	public void setArduinoPath(String arduinoPath) {
		this.arduinoPath = arduinoPath;
	}

	// public String getTestPath() {
	// return testPath;
	// }

	public void setTestPath(String testPath) {
		this.testPath = testPath;
	}

	public void aktualisiereProjekte(int dirIndex, DateienVerwaltung d) {
		System.out.println(dirIndex);
		switch (dirIndex) {
		case 0:

			break;
		case 1:
			projekteMark3.clear();
			for (int i = 0; i < d.getProjkete(dirIndex).length; i++) {
				projekteMark3.add(i, d.getProjkete(dirIndex)[i]);
			}
			// listAktuelleProjekteMark3.repaint();
			scrollPaneAktuelleProjekteMark3.repaint();
			break;
		case 2:

			break;
		case 3:
			testMark3.clear();
			for (int i = 0; i < d.getProjkete(dirIndex).length; i++) {
				testMark3.add(i, d.getProjkete(dirIndex)[i]);
			}
			// listTestMark3.repaint();
			scrollPaneTestMark3.repaint();
			break;
		case 4:
			break;

		}
	}

}
