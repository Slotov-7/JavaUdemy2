package map.application;

import map.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class ProgramProduct {
    public static void main(String[] args) {

        Map<Product, Double> cookies = new HashMap<>();

        Product apple = new Product("Apple", 1.99);
        Product banana = new Product("Banana", 2.99);
        Product orange = new Product("Orange", 3.99);

        cookies.put(apple, 5.00);
        cookies.put(banana, 7.00);
        cookies.put(orange, 9.00);

        Product apple2 = new Product("Apple", 1.99);

        System.out.println("Contains 'apple' key: " + cookies.containsKey(apple2));
    }
}
