
package oopCSharp_Java;


public class OracleCustomerDao implements CustomerDao,RepositoryDao {
    @Override
    public void add() {
        System.out.println("Oracle'a eklendi");
    }
}
