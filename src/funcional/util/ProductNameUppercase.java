package funcional.util;

import funcional.entities.Product;

import java.util.function.Function;

public class ProductNameUppercase implements Function<Product, String> {

    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
