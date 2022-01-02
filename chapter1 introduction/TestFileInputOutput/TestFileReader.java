import java.io.*;

public class TestFileReader{
	public static void main(String[] args) throws Exception {
		FileReader fr;
		BufferedReader br = new BufferedReader(fr = new  FileReader("html/testfileReader.html"));

		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}

		fr.close();
	}
}