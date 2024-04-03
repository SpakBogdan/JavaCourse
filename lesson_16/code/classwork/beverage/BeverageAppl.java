package classwork.beverage;

public class BeverageAppl{
    public static void main(String[] args) {
    Beverage b1 = new Beverage("Milk", false, "Bauer", "",2);

    b1.toBuy("Milk", "box", 3);
    b1.displayStock();


    Beer beer = new Beer("Beer", true, "Pauliner","", 2, true, "while");

    beer.toBuy("beer", "box", 5);
    beer.displayStock();
    }
}
