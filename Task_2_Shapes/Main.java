package com.example.shapes;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "red", "black");
        Shape rectangle = new Rectangle(4, 6, "blue", "gray");
        Shape triangle = new Triangle(3, 4, 5, "green", "darkgreen");

        Shape[] shapes = { circle, rectangle, triangle };

        for (Shape s : shapes) {
            s.printInfo(); // вызываем дефолтный метод интерфейса
        }
    }
}
