/*5) Given a method taking string as input.Write code to check if
given string contains exactly five vowels and the vowels
should be alphabetical order.return 1 if condition is satisfied else
return 2.assume there is no repetition of any vowel in any given
string.
Example:
Input=acebisouzz
output=1
*/

public class Q32 {
	public static int palindromeAndVowelCheck(String s)
	{
		
		int c=0;
		//String s1="aeiou";
		
		for(int i=0;i<s.length();i++) 
		{
				if('a'==s.charAt(i)||'e'==s.charAt(i)||'i'==s.charAt(i)||'o'==s.charAt(i)||'u'==s.charAt(i))
				{
					c++; 
				}
		}
		if(c==5) 
		{
			
			return 1;
		}
		else
		{
			return -1;
		}
		
}
		
public static void main(String[] args) {
		String s="acebisozuz";
		System.out.println(palindromeAndVowelCheck(s));
	}
}