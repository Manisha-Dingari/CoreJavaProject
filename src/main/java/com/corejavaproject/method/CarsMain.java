package com.corejavaproject.method;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class CarsMain {
    public static void main(String[] args){
        Cars cars = new Cars("Red", "Sedan", 20000, 2000, "Sports", "Petrol");
        cars.getCarDetails();
    }
}
