package odev_2_8;
// Böyle yardımcı araçlar static olarak kullanılabilir.
// Ürün kurallara uygun mu

public class ProductValidator {
    static{
        System.out.println("Static Constructor started");
    }
    
    public ProductValidator() {
        
    }

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public void bir_sey() {

    }
// inner class
//    public static class AnotherClass{
//        public static void remove(){
//            
 //       }
    }
