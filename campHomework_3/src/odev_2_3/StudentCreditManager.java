package odev_2_3;


public class StudentCreditManager extends BaseCreditManager {
    @Override
    public double calculate(double sum){
        return 1.1*sum;
    }
}
