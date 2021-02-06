
import java.rmi.*;
import java.util.*;
public class RmiClient {
	public static void main(String args[]) throws Exception{
		int n,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value:");
		n = sc.nextInt();
		Sumodd a = (Sumodd)Naming.lookup("rmi://localhost:1099/SumoddServer");
		result = a.sum(n);
		System.out.println("sum of first "+ n + " odd numbers is: " + result);
	}
}



