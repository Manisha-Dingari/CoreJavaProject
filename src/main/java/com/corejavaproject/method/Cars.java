package com.corejavaproject.method;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Cars {
    private String color;
    private String model;
    private int price;
    private Engine engine;

    public Cars(String color, String model, int price, int engineCC, String variant, String engineType) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.engine = new Engine(engineCC, variant, engineType);
    }

    public void getCarDetails() {
        log.info("color:{} and model:{} and price:{}", color, model, price);
        engine.getEngine();
    }
}
