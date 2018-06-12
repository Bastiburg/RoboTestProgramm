package roboTest;

import javax.swing.JFrame;

public class Data extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1049419654973505375L;
	
	private static String importPath;
	private static int targetDir;

	public Data() {
		
	}

	public String getImportPath() {
		return importPath;
	}

	public void setImportPath(String importPath) {
		this.importPath = importPath;
	}

	public int getTargetDir() {
		return targetDir;
	}

	public void setTargetDir(int targetDir) {
		this.targetDir = targetDir;
	}
	
	
}
