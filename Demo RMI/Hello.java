import java.rmi.*;

public interface Hello extends Remote{
	
	public String message() throws RemoteException;
}
