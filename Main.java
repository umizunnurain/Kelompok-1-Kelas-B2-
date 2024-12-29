package ServerRMI;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Server for handling zakat calculation services
 */
public class Main {

    public static void main(String[] args) {
        try {
            // Create service instance
            Services zakatService = new Services();

            // Create and bind registry
            Registry registry = LocateRegistry.createRegistry(2000);
            registry.bind("services", zakatService);

            System.out.println("Server is connected and ready for zakat calculations");
        } catch (RemoteException | AlreadyBoundException e) {
            e.printStackTrace();
            System.err.println("Server setup failed.");
        }
    }
}
