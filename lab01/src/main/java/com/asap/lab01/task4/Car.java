package com.asap.lab01.task4;

public class Car {

    // Required fields
    private int horsepower;
    private double engineVolume;

    // Additional fields
    private String brand;
    private String model;
    private int productionYear;
    private String color;
    private boolean isAWD;

    public Car(int horsepower, double engineVolume, String brand, String model, int productionYear, String color, boolean isAWD) {
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.color = color;
        this.isAWD = isAWD;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
}
