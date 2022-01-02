import java.io.*;

public class TestReadObject {
	public static void main(String[] args) {
		TestSerialization ts;

		try {
			FileInputStream fis = new FileInputStream("OurObject");

			ObjectInputStream ois = new ObjectInputStream(fis);

			ts = (TestSerialization) ois.readObject();
			String name = ts.getName();
			Integer birth = ts.getYearOfBirth();
			
			System.out.println("Name: " + name);
			System.out.println("Year of birth: " + birth);

			ois.close();
		}catch(IOException ex) {
			System.out.println(ex.toString());
		}
		catch(ClassNotFoundException ex) {
			System.out.println(ex.toString());
		}
	}
}