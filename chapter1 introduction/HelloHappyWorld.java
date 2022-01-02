public class HelloHappyWorld{
	public static void main(String[] args) {
		System.out.println("Hello, Happy String!");
		delay(5000);
	}

	public static void delay(long time) {
		long oldtime = System.currentTimeMillis();

		while(true){
			if(System.currentTimeMillis() - oldtime > time) break;
		}
	}
}