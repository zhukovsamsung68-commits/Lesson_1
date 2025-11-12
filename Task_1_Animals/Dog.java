package com.example.animals;

public class Dog extends Animal {
    private static final int RUN_LIMIT = 500;
    private static final int SWIM_LIMIT = 10;
    private static int dogsCount = 0;

    public Dog(String name) {
        super(name);
        dogsCount++;
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
        if (distance <= SWIM_LIMIT)
            System.out.println(name + " проплыл " + distance + " м.");
        else
            System.out.println(name + " не смог проплыть " + distance + " м (лимит " + SWIM_LIMIT + ").");
    }

    public static int getDogsCount() {
        return dogsCount;
    }
}
