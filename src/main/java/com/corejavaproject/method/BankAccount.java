package com.corejavaproject.method;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BankAccount {
    public static final String BANK_NAME = " Axis Bank";

    public int accountNo;
    public String accountName;

    public BankAccount() {
        this.accountNo = accountNo;
        this.accountName = accountName;
    }


    /**
     * Static method and print static variable
     * @param accountName
     * @param accountNo
     * @return
     */
    public static String getBankAccount (String accountName, int accountNo){
        String accountDetails = accountNo + accountName;
        return accountDetails;
    }

    public void accountDetails2(String accountName, int accountNo) {
        String details = accountName + accountNo;
        log.info("instance Bank Account details are :{}" , details);
    }

    //main method

    public static void main(String[] args) {
        String account = BankAccount.getBankAccount(BANK_NAME, 12364);
        log.info("Static Bank Account details are:{}", account);

        BankAccount bankAccount = new BankAccount();
        bankAccount.accountDetails2("HDFC ",123);
    }

}
