package models;

import interfaces.GeometryThreeDimensionalShapeInterface;

public class CubeModel implements GeometryThreeDimensionalShapeInterface {

    private double baseSide;

    public CubeModel(double baseSide) {
        this.baseSide = baseSide;
    }

    public double calculateVolume() {
        return Math.pow(baseSide, 3);
    }

}