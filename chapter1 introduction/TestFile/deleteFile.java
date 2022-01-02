import java.io.*;

public class deleteFile {
	public static void main(String[] args){
		File file = new File("file/yrys_NM.txt");

		if(file.exists()) {
			if(file.delete()) {
				System.out.println("File was deleted");
			}else {
				System.out.println("An attempt of deleting was unuccessfull");
			}
		}
	}
}