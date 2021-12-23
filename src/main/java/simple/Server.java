package simple;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends MathImpl {

    public static void main(String[] args) {
        try {
            MathImpl obj = new MathImpl();
            Math stub = (Math) UnicastRemoteObject.exportObject(obj, 25555);
            Registry registry = LocateRegistry.createRegistry(25555);
            registry.bind("Math", stub);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
