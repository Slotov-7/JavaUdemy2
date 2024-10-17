package txt_files.exercise;

public class Product {
    private final String name;
    private final Double price;
    private final Integer quantity;

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String name() {
        return name;
    }

    public Double price() {
        return price;
    }


    public Integer quantity() {
        return quantity;
    }

    public double totalValue(){
        return price() * quantity();
    }
}
