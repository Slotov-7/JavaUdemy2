package funcional.services;

import funcional.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    public double filteredSum(List<Product> products, Predicate<Product> filter) {
        double sum = 0;
        for (Product product : products) {
            if (filter.test(product)) {
                sum += product.getPrice();
            }
        }
        return sum;
    }
}
