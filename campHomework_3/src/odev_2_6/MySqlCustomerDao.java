package odev_2_6;


public class MySqlCustomerDao implements CustomerDao,Repository {

    @Override
    public void add() {
        System.out.println("MySql added");
    }
    
}
