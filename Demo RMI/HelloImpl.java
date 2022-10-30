import java.rmi.*;
import java.rmi.server.*;

public class HelloImpl extends UnicastRemoteObject
        implements Hello{

    public HelloImpl() throws RemoteException {
        //There is no action need	 in this moment.
    }
    
    public String message() throws RemoteException {
        return ("Hello");
    }
}
