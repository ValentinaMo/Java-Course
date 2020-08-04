package com.company;

public class BankAccount {
    // Create a new class for a bank account
    //Create fields for the account number, balance, customer name, email amd phone number
    //
    //Create getters and setters for each field
    //Create two additional methods
    // 1. To allow the customer to deposit funds /this should increment the balance field)
    // 2. To allow the customer to withdraw funds. This sould deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the Main class (the one rceated by intellij) to
    // confirm toy code is working.
    //Add some sout in the two methods above as well

    private String accountNumber;
    private double accountBalance;
    private String name;
    private String email;
    private String phoneNumber;

    public void BankAccount(String accountNumber, double accountBalance, String name, String email, String phoneNumber){
        System.out.println("Account costructor with parameters call");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public void deposit(double depositAmount){
        this.accountBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance: " + this.accountBalance);
    }

    public void withdrawal(double withdrawalAmount){
        if (this.accountBalance - withdrawalAmount<0){
            System.out.println("The account balance is: " + this.accountBalance + " And withdrawal not processed");
        } else {
            this.accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of "+ withdrawalAmount + " Remaining balance = "+this.accountBalance);
        }
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
