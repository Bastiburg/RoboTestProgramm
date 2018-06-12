package roboTest;

import java.awt.AWTKeyStroke;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

import javax.accessibility.AccessibleContext;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;



public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private MainPanel mp;
	private GeneralStartPanel gmp;

	private JMenuBar jmbMain;
	private JMenu jmDatei;
	private JMenu jmEinstellungen;
	private JMenuItem jmiImportInoFiles;
	private JMenuItem jmiArduinoPath;
	private JMenuItem jmiCreateNewProjekt;

	private String arduinoPath;

	private String importPath;
	private String projektName;
	private int targetDir;

	private DateienVerwaltung dv;

	public MainFrame() {
		setSize(800, 400);
		setTitle("TuxLW Robotertester");
		setFocusable(true);

		dv = new DateienVerwaltung();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		mp = new MainPanel();
		gmp = new GeneralStartPanel(MainFrame.this, dv);
		add(mp);

		arduinoPath = dv.getArduinoPathFromFileSystem();
		gmp.setArduinoPath(arduinoPath);
		gmp.setTestPath(dv.getTestPath());
		System.out.println(arduinoPath);

		importPath = "";
		projektName = "";
		targetDir = 999;

		jmbMain = new JMenuBar();
		jmDatei = new JMenu("Datei");
		jmEinstellungen = new JMenu("Einstellungen");
		jmiArduinoPath = new JMenuItem("Arduino Pfad");
		jmiImportInoFiles = new JMenuItem(".ino Dateien Importieren");
		jmiCreateNewProjekt = new JMenuItem("neues Projekt erstellen");

		jmEinstellungen.add(jmiArduinoPath);
		jmDatei.add(jmiCreateNewProjekt);
		jmDatei.add(jmiImportInoFiles);
		jmDatei.add(jmEinstellungen);
		jmbMain.add(jmDatei);
		add(jmbMain, BorderLayout.NORTH);
		jmbMain.setVisible(false);
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					remove(mp);

					jmbMain.setVisible(true);
					add(gmp);
					repaint();
					System.out.println("l�uft");
				}

			}
		});

		jmiArduinoPath.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();

				fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
				fc.setDialogTitle("W�hle den Pfad der Arduino IDE");
				int status = fc.showDialog(MainFrame.this, "Best�tigen");
				if (status == JFileChooser.APPROVE_OPTION) {
					File selFile = fc.getSelectedFile();
					arduinoPath = selFile.getPath();
					gmp.setArduinoPath(arduinoPath);
					if (dv.saveArduinoPath(arduinoPath)) {
						System.out.println("speichern lief");
					} else {
						System.out.println("lief nicht");
					}
					System.out.println(arduinoPath);

				}
			}
		});

		jmiImportInoFiles.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				// new ImportFrame();
				JDialog jd = new JDialog(MainFrame.this, ".ino Datei importieren");
				jd.setSize(400, 300);
				jd.setContentPane(new ImportPanel(MainFrame.this, jd));
				jd.setModal(true);
				jd.setFocusable(true);
				jd.addKeyListener(new KeyListener() {

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
						if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
							jd.dispose();
							return;

						}

					}
				});
				jd.setVisible(true);
				if (targetDir != 999 && importPath != "") {

					String a;
					JOptionPane jp = new JOptionPane("lol", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION,
							null, new String[] { "neues Projekt erstellen", "importierte Datei nur \u00F6ffnen" },
							"neues Projekt erstellen");
					JDialog dialog = new JDialog(MainFrame.this, "Neues Projekt erstellen?", true);
					dialog.setFocusable(true);
					dialog.addKeyListener(new KeyListener() {
					
					@Override
					public void keyTyped(KeyEvent e) {
						// TODO Automatisch generierter Methodenstub
						
					}
					
					@Override
					public void keyReleased(KeyEvent e) {
						// TODO Automatisch generierter Methodenstub
						
					}
					
					@Override
					public void keyPressed(KeyEvent e) {
						if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
							System.out.println(jp.getOptions()[0]);
							System.out.println(jp.getOptions()[1]);
							
//							((JComponent) jp.getOptions()[1]).requestFocus();
						}
						
					}
				});

					dialog.setSize(550,150);
					dialog.setLocation(MainFrame.this.getX()+150, MainFrame.this.getX()+150);
					dialog.setContentPane(jp);
					dialog.setVisible(true);

//					
//					jp.setVisible(true);
//					jp.createDialog(MainFrame.this, "lauf!!1");
//					
//					dialog.setVisible(true);
//					

//					dialog.dispose();
					a = (String) jp.getValue();
//					System.out.println(a);
//					System.out.println(jp.getValue());
//					String[] yesNoOptions = { "neues Projekt erstellen", "importierte Datei nur \u00F6ffnen"};
//
//					int n = JOptionPane.showOptionDialog( null,
//					          "Neues Projekt aus importierter Datei erstellen?",               // question
//					          "Importeinstellung",           // title
//					          JOptionPane.YES_NO_OPTION,
//					          JOptionPane.QUESTION_MESSAGE,  // icon
//					          null, yesNoOptions,yesNoOptions[0] );


					if (a.equals("neues Projekt erstellen")) {
						System.out.println("neues Projekt");

						projektName = JOptionPane.showInputDialog(null, "W\u00E4hle einen Namen f\u00FCr das Projekt",
								"Projketname", JOptionPane.DEFAULT_OPTION);
						System.out.println(projektName + "!");
						if (projektName != null && projektName.trim().length() != 0) {
							System.out.println("Whui");
							dv.createNewProjekt(projektName, targetDir);
							dv.importInoFile(importPath, targetDir, projektName);
							gmp.aktualisiereProjekte(targetDir, dv);
						}
					} else if (a.equals("importierte Datei nur \\u00F6ffnen")) {
						System.out.println("\u00F6ffnen");
					}
				}

			}
		});

		jmiCreateNewProjekt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("m\u00FCsste laufen");
				JDialog jd = new JDialog(MainFrame.this, "Neues Projekt erstellen");
				jd.setSize(400, 300);
				jd.setContentPane(new NewProjektPanel(MainFrame.this, jd));
				jd.setModal(true);
				jd.setFocusable(true);
				jd.addKeyListener(new KeyListener() {

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
						if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
							jd.dispose();
							return;

						}

					}
				});
				jd.setVisible(true);
			}
		});

		setVisible(true);
	}

	public void setImportPath(String importPath) {
		this.importPath = importPath;
	}

	public String getImportPath() {
		return importPath;
	}

	public void setTargetDir(int targetDir) {
		this.targetDir = targetDir;
	}

	public int getTargetDir() {
		return targetDir;

	}

	public void setProjektName(String name) {
		this.projektName = name;
	}

}