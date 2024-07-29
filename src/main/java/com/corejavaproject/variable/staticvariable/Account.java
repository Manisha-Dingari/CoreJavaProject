package com.corejavaproject.variable.staticvariable;

import lombok.extern.log4j.Log4j2;

/*
 * Static variable example
 */
@Log4j2
public class Account {
    // static variable
    public static final String IFSC_CODE = "SBI000009";

    // instance variable
    private long accountNo = 1000l;
    private String accountName = "Roja";

    public static void main(String[] args) {
        // invoke static variable
        log.info(Account.IFSC_CODE);

        // instance variable
        Account account = new Account();
        log.info(account.accountNo);
        log.info(account.accountName);

        // local variable
        int interest = 10;
    }
}
