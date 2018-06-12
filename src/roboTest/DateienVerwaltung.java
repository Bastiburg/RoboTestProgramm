package roboTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.plaf.FileChooserUI;

public class DateienVerwaltung {

	private static final String arduinoProgrammeGesammtMark3StartDirecotryPath = null;
	private File mainDirectory;
	private File arduinopathDirectory;
	private File arduinopathFile;
	private File arduinoProgrammeDirectory;
	private File arduinoProgrammeGesammtMark3Directory;
	private File arduinoProgrammeGesammtMark3StartDirectory;
	private File arduinoProgrammeGesammtMark3StartFile;
	private File arduinoProgrammeGesammtMark3AktuellDirectory;
	private File arduinoProgrammeGesammtMark3AktuellFile;
	private File arduinoProgrammeGesammtMark3AltDirectory;
	private File arduinoProgrammeTestMark3Directory;
	private File arduinoProgrammeTestMark3StartDirectory;
	private File arduinoProgrammeTestMark3StartFile;
	private File arduinoProgrammeTestMark3AktuellDirectory;
	private File arduinoProgrammeTestMark3AltDirectory;
	private File arduinoProgrammeGesammtMark2Directory;
	private File arduinoProgrammeGesammtMark2StartDirectory;
	private File arduinoProgrammeGesammtMark2StartFile;
	private File arduinoProgrammeGesammtMark2AktuellDirectory;
	private File arduinoProgrammeGesammtMark2AktuellFile;
	private File arduinoProgrammeGesammtMark2AltDirectory;
	private File arduinoProgrammeTestMark2Directory;
	private File arduinoProgrammeTestMark2StartDirectory;
	private File arduinoProgrammeTestMark2StartFile;
	private File arduinoProgrammeTestMark2AktuellDirectory;
	private File arduinoProgrammeTestMark2AltDirectory;
	private File arduinoInoTestDirectory;
	private File arduinoInoTestFile;
	private File arduinoInoTest2Directory;
	private File arduinoInoTest2File;

	private File arduinoProgrammeGesammtMark3ProjekteDirectory;
	private File arduinoProgrammeTestMark3ProjekteDirectory;
	private File arduinoProgrammeGesammtMark2ProjekteDirectory;
	private File arduinoProgrammeTestMark2ProjekteDirectory;

	private static String mainDirectoryPath = "./Dateien";
	private static String arduinopathDirectoryPath = mainDirectoryPath + File.separator + "Arduinopath";
	private static String arduinopathFilePath = arduinopathDirectoryPath + File.separator + "arduinopath.txt";
	private static String arduinoProgrammeDirectoryPath = mainDirectoryPath + File.separator + "Arduinoprogramme";
	private static String arduinoProgrammeGesammtMark3DirecotryPath = arduinoProgrammeDirectoryPath + File.separator
			+ "GesammtprogrammeMark3";
	private static String arduinoProgrammeGesammtMark3StartDirectoryPath = arduinoProgrammeGesammtMark3DirecotryPath
			+ File.separator + "start";
	private static String arduinoProgrammeGesammtMark3StartFilePath = arduinoProgrammeGesammtMark3StartDirectoryPath
			+ File.separator + "start.ino";
	private static String arduinoProgrammeGesammtMark3AktuellDirectoryPath = arduinoProgrammeGesammtMark3DirecotryPath
			+ File.separator + "aktuellesProgramm";
	private static String arduinoProgrammeGesammtMark3AktuellFilePath = arduinoProgrammeGesammtMark3AktuellDirectoryPath
			+ File.separator + "aktuellesProgramm.ino";
	private static String arduinoProgrammeGesammtMark3AltDirectoryPath = arduinoProgrammeGesammtMark3DirecotryPath
			+ File.separator + "alte Programme";
	private static String arduinoProgrammeTestMark3DirecotryPath = arduinoProgrammeDirectoryPath + File.separator
			+ "TestprogrammeMark3";
	private static String arduinoProgrammeTestMark3StartDirectoryPath = arduinoProgrammeTestMark3DirecotryPath
			+ File.separator + "start";
	private static String arduinoProgrammeTestMark3StartFilePath = arduinoProgrammeTestMark3StartDirectoryPath
			+ File.separator + "start.ino";
	private static String arduinoProgrammeTestMark3AktuellDirectoryPath = arduinoProgrammeTestMark3DirecotryPath
			+ File.separator + "aktuelle Programme";
	private static String arduinoProgrammeTestMark3AltDirectoryPath = arduinoProgrammeTestMark3DirecotryPath
			+ File.separator + "alte Programme";

	private static String arduinoProgrammeGesammtMark2DirecotryPath = arduinoProgrammeDirectoryPath + File.separator
			+ "GesammtprogrammeMark2";
	private static String arduinoProgrammeGesammtMark2StartDirectoryPath = arduinoProgrammeGesammtMark2DirecotryPath
			+ File.separator + "start";
	private static String arduinoProgrammeGesammtMark2StartFilePath = arduinoProgrammeGesammtMark2StartDirectoryPath
			+ File.separator + "start.ino";
	private static String arduinoProgrammeGesammtMark2AktuellDirectoryPath = arduinoProgrammeGesammtMark2DirecotryPath
			+ File.separator + "aktuellesProgramm";
	private static String arduinoProgrammeGesammtMark2AktuellFilePath = arduinoProgrammeGesammtMark2AktuellDirectoryPath
			+ File.separator + "aktuellesProgramm.ino";
	private static String arduinoProgrammeGesammtMark2AltDirectoryPath = arduinoProgrammeGesammtMark2DirecotryPath
			+ File.separator + "alte Programme";
	private static String arduinoProgrammeTestMark2DirecotryPath = arduinoProgrammeDirectoryPath + File.separator
			+ "TestprogrammeMark2";
	private static String arduinoProgrammeTestMark2StartDirectoryPath = arduinoProgrammeTestMark2DirecotryPath
			+ File.separator + "start";
	private static String arduinoProgrammeTestMark2StartFilePath = arduinoProgrammeTestMark2StartDirectoryPath
			+ File.separator + "start.ino";
	private static String arduinoProgrammeTestMark2AktuellDirectoryPath = arduinoProgrammeTestMark2DirecotryPath
			+ File.separator + "aktuelles Programm";
	private static String arduinoProgrammeTestMark2AltDirectoryPath = arduinoProgrammeTestMark2DirecotryPath
			+ File.separator + "alte Programme";

	private static String arduinoProgrammeGesammtMark3ProjektDirectoryPath = arduinoProgrammeGesammtMark3DirecotryPath
			+ File.separator + "Projekte";
	private static String arduinoProgrammeTestMark3ProjektDirectoryPath = arduinoProgrammeTestMark3DirecotryPath
			+ File.separator + "Projekte";
	private static String arduinoProgrammeGesammtMark2ProjektDirectoryPath = arduinoProgrammeGesammtMark2DirecotryPath
			+ File.separator + "Projekte";
	private static String arduinoProgrammeTestMark2ProjektDirectoryPath = arduinoProgrammeTestMark2DirecotryPath
			+ File.separator + "Projekte";

	private static String arduinoInoTestDirectoryPath = mainDirectoryPath + File.separator + "test";
	private static String arduinoInoTestFilePath = arduinoInoTestDirectoryPath + File.separator + "test.ino";
	private static String arduinoInoTest2DirectoryPath = mainDirectoryPath + File.separator + "test2";
	private static String arduinoInoTest2FilePath = arduinoInoTestDirectoryPath + File.separator + "test2.ino";

	private DateAndTime dat;

	private Process p;

	public DateienVerwaltung() {
		mainDirectory = new File(mainDirectoryPath);
		if (!mainDirectory.exists()) {

			mainDirectory.mkdir();

		}

		arduinoProgrammeDirectory = new File(arduinoProgrammeDirectoryPath);
		if (!arduinoProgrammeDirectory.exists()) {

			arduinoProgrammeDirectory.mkdir();

		}

		arduinoProgrammeGesammtMark3Directory = new File(arduinoProgrammeGesammtMark3DirecotryPath);
		if (!arduinoProgrammeGesammtMark3Directory.exists()) {
			arduinoProgrammeGesammtMark3Directory.mkdir();
		}

		arduinoProgrammeGesammtMark3StartDirectory = new File(arduinoProgrammeGesammtMark3StartDirectoryPath);

		if (!arduinoProgrammeGesammtMark3StartDirectory.exists()) {
			arduinoProgrammeGesammtMark3StartDirectory.mkdir();
		}

		arduinoProgrammeGesammtMark3StartFile = new File(arduinoProgrammeGesammtMark3StartFilePath);
		System.out.println(arduinoProgrammeGesammtMark3StartFilePath);
		if (!arduinoProgrammeGesammtMark3StartFile.exists()) {
			try {
				arduinoProgrammeGesammtMark3StartFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		createDirInFilesystem(arduinoProgrammeGesammtMark3ProjekteDirectory,
				arduinoProgrammeGesammtMark3ProjektDirectoryPath);

		arduinoProgrammeTestMark3Directory = new File(arduinoProgrammeTestMark3DirecotryPath);
		if (!arduinoProgrammeTestMark3Directory.exists()) {
			arduinoProgrammeTestMark3Directory.mkdir();
		}

		arduinoProgrammeTestMark3StartDirectory = new File(arduinoProgrammeTestMark3StartDirectoryPath);

		if (!arduinoProgrammeTestMark3StartDirectory.exists()) {
			arduinoProgrammeTestMark3StartDirectory.mkdir();
		}

		arduinoProgrammeTestMark3StartFile = new File(arduinoProgrammeTestMark3StartFilePath);
		if (!arduinoProgrammeTestMark3StartFile.exists()) {
			try {
				arduinoProgrammeTestMark3StartFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		createDirInFilesystem(arduinoProgrammeTestMark3ProjekteDirectory,
				arduinoProgrammeTestMark3ProjektDirectoryPath);

		arduinoProgrammeGesammtMark2Directory = new File(arduinoProgrammeGesammtMark2DirecotryPath);
		if (!arduinoProgrammeGesammtMark2Directory.exists()) {
			arduinoProgrammeGesammtMark2Directory.mkdir();
		}

		arduinoProgrammeGesammtMark2StartDirectory = new File(arduinoProgrammeGesammtMark2StartDirectoryPath);

		if (!arduinoProgrammeGesammtMark2StartDirectory.exists()) {
			arduinoProgrammeGesammtMark2StartDirectory.mkdir();
		}

		arduinoProgrammeGesammtMark2StartFile = new File(arduinoProgrammeGesammtMark2StartFilePath);
		System.out.println(arduinoProgrammeGesammtMark2StartFilePath);
		if (!arduinoProgrammeGesammtMark2StartFile.exists()) {
			try {
				arduinoProgrammeGesammtMark2StartFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		createDirInFilesystem(arduinoProgrammeGesammtMark2ProjekteDirectory,
				arduinoProgrammeGesammtMark2ProjektDirectoryPath);

		arduinoProgrammeTestMark2Directory = new File(arduinoProgrammeTestMark2DirecotryPath);
		if (!arduinoProgrammeTestMark2Directory.exists()) {
			arduinoProgrammeTestMark2Directory.mkdir();
		}

		arduinoProgrammeTestMark2StartDirectory = new File(arduinoProgrammeTestMark2StartDirectoryPath);

		if (!arduinoProgrammeTestMark2StartDirectory.exists()) {
			arduinoProgrammeTestMark2StartDirectory.mkdir();
		}

		arduinoProgrammeTestMark2StartFile = new File(arduinoProgrammeTestMark2StartFilePath);
		if (!arduinoProgrammeTestMark2StartFile.exists()) {
			try {
				arduinoProgrammeTestMark2StartFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		createDirInFilesystem(arduinoProgrammeTestMark2ProjekteDirectory,
				arduinoProgrammeTestMark2ProjektDirectoryPath);

		arduinopathDirectory = new File(arduinopathDirectoryPath);
		if (!arduinopathDirectory.exists()) {

			arduinopathDirectory.mkdir();

		}

		arduinopathFile = new File(arduinopathFilePath);
		if (!arduinopathFile.exists()) {

			try {
				arduinopathFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		arduinoInoTestDirectory = new File(arduinoInoTestDirectoryPath);
		if (!arduinoInoTestDirectory.exists()) {

			arduinoInoTestDirectory.mkdir();

		}

		arduinoInoTestFile = new File(arduinoInoTestFilePath);
		if (!arduinoInoTestFile.exists()) {
			try {
				arduinoInoTestFile.createNewFile();
			} catch (IOException e) {
				// TODO Automatisch generierter Erfassungsblock
				e.printStackTrace();
			}
		}

		arduinoInoTest2Directory = new File(arduinoInoTest2DirectoryPath);
		if (!arduinoInoTestDirectory.exists()) {

			arduinoInoTest2Directory.mkdir();

		}

		arduinoInoTest2File = new File(arduinoInoTest2FilePath);
		if (!arduinoInoTest2File.exists()) {
			try {
				arduinoInoTest2File.createNewFile();
			} catch (IOException e) {
				// TODO Automatisch generierter Erfassungsblock
				e.printStackTrace();
			}
		}

		dat = new DateAndTime();

		// copy(arduinoInoTestFile, arduinoInoTest2File);
		// importInoFile(arduinoProgrammeGesammtMark3AktuellDirectory,
		// arduinoProgrammeGesammtMark3AltDirectory);

	}

	public boolean saveArduinoPath(String newPath) {
		if (arduinopathFile.delete()) {

			try {
				BufferedWriter arduinopathWriter;
				arduinopathFile.createNewFile();
				arduinopathWriter = new BufferedWriter(new FileWriter(arduinopathFile));
				arduinopathWriter.write(newPath);
				arduinopathWriter.flush();
				arduinopathWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return true;
		}
		return false;
	}

	public String getArduinoPathFromFileSystem() {
		BufferedReader br;
		String readLine;
		try {
			br = new BufferedReader(new FileReader(arduinopathFile));
			if ((readLine = br.readLine()) != null) {
				br.close();
				return readLine;
			} else {
				br.close();
				return "Kein Arduinopfad vorhenden";
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "Error";
	}

	public String getTestPath() {
		return arduinoInoTestFile.getPath();
	}

	public void copy(File basicFile, File copyedFile) {

		BufferedReader in;
		BufferedWriter out;
		String readLine;

		try {
			in = new BufferedReader(new FileReader(basicFile));
			out = new BufferedWriter(new FileWriter(copyedFile));
			for (int i = 0; i < 5; i++) {
				out.newLine();
			}
			while ((readLine = in.readLine()) != null) {
				out.write(readLine);
				out.newLine();
			}
			in.close();
			out.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void copy(File basicFile, File copyedFile, String comment) {

		BufferedReader in;
		BufferedWriter out;
		String readLine;

		try {
			in = new BufferedReader(new FileReader(basicFile));
			out = new BufferedWriter(new FileWriter(copyedFile));
			out.write("//Sie arbeiten aktuell am Projekt: " + comment);
			for (int i = 0; i < 5; i++) {
				out.newLine();
			}
			while ((readLine = in.readLine()) != null) {
				out.write(readLine);
				out.newLine();
			}
			in.close();
			out.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Es wird aktuell nur gechekt ob sich eine .ino-Datei im Ordner befindet, die
	 * den gleichen Namen wie der Ordner hat, denn nur dann lohnt es sich auch diese
	 * zu importieren. Es fehlen noch saemtliche Kopierprozesse und die
	 * Ueberpruefung auf Haederdateien. Zusaetzlich sollen noch entsprechende
	 * Meldungen an den Benutzer herausgegeben werden. Au�erdem muss man sich noch
	 * ueberlegen wie man dem Programm den Pfad vernuenftig verklickert. Pfade zum
	 * Beispiel in einer ArrayList unterbringen?
	 * 
	 * @param path
	 * @param targetDir
	 * @return
	 */
	public void importInoFile(String path, int targetDir, String projectName) {
		File f = new File(path);
		String[] fp = f.list();
		String inoFilePath = "";
		int hFilesLength = fp.length;
		hFilesLength -= 1;
		String[] hFiles = new String[hFilesLength];
		boolean ino = false;
		boolean otherFiles = false;
		int hFilesIndex = 0;

		String targetDirPath = "";

		if (projectName == null) {
			switch (targetDir) {
			case 0:

				break;
			case 1:
				targetDirPath = arduinoProgrammeGesammtMark3StartDirectoryPath;
				break;
			case 2:
				targetDirPath = arduinoProgrammeGesammtMark2StartDirectoryPath;
				break;
			case 3:
				targetDirPath = arduinoProgrammeTestMark3StartDirectoryPath;
				break;
			case 4:
				targetDirPath = arduinoProgrammeTestMark2StartDirectoryPath;
				break;

			}
		} else {
			switch (targetDir) {
			case 0:

				break;
			case 1:
				targetDirPath = arduinoProgrammeGesammtMark3ProjektDirectoryPath;
				break;
			case 2:
				targetDirPath = arduinoProgrammeGesammtMark2ProjektDirectoryPath;
				break;
			case 3:
				targetDirPath = arduinoProgrammeTestMark3ProjektDirectoryPath;
				break;
			case 4:
				targetDirPath = arduinoProgrammeTestMark2ProjektDirectoryPath;
				break;

			}
		}

		targetDirPath = targetDirPath + File.separator + projectName + File.separator + "aktuellesProgramm";

		for (

				int i = 0; i < fp.length; i++) {
			System.out.println(fp[i]);
		}

		for (int i = 0; i < fp.length; i++) {
			if (fp[i].endsWith(".ino") && ino == false) {
				ino = true;
				inoFilePath = fp[i];
			} else if (fp[i].endsWith(".h")) {
				hFiles[hFilesIndex] = fp[i];
				hFilesIndex++;
			} else {
				otherFiles = true;
			}
		}

		if (ino && !otherFiles) {
			clearHFiles(new File(targetDirPath));
			File inoFile = new File(f.getPath() + File.separator + inoFilePath);
			// System.out.println(inoFilePath + "Path");
			// System.out.println(arduinoProgrammeGesammtMark3StartDirectoryPath +
			// File.separator + "start.ino" + "JO");
			copy(inoFile, new File(targetDirPath + File.separator + "aktuellesProgramm.ino"));
			for (int i = 0; i < hFiles.length; i++) {
				File hFile = new File(f.getPath() + File.separator + hFiles[i]);
				try {
					hFile.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				copy(hFile, new File(targetDirPath + File.separator + hFile.getName()));
			}
		}

	}

	public void importInoFile(File f, File archiv) {
		String[] fp = f.list();

		String inoFilePath = "";
		int hFilesLength = fp.length;
		hFilesLength -= 1;
		String[] hFiles = new String[hFilesLength];
		int hFilesIndex = 0;
		String name = dat.getDateAndTimeForFiles();
		String targetDirPath = archiv.getPath() + File.separator + name;

		for (int i = 0; i < fp.length; i++) {
			if (fp[i].endsWith(".ino")) {
				inoFilePath = fp[i];
			} else if (fp[i].endsWith(".h")) {
				hFiles[hFilesIndex] = fp[i];
				hFilesIndex++;

			}
		}

		File inoFile = new File(f.getPath() + File.separator + inoFilePath);
		File targetDir = new File(targetDirPath);
		targetDir.mkdir();
		File targetInoFile = new File(targetDirPath + File.separator + name + ".ino");
		System.out.println(targetDirPath + File.separator + name + ".ino");
		try {
			targetInoFile.createNewFile();
			copy(inoFile, targetInoFile);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		for (int i = 0; i < hFiles.length; i++) {
			File hFile = new File(f.getPath() + File.separator + hFiles[i]);
			try {
				hFile.createNewFile();
				copy(hFile, new File(targetDirPath + File.separator + hFile.getName()));
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	public void clearHFiles(File dir) {
		if (dir.isDirectory()) {
			String[] s = dir.list();
			for (int i = 0; i < s.length; i++) {
				if (s[i].endsWith(".h")) {
					System.out.println(dir.getAbsolutePath() + File.separator + s[i]);
					new File(dir.getAbsolutePath() + File.separator + s[i]).delete();
				}
			}
		}
	}

	public boolean createDirInFilesystem(File f, String path) {
		f = new File(path);
		if (!f.exists()) {
			f.mkdir();
			return true;
		}
		return false;
	}

	public boolean createFileInFilesystem(File f, String path) {
		f = new File(path);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			return true;
		}
		return false;
	}

	public void createNewProjekt(String name, int target) {
		String projektDirectoryPath = "";
		switch (target) {
		case 0:
			break;
		case 1:
			projektDirectoryPath = arduinoProgrammeGesammtMark3ProjektDirectoryPath;
			break;
		case 2:
			projektDirectoryPath = arduinoProgrammeGesammtMark2ProjektDirectoryPath;
			break;
		case 3:
			projektDirectoryPath = arduinoProgrammeTestMark3ProjektDirectoryPath;
			break;
		case 4:
			projektDirectoryPath = arduinoProgrammeTestMark2ProjektDirectoryPath;
			break;
		}

		File projektDir = new File(projektDirectoryPath + File.separator + name);
		File projektAktuellDir = new File(projektDir.getPath() + File.separator + "aktuellesProgramm");
		File projektAktuellFile = new File(
				projektAktuellDir.getPath() + File.separator + projektAktuellDir.getName() + ".ino");
		File projektAltDir = new File(projektDir.getPath() + File.separator + "alteProgramme");

		createDirInFilesystem(projektDir, projektDir.getPath());
		createDirInFilesystem(projektAktuellDir, projektAktuellDir.getPath());
		createDirInFilesystem(projektAltDir, projektAltDir.getPath());
		createFileInFilesystem(projektAktuellFile, projektAktuellFile.getPath());

	}

	public String[] getProjkete(int index) {
		String[] s;
		String[] leer = {};
		switch (index) {
		case 1:
			File fg3 = new File(arduinoProgrammeGesammtMark3ProjektDirectoryPath);
			s = fg3.list();
			for (int i = 0; i < s.length; i++) {
				System.out.println(s[i]);
			}
			if (s.equals(null)) {
				return leer;
			}
			return s;
		case 3:
			File ft3 = new File(arduinoProgrammeTestMark3ProjektDirectoryPath);
			s = ft3.list();
			for (int i = 0; i < s.length; i++) {
				System.out.println(s[i]);
			}
			if (s.equals(null)) {
				return leer;
			}
			return s;

		}
		return leer;

	}

	public void openInoFile(int index, String name) {
		File[] f = {};

		String open = "";
		switch (index) {
		case 1:
			File fg3 = new File(arduinoProgrammeGesammtMark3ProjektDirectoryPath);
			f = fg3.listFiles();

			break;
		case 3:
			File ft3 = new File(arduinoProgrammeTestMark3ProjektDirectoryPath);
			f = ft3.listFiles();

			break;
		}
		for (int i = 0; i < f.length; i++) {
			if (f[i].getPath().endsWith(name)) {
				open = f[i].getPath();
				// System.out.println("done");
				// System.out.println(open);
			}
		}
		writeCommentInInoFile(
				new File(open + File.separator + "aktuellesProgramm" + File.separator + "aktuellesProgramm.ino"), name);

		try {
			System.out.println(getArduinoPathFromFileSystem() + " " + open + File.separator + "aktuellesProgramm"
					+ File.separator + "aktuellesProgramm.ino");
			p = Runtime.getRuntime().exec(getArduinoPathFromFileSystem() + " " + open + File.separator
					+ "aktuellesProgramm" + File.separator + "aktuellesProgramm.ino");
			OutputStream out = p.getOutputStream();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();

			// JOptionPane.showMessageDialog(GeneralStartPanel.this,
			// "�berpr�fen Sie den angegebenen Pfad zur Arduino IDE. \n Zu finden unter:
			// \n Datei>Einstellungen>Arduino Pfad");
		}
	}

	public void delteProjekt(int index, String name) {
		String delete = "";
		File[] f = {};
		switch (index) {
		case 1:
			File fg3 = new File(arduinoProgrammeGesammtMark3ProjektDirectoryPath);
			f = fg3.listFiles();
			break;
		case 3:
			File ft3 = new File(arduinoProgrammeTestMark3ProjektDirectoryPath);
			f = ft3.listFiles();
			System.out.println("GOt it");
			break;
		}

		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i].getPath());
			if (f[i].getPath().endsWith(name)) {
				delete = f[i].getPath();

				System.out.println("done");
				System.out.println(delete);
			}
		}

		try {
			File d = new File(delete);
			while (d.exists()) {
				del(d);
				System.out.println("JO");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Funktioniert nur sehr eingeschraenkt. Iterative Losesung ist ineffizient. REukrsion muss her ...
	 * @param f
	 */
	public boolean del(File dir){
		if (dir.isDirectory()){
				String[] entries = dir.list();
				for (int x=0;x<entries.length;x++){
					File aktFile = new File(dir.getPath(),entries[x]);
					del(aktFile);
				}
				if (dir.delete())
					return true;
				else
					return false;
			}
			else{
				if (dir.delete())
					return true;
				else
					return false;
			}
	}

	public void writeCommentInInoFile(File inoFile, String comment) {

		File dir = inoFile.getParentFile();
		dir = dir.getParentFile();
		File f = new File(dir.getPath() + File.separator + "copy.txt");
		BufferedWriter out;
		BufferedWriter outTXT;
		BufferedReader inIno;
		BufferedReader in;
		String readLine = "";

		try {
			inIno = new BufferedReader(new FileReader(inoFile));
			outTXT = new BufferedWriter(new FileWriter(f));
			while ((readLine = inIno.readLine()) != null) {
				if(readLine.endsWith(comment)) {
					inIno.close();
					outTXT.close();
					return;
				}
				outTXT.write(readLine);
				outTXT.newLine();
			}
			inIno.close();
			outTXT.close();
			 out = new BufferedWriter(new FileWriter(inoFile));
			 in = new BufferedReader(new FileReader(f));
			 out.write("// Sie bearbeiten das Projekt: " + comment);
			 out.newLine();
			 while ((readLine = in.readLine()) != null) {
					out.write(readLine);
					out.newLine();
				}
			 out.close();
			 in.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
