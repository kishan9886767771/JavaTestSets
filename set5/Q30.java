import java.util.Map.Entry;
import java.util.*;

public class Q30 {
	public static void main(String args[])
	{
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		  map.put(2,"hi");
		  map.put(8,"hello");
		  map.put(12,"hello world");
		  
		  for(Iterator<Entry<Integer, String>>it=map.entrySet().iterator();it.hasNext();){
			     Entry<Integer, String> entry = it.next();
			     if (entry.getKey()% 4==0) {
			          it.remove();
			     }
			 }
		  System.out.println("Map Size : "+map.size());
		  
	}
}
