package program1;
import java.util.HashMap;
import java.util.Map; 

public class HashmapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		   HashMap<Integer,String> hm=new HashMap<Integer,String>();   
		   hm.put(1,"Mango"); 
		   hm.put(2,"Apple");    
		   hm.put(3,"Banana");   
		   hm.put(4,"Grapes");   
		   System.out.println(hm);
		   //Printing hash map using loops
		   for(Map.Entry m : hm.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		   hm.put(4, "Apple");
		   //When we try to insert a duplicate key it will automatically change its value
		   System.out.println(hm);
	}  
}
