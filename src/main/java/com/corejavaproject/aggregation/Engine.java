package com.corejavaproject.aggregation;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Engine {
    private int engineCC;
    private String variant;
    private String engineType;

    public Engine(int engineCC, String variant, String engineType){
        this.engineCC = engineCC;
        this.variant =variant;
        this.engineType = engineType;
    }

    public void getEngineDetails(){
        log.info("EngineCC:{} and Variant:{} and EngineType:{}", engineCC, variant,engineType);
    }
}