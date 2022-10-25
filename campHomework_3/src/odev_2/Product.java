package odev_2;

public class Product {
    // attribute fields

    public Product(int id,int stockAmount,String name,String description,String renk,double price) {
         this.id = id;
         this.stockAmount=stockAmount;
         this.name=name;
         this.description=description;
         this.renk=renk;
         this.kod=kod;
         this.price=price;
    }

    private int id;
    private int stockAmount;
    private String name;
    private String description;
    private String renk;
    private String kod;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0, 1) + id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
