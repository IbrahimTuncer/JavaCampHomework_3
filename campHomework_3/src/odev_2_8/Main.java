package odev_2_8;


public class Main {

    
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new  Product();
        product.id=10;
        product.name="Mouse";
        product.price=250;
        productManager.add(product);
        
        DatabaseHelper.Connection.CreateConnection();   
    }
    
}
