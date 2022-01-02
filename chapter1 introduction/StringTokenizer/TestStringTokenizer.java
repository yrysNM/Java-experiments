import java.util.StringTokenizer;

public class TestStringTokenizer {
	public static void main(String[] args) {
		String  data = "23 345 45 56 78 898 909 56";
		StringTokenizer st = new StringTokenizer(data);
		int s= 0;

		while(st.hasMoreTokens()) {
			try {
				s += Integer.parseInt(st.nextToken()); 
			}catch(NumberFormatException ex) {

			}
		} 

		System.out.println(String.valueOf(s));
	}
}