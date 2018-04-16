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