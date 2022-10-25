package odev_2_4;

public abstract class BaseGameCalculator { // It's not necessary to use abstract method in abstract class

    public abstract void calculate();//You have to Override this method if a class extends with BaseGameCalculator

    public final void gameOver() { // It is not Overrideable
        System.out.println("You lost");
    }
}
