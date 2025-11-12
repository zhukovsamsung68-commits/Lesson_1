package com.example.animals;

public class Cat extends Animal {
    private static final int RUN_LIMIT = 200;
    private static int catsCount = 0;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
        this.satiety = false;
        catsCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_LIMIT)
            System.out.println(name + " пробежал " + distance + " м.");
        else
            System.out.println(name + " не смог пробежать " + distance + " м (лимит " + RUN_LIMIT + ").");
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + ": коты не умеют плавать.");
    }

    public void eat(Bowl bowl) {
        if (satiety) {
            System.out.println(name + " уже сыт и не ест.");
            return;
        }
        if (bowl.tryTake(appetite)) {
            satiety = true;
            System.out.println(name + " поел " + appetite + " еды.");
        } else {
            System.out.println(name + " не стал есть — мало еды в миске.");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public static int getCatsCount() {
        return catsCount;
    }
}
