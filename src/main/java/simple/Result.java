package simple;

import java.io.Serializable;

public class Result implements Serializable {

    private double x1;
    private double x2;

    public Result() {
    }

    public Result(double x1) {
        this.x1 = x1;
    }

    public Result(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public void printResult() {
        System.out.println("x1: " + x1 + " | x2: " + x2);
    }

}
