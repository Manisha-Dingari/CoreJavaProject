package com.corejavaproject.strings;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class EqualsExample {
    public static final String NAME = "Manisha";

    public static void main(String[] args) {
        String name = "Manisha";

        if (NAME.equals(name)) {
            log.info("Name is matching");
        } else {
            log.info("Name is not matching");
        }
    }
}

