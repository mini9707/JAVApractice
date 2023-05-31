package kiosk;

import java.util.ArrayList;

public class Order{
    ArrayList<String> orderName = new ArrayList<String>();
    ArrayList<Double> orderPrice = new ArrayList<Double>();
    ArrayList<String> orderDesc = new ArrayList<String>();

    public void Order(){
    }
    void setProduct(String name, double price, String desc){
        orderName.add(name);
        orderPrice.add(price);
        orderDesc.add(desc);
    }

    void clearProduct(){
        orderName.clear();
        orderDesc.clear();
        orderPrice.clear();
    }

}
