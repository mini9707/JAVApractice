package kiosk_feedback;

public class Product extends Menu{
    double price;

    Product(String name, double price, String desc){
        super(name,desc);
        this.price = price;
    }
}
