package odev_3.core.logging;

public class DatabaseLogger implements BaseLogger {

    @Override
    public void log(String data) {
        System.out.println(data + " Logged to Database");
    }

}
