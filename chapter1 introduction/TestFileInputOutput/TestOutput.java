import java.io.*;

public class TestOutput {
	public static void main(String[] args) {
		String source = "Most browsers do not support Sqing components \n" + 
			"and other new JDK features.For best results, \n" + 
			"write your applet using the same JDK that browser user \n" + 
			"and the AWT components instead of Swing.";

			byte buff[] = source.getBytes();

			try{
				File file = new File("Applet.txt");
				if(!file.exists()) {
					file.createNewFile();
				}

				FileOutputStream out = new FileOutputStream("Applet.txt");

				for(int i = 0;i < buff.length;i++){
					out.write(buff[i]);
				}

				out.close();
			}catch(java.io.FileNotFoundException ex) {

			}

			catch(IOException ex) {

			}
	}
}

