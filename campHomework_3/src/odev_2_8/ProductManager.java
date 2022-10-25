package odev_2_8;

public class ProductManager {
    public void add(Product product) {
        
        if (ProductValidator.isValid(product)) {
            System.out.println("Product added : " + product.name);
        } else {
            System.out.println("Product's informations are not valid");
        }
    }
    
    
}
