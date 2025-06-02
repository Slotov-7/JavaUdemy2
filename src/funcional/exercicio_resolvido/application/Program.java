package funcional.exercicio_resolvido.application;

import funcional.exercicio_resolvido.entities.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args)  {

        Locale.setDefault(Locale.US);

        List<Product> products = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the complete path  ");
        String path = sc.nextLine();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path)) ){
            String line = bufferedReader.readLine();
            while(line != null){
                String[] split = line.split(",");
                products.add(new Product(split[0], Double.parseDouble(split[1])));
                line = bufferedReader.readLine();
            }

            double avg = products.stream().map(product -> product.getPrice()).reduce(0.0, (x,y)-> x + y) / products.size();

            System.out.println("Average price: " + String.format("%.2f", avg));

            Comparator<String> comparator = (o1, o2) -> o1.toUpperCase().compareTo(o2.toUpperCase());

            List<String> names = products.stream()
                    .filter(product -> product.getPrice() < avg)
                    .map(Product::getNome)
                    .sorted(comparator.reversed())
                    .toList();
            names.forEach(System.out::println);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        sc.close();
    }
}
