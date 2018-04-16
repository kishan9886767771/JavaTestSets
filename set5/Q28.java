/*1) Given a method with a date string in format dd/mm/yyyy.
Write code to validate the given date against the given formate.
if it is a valid date return 1 else return -1.
Example1:
Input= 12/06/1987
output=1
Example1:
Input= 03/1/1987
output=-1
*/

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
public class Q28{
   public static int validateJavaDate(String strDate)
   {
	if (strDate.trim().equals(""))
	{
	    return 1;
	}
	else
	{
	    SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/mm/yyyy");
	    sdfrmt.setLenient(false);
	    
	    try
	    {
	        Date javaDate = sdfrmt.parse(strDate); 
	        System.out.println(strDate+" is valid date format");
	    }
	    catch (ParseException e)
	    {
	        System.out.println(strDate+" is Invalid Date format");
	        return -1;
	    }
	    return 1;
	}
   }
   public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Date in this Format dd/mm/yyyy");
	   String date = sc.next();
	validateJavaDate(date);
	/*validateJavaDate("12-29-2016");
	validateJavaDate("12,29,2016");*/
   }
}