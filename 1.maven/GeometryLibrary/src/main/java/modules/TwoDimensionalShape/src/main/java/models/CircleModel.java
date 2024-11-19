package models;

import interfaces.GeometryTwoDimensionalShapeInterface;

public class CircleModel implements GeometryTwoDimensionalShapeInterface {

private double radius;

    public CircleModel(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "CircleModel{" +
                "radius=" + radius +
                '}';
    }
}
