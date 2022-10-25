package odev_2_4;


public class Main {

    
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.calculate();
        womanGameCalculator.gameOver();
        
        // You can't new a abstract without Override
            
        BaseGameCalculator gameCalculators = new WomanGameCalculator();
    }
    
}
