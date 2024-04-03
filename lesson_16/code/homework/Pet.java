package homework;

/*Создайте дочерние от класса Pet классы Cat и Dog c дополнительными полями: порода, рост, вес.
Создайте метод voice, который выдает "Мяу!" для класса Cat и и "Гав-гав!" для класса Dog.
Создайте HouseAppl, в котором есть метод main. Поселите в доме 2 собаки и 3 кошки.
Смоделируйте жизнь в этом доме в течение дня.*/

public class Pet {
private String name;
private String breed;
private int height;
private int weight;

    public Pet(String breed, String name, int height, int weight) {
        this.breed = breed;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void voice() {
    }
}
