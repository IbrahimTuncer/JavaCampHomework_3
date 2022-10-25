package odev_2_3;

public class BaseCreditManager {
 //
    public double calculate(double sum) { // If we use public final double calculate here we can't make Override!
        return sum * 1.18;
    }
}
