import java.io.*;
public class TestDirectory {
	public static void main(String[] args) {
		String pathName = "c:/Users/User";
		File file = new File(pathName);

		if(file.isDirectory()) {
			String names[] = file.list();
			for(int i= 0;i < names.length;i++) {
				File f = new File(pathName + "/" + names[i]);

				if(f.isDirectory()) {
					System.out.println(f.getAbsoluteFile());
				}
			}
		}
	}
}