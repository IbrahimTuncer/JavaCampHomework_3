package odev_2_2;


public class DatabaseLogger extends BaseLogger {
    public void log(String message) {
        System.out.println("Logged to database  : "+message);
    }
}
