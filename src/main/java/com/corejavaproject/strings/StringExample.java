package com.corejavaproject.strings;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StringExample {

    public static void main(String[] args) {
    String name1 = "Rakesh";  // string pool
    String name2 = "Rakesh";  // string pool

    String name3 = new String("anitha");
    String name4 = new String("anitha");

        if(name3 == name4){
            log.info(true);
        } else {
            log.info(false);
        }

    }
}
