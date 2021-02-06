import java.rmi.*;
import java.rmi.server.*;
import java.lang.Math;
public class RmiServer extends UnicastRemoteObject implements Sumodd {
	public RmiServer() throws RemoteException {
		super();
	}
	public int sum(int n) throws RemoteException {
		int s=0;
		for(int i = 1; i <= n;i+=2) 
		{
			s = s+i;
		}
		return s;
	}
	public static void main(String args[]) throws Exception{
		RmiServer r = new RmiServer();
		System.out.println("Rmi server is running");
		Naming.rebind("SumoddServer",r);
	}
}