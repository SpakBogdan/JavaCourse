package homework.supermarket;

public class MarketAppl extends  {
    Product[] products = new Product[4];

    products[0] = new Product(50, "Gift card", 1000L);
    products[1] = new Food(30, "Avakado", 1001L, "2024-04-15");
    products[2] = new MeatFood(20, "Sosages", 1002L, "2024-04-10", "biff");
    products[3] = new MilkFood(3, "Milk", 1003L, "2024-04-05", "cow", 3.5);
}
