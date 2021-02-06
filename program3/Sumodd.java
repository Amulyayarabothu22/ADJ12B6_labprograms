import java.rmi.*;

public interface Sumodd extends Remote {

	public int sum(int n) throws RemoteException;
}