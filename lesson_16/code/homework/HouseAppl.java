package homework;

import java.util.ArrayList;

public class HouseAppl {
    public static void main(String[] args) {
        Pet[] pets = {
                new Dog("Шарик", "Дворняжка", 50, 20),
                new Dog("Бобик", "Овчарка", 55, 25),
                new Cat("Мурзик", "Сиамская", 30, 10),
                new Cat("Барсик", "Персидская", 25, 8),
                new Cat("Рыжик", "Рыжая", 28, 9)
        };

        System.out.println("Начало дня в доме:");
        for (Pet pet : pets) {
            System.out.println(pet.getName() + " (" + pet.getBreed() + "), голос: ");
            pet.voice();
        }

        System.out.println("Жизнь в доме в течение дня:");
        feedPets(pets);
        walkDogs(pets);
    }

    private static void feedPets(Pet[] pets) {
        System.out.println("Кормление животных:");
        for (Pet pet : pets) {
            System.out.println("Кормим " + pet.getName() + "...");
            // Здесь может быть ваша логика кормления
        }
    }

    private static void walkDogs(Pet[] pets) {
        ArrayList<Dog> dogs = new ArrayList<>();
        for (Pet pet : pets) {
            if (pet instanceof Dog) {
                dogs.add((Dog) pet);
            }
        }

        System.out.println("Прогулка с собаками:");
        for (Dog dog : dogs) {
            System.out.println("Выгуливаем собаку " + dog.getName() + "...");
        }
    }
}

