package simple;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Math extends Remote {
    Result calculate(int a, int b, int c) throws RemoteException;
}
