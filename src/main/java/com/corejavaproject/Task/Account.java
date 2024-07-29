package com.corejavaproject.Task;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Account {
    private String accountName;
    private int accountId;
    private Customer customer;

    public Account(String accountName, int accountId, Customer customer) {
        this.accountName = accountName;
        this.accountId = accountId;
        this.customer = customer;
    }

    public void getAccountDetails() {
        log.info("Account details are AccountName:{} and AccountId:{}", accountName, accountId);
        customer.getCustomerDetails();
    }
}
