package classwork.beverage;

public class Beverage {
private String type;
private boolean isAlcohol;
private String name;
private String title;
private int quantity;

    public Beverage(String type, boolean isAlcohol, String name, String title, int quantity) {
        this.type = type;
        this.isAlcohol = isAlcohol;
        this.name = name;
        this.title = title;
        this.quantity = quantity;
    }

    // no arguments constructor
    public Beverage() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAlcohol() {
        return isAlcohol;
    }

    public void setAlcohol(boolean alcohol) {
        isAlcohol = alcohol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // method to buy

    public void toBuy(String title, String packing, int quantity){
        System.out.println("Go to market and buy: " + title + ", " + packing + ", " + quantity + ".");
    }

    // what we have on stock
    public void displayStock(){

    }

}
