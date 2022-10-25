package odev_2_6;

public class Main {

    public static void main(String[] args) {
//        We can't make new to Interfaceses.     
//        CustomerDao customerDao = new MySqlCustomerDao();
//        customerDao.add();

        CustomerManager customerManager = new CustomerManager(new SqlServerCustomerDao());
        
        customerManager.add();
    }

}
