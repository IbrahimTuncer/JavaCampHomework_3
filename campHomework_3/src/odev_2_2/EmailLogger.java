package odev_2_2;


public class EmailLogger extends BaseLogger {
    public void log(String message) {
        System.out.println("Logged to email  : "+message);
    }
}
