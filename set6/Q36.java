/*3)all alphabets should be in capital case
If pan card no is valid return 1as output else return 2 as output
Example
input=ALD3245E
output=1
*/

import java.util.*;
class Q36 
{
 public static void main(String[] args) 
 {
  Scanner scn=new Scanner(System.in);
  
  String s = scn.next();
  boolean ss=false;
  if(s.length()==8)
  {
	  
	   ss = s.matches("[A-Z]{3}\\d{4}[A-Z]{1}");
	  System.out.println(ss);
	  
  }
  else
  {
	  System.out.println("Incorrect pan details " +ss);
	  System.exit(0);
	  
  }
 }
}