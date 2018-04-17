/* 10) Given a method with two sentence as string input. Write code to count the number of occurances of second word of second sentence in the first sentence. Return the count as output. Note-Consider case.
Example:
Input=Hi this is cognizant Academy
output=Hello this is a trainee
occurence : 1
*/
class Q37 {
 
static int countOccurences(String str, String m) 
{

    String a[] = str.split(" ");
     int count = 0;
    for (int i = 0; i < a.length; i++) 
    {
	    if (m.equals(a[i]))
	        count++;
	    }
    System.out.print("Number of Occurences in String is :");
    return count;
}
 

public static void main(String args[]) 
{
    String str = "Hi this is cognizant Academy";
    String output="Hello this is a trainee";
    /*Pattern p=Pattern.compile("output[1]");
	Matcher m=p.matcher(str);*/
    String sp[] = output.split(" ");
    String m = sp[1];
    //String word = "portal";
    System.out.println(countOccurences(str, m));
}
}