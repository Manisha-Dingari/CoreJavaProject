package com.corejavaproject.aggregation;

public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine( 20000, "Sports", "Petrol");
        Car car = new Car("Green", "Sedan", 50000, engine);
        car.getCarDetails();
    }
}
