package models;

import interfaces.GeometryTwoDimensionalShapeInterface;

public class TriangleModel implements GeometryTwoDimensionalShapeInterface {
    double a,b,c;

    public TriangleModel(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double halfPerimeter = this.calculatePerimeter()/2;
        return Math.pow((halfPerimeter*(halfPerimeter-a) * (halfPerimeter-b) *(halfPerimeter-c)), 0.5);
    }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }

    @Override
    public String toString() {
        return "TriangleModel{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
