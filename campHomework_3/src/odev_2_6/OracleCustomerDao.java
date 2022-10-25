package odev_2_6;


public class OracleCustomerDao implements CustomerDao {

    @Override
    public void add() {
        System.out.println("Oracle added");
    }
    
}
