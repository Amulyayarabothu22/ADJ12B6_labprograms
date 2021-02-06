package program1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;  
public class ArrayListProgram
{  
	 public static void main(String args[])
	 {  
		 ArrayList<Integer> arr = new ArrayList<Integer>();   
		 arr.add(10); 
		 arr.add(80);    
		 arr.add(25);    
		 arr.add(97);
		 arr.add(45);
		 //Print the elements in single line
		 System.out.println(arr);
		 //Print the array elements line by line
		 Iterator it = arr.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());  
		 }
		 //Using Collections sort
		 Collections.sort(arr);
		 System.out.println(arr);
	 }  
}  