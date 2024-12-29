package ServerRMI;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author apple
 */
public class Services extends UnicastRemoteObject implements OperationRMI {

    protected Services() throws RemoteException {
        super();
    }

    private static final long serialVersionUID = 1L;

    @Override
   
    public float calculateZakat(float pendapatanBulanan, float kebutuhanPokok) throws RemoteException {
        float pendapatanBersih = pendapatanBulanan - kebutuhanPokok;
        if (pendapatanBersih > 0) {
            return pendapatanBersih * 0.025f; // Zakat sebesar 2.5%
        }
        return 0; // Tidak ada zakat jika pendapatan bersih <= 0
    }
}
