package oopCSharp_Java;


public class MySQLCustomerDao implements CustomerDao,RepositoryDao {

    @Override
    public void add() {
        System.out.println("My SQL'e eklendi");
    }
    
}
