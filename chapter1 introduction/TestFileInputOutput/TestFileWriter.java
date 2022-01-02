import java.io.*;

public class TestFileWriter {
	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("tmp.txt"));

			bw.write("Passion will master you");
			bw.newLine();
			bw.write("If you do not master your passion");
			bw.close();
		}catch(IOException ex){

		}
	}
}