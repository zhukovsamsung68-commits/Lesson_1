package com.example.shapes;

public class Triangle implements Shape {
    private final double a, b, c;
    private final String fillColor;
    private final String borderColor;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2.0; // полупериметр
        return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // формула Герона
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}
