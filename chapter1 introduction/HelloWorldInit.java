import java.applet.*;
import java.awt.*;

public class HelloWorldInit extends Applet {
	String msg;
	int x, y;
	public void init() {
		msg = "Hello World";
		x = 20;
		y = 50;
		System.out.println("initialize");
	}

	public void start() {
		System.out.println("Start");
	}

	public void stop() {
		System.out.println("Stop");
	}

	public void destroy() {
		System.out.println("Destroy");
	}


	public void paint(Graphics g){
		g.drawString(msg, x, y);
		System.out.println("Paint");
	}
}