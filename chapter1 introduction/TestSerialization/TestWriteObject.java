import java.io.*;

public  class TestWriteObject{
	public static void main(String[] args) {
		TestSerialization ts = new TestSerialization();
		ts.setName("Yrysbek");
		ts.setyearOfBirth(new Integer(1991));

		try {
			FileOutputStream fos = new FileOutputStream("OurObject");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ts);
			fos.close();
		}catch(IOException ex){
			
		}
	}
}