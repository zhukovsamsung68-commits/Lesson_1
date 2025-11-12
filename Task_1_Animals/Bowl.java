package com.example.animals;

public class Bowl {
    private int food;

    public Bowl(int initialFood) {
        this.food = Math.max(initialFood, 0);
    }

    public boolean tryTake(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("Добавлено " + amount + ". Теперь в миске " + food);
        }
    }

    public int getFood() {
        return food;
    }
}
