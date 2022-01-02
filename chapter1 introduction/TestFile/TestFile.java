import java.io.*;

public class TestFile {
	public static void main(String[] args) {
		File file = new File("file/test.txt");
		if(file.exists()) {
			printout("File exists");
		}else {
			printout("There is no file");
			return;
		}

		printout("File's name " + file.getName());
		printout("Path " + file.getPath());
		printout("File's size " + file.length());
		if(file.canRead()) {
			printout("File for reading");
		}else {
			printout(" File  cannot be read");

		}
		if(file.canWrite()) {
			printout("Writing to file is permissible");
		}else printout("File is protected for writing");

		printout("Last midification " + file.lastModified());
	}

	public static void printout(String msg) {
		System.out.println(msg);
	}
}