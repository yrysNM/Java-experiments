import java.util.*;

class Enum implements Enumeration {
	private int counter = 0;
	private int NUMBER_OF_ELEMENTS = 5;
	private boolean hasMore = true;


	public boolean hasMoreElements() {
		return hasMore;
	}

	public Object nextElement() {
		if(hasMoreElements()) {
			counter++;
			if(counter >= NUMBER_OF_ELEMENTS) hasMore = false;
				return new String("Item " + counter);
		} else {
			return null;
		}
	}
}

class TestEnumeration {
	public static void main(String[] args) {
		Enumeration enum0 = new Enum();

		while(enum0.hasMoreElements()) {
			System.out.println(enum0.nextElement());
		}

		try {
			System.in.read();

		}catch(java.io.IOException e) {

		} 
	}
}