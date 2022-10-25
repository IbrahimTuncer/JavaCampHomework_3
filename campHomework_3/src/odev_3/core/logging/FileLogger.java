package odev_3.core.logging;


public class FileLogger implements BaseLogger {

    @Override
    public void log(String data) {
        System.out.println(data + "Logged to file");
    }
    
}
