package simple;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(null, 25555);
            Math stub = (Math) registry.lookup("Math");
            Result calculate = stub.calculate(1, -8, 15);
            calculate.printResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
