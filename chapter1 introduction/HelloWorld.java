import java.applet.*;
import java.awt.*;

public class HelloWorld extends Applet {

	static private int counter = 0;

	public void paint(Graphics g){
		String s = "Nice to see you the " + ++counter + " time!";
		g.drawString(s, 20, 50);
	}
}