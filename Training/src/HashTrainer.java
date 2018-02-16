import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashTrainer {
	
	 // Create a hash map
	  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
	  
	  
	  public void hashDemo() {
	  hm.put(100,"Amit");  
	  hm.put(102,"Ravi");  
	  hm.put(101,"Vijay");  
	  hm.put(103,"Rahul");  
	  
	  for(Map.Entry m:hm.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
  	}
}
