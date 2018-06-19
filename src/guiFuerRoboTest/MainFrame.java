package guiFuerRoboTest;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.BorderLayout;

/**
 * Die Klasse MainFrame erstellt den MainFrame für diese Gui.
 * 
 * @author Sebastian Hilker
 * @version 01,06.06.2018
 */
public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private StartPanel sp;

	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 400);
		setTitle("TuxLW Robotertester");
		setResizable(false);
		sp = new StartPanel();
		getContentPane().add(sp, BorderLayout.WEST);
		setVisible(true);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnDatei = new JMenu("Datei");
		menuBar.add(mnDatei);

		JMenuItem mntmOptionen = new JMenuItem("Optionen");
		mnDatei.add(mntmOptionen);

		JMenuItem mntmDateiHinzufuegen = new JMenuItem("Datei hinzuf\u00fcgen");
		mnDatei.add(mntmDateiHinzufuegen);

		JMenuItem mntmDateiverzeichnis = new JMenuItem("Dateiverzeichnis");
		mnDatei.add(mntmDateiverzeichnis);

		JMenu mnDokumentation = new JMenu("Dokumentation");
		mnDatei.add(mnDokumentation);

		JMenuItem mntmMark = new JMenuItem("Mark 2");
		mnDokumentation.add(mntmMark);

		JMenuItem mntmMark_1 = new JMenuItem("Mark 3");
		mnDokumentation.add(mntmMark_1);

		JMenu mnTest = new JMenu("Test");
		menuBar.add(mnTest);

		JMenuItem mntmMark_2 = new JMenuItem("Mark 2");
		mnTest.add(mntmMark_2);

		JMenuItem mntmMark_3 = new JMenuItem("Mark 3");
		mnTest.add(mntmMark_3);

		JMenu mnHilfe = new JMenu("Hilfe");
		menuBar.add(mnHilfe);

	}

}
