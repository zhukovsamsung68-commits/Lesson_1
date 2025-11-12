package com.example.shapes;

public interface Shape {
    String getFillColor();

    default String getBorderColor() {
        return null;
    }

    // Абстрактные методы — у каждой фигуры своя формула
    double getArea();
    double getPerimeter();

    // Дефолтный метод вывода информации
    default void printInfo() {
        System.out.printf(
                "%s: Площадь = %.2f, Периметр = %.2f, Цвет заливки = %s, Цвет границы = %s%n",
                this.getClass().getSimpleName(),
                getArea(),
                getPerimeter(),
                getFillColor(),
                getBorderColor()
        );
    }
}
