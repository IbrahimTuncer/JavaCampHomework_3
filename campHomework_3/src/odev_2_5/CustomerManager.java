package odev_2_5;

import odev_2_2.DatabaseLogger;

public class CustomerManager {
 
    BaseDatabaseManager databaseManager;

    public void getCustomers() {
        databaseManager.getData();
    }
}
