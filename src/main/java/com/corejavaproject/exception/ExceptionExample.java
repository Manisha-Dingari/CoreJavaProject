package com.corejavaproject.exception;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ExceptionExample {

    public static void main(String[] args) {
            ExceptionExample example = new ExceptionExample();
            int output = example.divide(10,0);
            int output1 = example.divide1(10,0);
            log.info("Output:{}", output);
            log.info("Output:{}", output1);

        }

        public int divide1(int input1, int input2){
        int response1 = 0;
            response1 = input1 / input2;
            log.info("Response:{}", response1);

            return  response1;
        }

        public int divide(int input1, int input2){
            int response = 0;
            try {
                response = input1 / input2;
            } catch (ArithmeticException exm){
                log.error("Exception while divide the number", exm);
            }
            log.info("Response:{}", response);

            return  response;
        }

    }

