package com.corejavaproject.Statements;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Account {
    public static void main(String[] args) {
        int number = 5;
        Account account = new Account();
        account.print(5);
    }

    public void print(int number){
        for(int i= 1; i <= number; i++){
            log.info(i);
        }
    }

    public void print1(int number){
        int i =1;
        while (i <= number){
            log.info(i);
            i++;
        }
    }

    public void print2(int number){
        int i =1;
        do{
            log.info(i);
            i++;
        }while (i <= number);
    }

}