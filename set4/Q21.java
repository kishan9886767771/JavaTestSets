import java.util.*;
public class Q21 {
	public static String extensionString(String s1){
		StringTokenizer t=new StringTokenizer(s1,".");
		t.nextToken();
		String s2=t.nextToken();
		return s2;
	}
	public static void main(String[] args) {
		String s1="hello.jpeg";
		System.out.println(extensionString(s1));
	}
}