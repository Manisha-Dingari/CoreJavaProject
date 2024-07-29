package com.corejavaproject.method;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Calculator {

    public int add(int input1, int input2){
        int result = input1 + input2;
        return result;
    }

    public int mul(int input1, int input2){
        int result2 = input1 * input2;
        return result2;
    }

    public double div(int input1, int input2){
        int result3 = input1 / input2;
        return result3;
    }

    public int sub(int input1, int input2){
        int result4 = input1 - input2;
        return result4;
    }

    public void addition(int input1, int input2){
        int result = input1 + input2;
        log.info("Output:{}", result);
    }

    public void multiplication(int input1, int input2){
        int result2 = input1 * input2;
        log.info("Output2:{}", result2);
    }

    public void division(int input1, int input2){
        int result3 = input1 / input2;
        log.info("Output3:{}", result3);
    }

    public void substraction(int input1, int input2){
        int result4 = input1 - input2;
        log.info("Output4:{}", result4);
    }

    public static void main(String[] args) {

        //Invoke instance method
        Calculator calculator = new Calculator();
        calculator.addition(4,5);
        calculator.substraction(10,5);
        calculator.multiplication(3,5);
        calculator.division(8,4);


        int output = calculator.add(10,20);
        log.info("Addition of input1:{} and input2:{} and output:{}", 10, 20, output);

        int output2 = calculator.sub(100,30);
        log.info("subtraction of input1:{} and input2:{} and output2:{}", 100, 30, output2);

        double output3 = calculator.div(80,7);
        log.info("division of input1:{} and input2:{} and output3:{}", 80, 7, output3);

        int output4 = calculator.mul(15,3);
        log.info("multiplication of input1:{} and input2:{} and output4:{}", 15, 3, output4);
    }
}

