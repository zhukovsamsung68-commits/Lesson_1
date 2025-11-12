package com.example.animals;

public class Main {
    public static void main(String[] args) {
        Dog bobik = new Dog("Бобик");
        Cat murzik = new Cat("Мурзик", 20);
        Bowl bowl = new Bowl(50);

        bobik.run(300);
        murzik.run(180);
        murzik.swim(5);

        Cat[] cats = {
                new Cat("Пушок", 15),
                new Cat("Барсик", 25),
                new Cat("Снежок", 20)
        };

        for (Cat cat : cats) cat.eat(bowl);
        bowl.addFood(30);
        for (Cat cat : cats) cat.eat(bowl);

        System.out.println("Всего животных: " + Animal.getAnimalsCount());
        System.out.println("Собак: " + Dog.getDogsCount());
        System.out.println("Котов: " + Cat.getCatsCount());
    }
}
