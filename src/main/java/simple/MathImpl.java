package simple;

import java.rmi.RemoteException;

public class MathImpl implements Math {

    @Override
    public Result calculate(int a, int b, int c) throws RemoteException {
        int D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - java.lang.Math.sqrt(D)) / (2 * a);
            x2 = (-b + java.lang.Math.sqrt(D)) / (2 * a);
            return new Result(x1, x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            return new Result(x);
        }
        else {
            return new Result();
        }
    }
}
