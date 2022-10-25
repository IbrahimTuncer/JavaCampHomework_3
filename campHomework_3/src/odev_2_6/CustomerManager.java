package odev_2_6;

public class CustomerManager {
    
    private CustomerDao customerDao;
    
    public CustomerManager(CustomerDao customerDao){
        this.customerDao = customerDao; 
    }
    public void add() {
        // iş kodları (müşteri adı girilmiş mi veriler doğru mu ? Kontroller falan yapılıyor bu kısımda)
        customerDao.add();
        
    }
}
