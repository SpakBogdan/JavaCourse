package homework;

public class Cat extends Pet{
    Cat(String name, String breed, int height, int weight) {
        super(name, breed, height, weight);
    }

    public void voice(){
        System.out.println("Мяу! ");
    }
}
