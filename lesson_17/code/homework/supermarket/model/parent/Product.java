package homework.supermarket.model.parent;

public class Product {
    private double price;
    private String name;
    private long barCode;

    public Product(double price, String name, long barCode) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", barCode=" + barCode +
                '}';
    }

    public double getPrice() {
        return price;
    }
}

