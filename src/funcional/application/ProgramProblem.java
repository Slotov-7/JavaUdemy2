package funcional.application;

import funcional.entities.Product;
import funcional.util.PriceUpdate;
import funcional.util.ProductNameUppercase;
import funcional.util.ProductPredicate;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProgramProblem {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //list.removeIf(new ProductPredicate());
        //list.removeIf(Product::staticProductPredicate);
        //Predicate<Product> predicate = product -> product.getPrice() >= 100.00;

        Function<Product, String> nameFunction = product -> product.getName().toUpperCase();

        List<String> names = list.stream().map(nameFunction).toList();

        names.forEach(System.out::println);


    }
}
