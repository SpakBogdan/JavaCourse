package classwork.beverage;

public class Beer extends Beverage{
    private boolean isDraft;
    private String sort;

    public Beer(String type, boolean isAlcohol, String name, String title, int quantity, boolean isDraft, String sort) {
        super(type, isAlcohol, name, title, quantity);
        this.isDraft = isDraft;
        this.sort = sort;
    }

    public void toBuy(String title, String packing, int quantity){
        super.toBuy(title, packing, quantity);
        this.sort = sort;
    }
    public void displayStock(){
        super.displayStock();
        System.out.println("This is " + sort + "Beer.");
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
