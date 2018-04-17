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
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Q28 {

  public static boolean isValidDate(String inDate) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    dateFormat.setLenient(false);
    try {
      dateFormat.parse(inDate.trim());
    } catch (ParseException pe) {
      return false;
    }
    return true;
  }

  public static void main(String[] args) {

    System.out.println(isValidDate("2004-15-29"));
    //System.out.println(isValidDate("2005-02-29"));
  }
}