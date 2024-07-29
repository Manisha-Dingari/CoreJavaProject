package com.corejavaproject.Task;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Customer {
    private String customerName;
    private int customerId;

    public Customer(String customerName, int customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public void getCustomerDetails(){
        log.info("Customer details are CustomerName:{} and CustomerId:{}",customerName, customerId);
    }
}
