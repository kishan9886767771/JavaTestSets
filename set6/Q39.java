/*12) Given a method with two strings as input.if strings are of some length simply append them together and return the final.if given strings are of different lenght,remove starting characters from the ponger string so that both string are of length then append them together and return the final string.
Example1:
input1=Hello
input2=hi
output=lohi
Example2:
input1=Hello;
input2=delhi
output2=HelloDelhi
*/

import java.util.*;
public class Q39 {
	public static String concatStrings(String s1,String s2)
	{
		StringBuffer sb=new StringBuffer();
		if(s1.length()==s2.length())
			sb.append(s1).append(s2);
		else if(s1.length()>s2.length()){
			s1=s1.substring((s1.length()/2)+1, s1.length());
			sb.append(s1).append(s2);
		}
		else if(s1.length()<s2.length()) {
			s2=s2.substring(s2.length()/2, s2.length());
			sb.append(s1).append(s2);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Two Strings : ");
		String s1=s.next();
		String s2=s.next();
		System.out.println(concatStrings(s1,s2));
	}
}