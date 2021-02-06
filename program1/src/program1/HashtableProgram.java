package program1;
import java.util.Hashtable;
import java.util.Map;
public class HashtableProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Hashtable<Integer,String> ht = new Hashtable<Integer,String>();  
		  
		  ht.put(10,"Apple");  
		  ht.put(12,"Banana");  
		  ht.put(14,"Orange");  
		  ht.put(16,"Lemon");  
		  System.out.println(ht);
		  //remove one element
		  ht.remove(14);
		  System.out.println(ht);
		  //print hash table using loops
		  for(Map.Entry<Integer, String> entry:ht.entrySet()){    
		        int key=entry.getKey();  
		        String value=entry.getValue();  
		        System.out.println("Key:" + key);  
		        System.out.println("Value:"+value);   
		    }    
	}

}
