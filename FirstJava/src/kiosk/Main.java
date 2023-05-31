package kiosk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Product p = new Product();
        Order o = new Order();
        int count=0;
        while(true) {
            int ctPick = menu.Menu();
            p.Product(ctPick);
        }
    }
}
