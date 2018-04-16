/*7) Given a method with a string input.Write code to get the sum of all the digits present in the given String.Return the sum as output.If there is no digit in the given string return -1 as output.
Example:
Input=good23bad4
output=2+3+4=9
*/
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