package models;

import interfaces.GeometryThreeDimensionalShapeInterface;

public class SphereModel implements GeometryThreeDimensionalShapeInterface {
    private double radius;

    public SphereModel(double radius) {
        this.radius = radius;
    }

    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}
