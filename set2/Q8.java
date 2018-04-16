//8. Given date in dd-MM-yyyy format.return the month in full name format(January) 
//input:"23-01-2012" 
//output:January 


import java.text.SimpleDateFormat;
import java.util.Date;


public class Q8 {
	public static String monthDiff(Date d1){
		SimpleDateFormat sdf=new SimpleDateFormat("MMMM");
		String s=(sdf.format(d1));
		return s;
	}
	public static void main(String[] args) {
		Date d1=new Date(23/01/2012);
		System.out.println(monthDiff(d1));
	}
}
