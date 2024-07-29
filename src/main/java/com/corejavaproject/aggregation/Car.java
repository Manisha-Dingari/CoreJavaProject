package com.corejavaproject.aggregation;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Car {
    private String color;
    private String model;
    private int price;
    private Engine engine;

    public Car(String color, String model, int price, Engine engine) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.engine = engine;
    }
    public void getCarDetails() {
        log.info("color:{} and model:{} and price:{}", color, model, price);
        engine.getEngineDetails();
    }
}
