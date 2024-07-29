package com.corejavaproject.constructor;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Customer {
    public static final double CUST_DISCOUNT = 0.20;

    private int customerId;
    private String customerName;

    /**
     * Default constructor
     */
    public Customer() {
        this.customerId = 1;
        this.customerName = "Sravya";
    }

    /**
     * Parameterized constructor
     */
    public Customer(int id, String name) {
        this.customerId = id;
        this.customerName = name;
    }

    public static void main(String[] args) {
        log.info(Customer.CUST_DISCOUNT);

        Customer customer = new Customer();
        log.info("Customer id:{}, Customer name:{}", customer.customerId, customer.customerName);

        Customer customer1 = new Customer(2, "Avinash");
        log.info("Customer id:{}, Customer name:{}", customer1.customerId, customer1.customerName);
    }
}
