import java.io.*;

public class RenameFile {
	public static void main(String[] args) {
		File file = new File("file/test.txt");
		File newfile = new File("file/newtest.txt");

		if(file.exists()) {
			if(file.renameTo(newfile)) {
				System.out.println("File was renamed");
			}else  {
				System.out.println("File was not renamed");
			}
		}
	}
}