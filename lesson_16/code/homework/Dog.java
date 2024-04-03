package homework;

public class Dog extends Pet{
    Dog(String name, String bread, int height, int weight){
        super(name, bread, height, weight);
    }
    public void voice() {
        System.out.println("Гав - Гав! ");
    }
}
