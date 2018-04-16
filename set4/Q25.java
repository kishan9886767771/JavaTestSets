/*25. Check whether a given string is palindrome also check whether it has atleast 2 different vowels 
input: "madam" 
output: false(no 2 diff vowels) 
*/

/*import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class Q25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println(display(s));
  }
  public static String display(String s) {
    StringBuffer sb = new StringBuffer(s);
    int k = 0;
    LinkedHashSet<Character> l1 = new LinkedHashSet<Character>();
    String s2 = sb.reverse().toString();
    if (s2.equals(s)) {
      String s3 = s2.toLowerCase();
      for (int i = 0; i < s3.length(); i++) {
        l1.add(s3.charAt(i));
      }
      Iterator<Character> it = l1.iterator();
      while (it.hasNext()) {
        char a = it.next();
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')
          k++;
      }
    }
    if (k >= 2)
      return "true" + "number of " + k + "different vowels";
    else
    	return "false " + "(number of " + k + "different vowels)";
  }
}*/
public class Q25 {
	public static boolean palindromeAndVowelCheck(String s){
		boolean b=true;
		int c=0;
		String s1="aeiou";
		StringBuffer sb=new StringBuffer(s);
		String s2=sb.reverse().toString();
		if(!s2.equals(s))
			b=false;
		else{
		loop:
		for(int i=0;i<s.length();i++)
			for(int j=0;j<s1.length();j++)
				if(s1.charAt(i)==s.charAt(j)){
					c++; 
					continue loop; }
		if(c<2)
			b=false;
		}	
		System.out.println(c);
		return b;
	}
public static void main(String[] args) {
		String s="madam";
		System.out.println(palindromeAndVowelCheck(s));
	}
}