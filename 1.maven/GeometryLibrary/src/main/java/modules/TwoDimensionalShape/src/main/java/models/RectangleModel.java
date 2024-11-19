package models;

import interfaces.GeometryTwoDimensionalShapeInterface;

public class RectangleModel implements GeometryTwoDimensionalShapeInterface {
    private double a,b;

    public RectangleModel(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a*b;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(a+b);
    }

    @Override
    public String toString() {
        return "RectangleModel{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
