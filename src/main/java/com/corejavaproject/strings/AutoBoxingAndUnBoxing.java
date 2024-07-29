package com.corejavaproject.strings;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AutoBoxingAndUnBoxing {
        public static void main(String [] args) {
            int input1 = 10;
            int input2 = 20;

            AutoBoxingAndUnBoxing autoBoxingAndUnBoxing = new AutoBoxingAndUnBoxing();
            autoBoxingAndUnBoxing.add(input1, input2);
        }

        public void add(Integer input1, Integer input2){
            int response = input1 + input2;
            log.info("Response:{}", response);
        }
     }
