package oopCSharp_Java;

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDao());
        customerManager.add();
    }
}
