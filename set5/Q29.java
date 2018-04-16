/*2) Given a methodtaking a person name in the formate-"FirstName
lastName".write code to return the person name in the following
formate-"LastName","InitialOfName".
Example:
Input:Jessica Miller
output:Miller,J
*/

import java.util.*;

class Q29{
    public static void main(String[] args){
        System.out.println("Please enter a Firstname & Lastname separated by spaces");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //System.out.println(name);
        String[] arr = name.split(" ",2);
        System.out.println(arr[1]+","+arr[0].charAt(0));
    }
} 