package com.corejavaproject.Task;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class CustomerAccount {
    public static void main(String[] args) {
        Customer customer = new Customer(" Manisha ", 18742);
        Account account = new Account(" Savings ", 9845, customer);
        account.getAccountDetails();
    }
}
