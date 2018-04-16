
public class Q34 {
	public static void main(String args[]) {
			String a = "good23bad4";

		int sum = 0;

		for(int i = 0; i < a.length(); i++) {
		    if(Character.isDigit(a.charAt(i))) {
		        sum = sum + Integer.parseInt(a.charAt(i) + "");
		    } 
		}

		System.out.println(sum);
	 
	}
}