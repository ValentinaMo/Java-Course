package com.company;

public class Main {

    public static void main(String[] args) {
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
        BankAccount valentinaAccount = new BankAccount();
        valentinaAccount.setAccountNumber("1032496503");
        valentinaAccount.setEmail("vallen_mp@hotmail.com");
        valentinaAccount.setName("Valentina Moreno");
        valentinaAccount.set;
        valentinaAccount.withdrawal(10.0);

        valentinaAccount.deposit(100.0);
        valentinaAccount.withdrawal(100.0);

        valentinaAccount.deposit(200.0);
        valentinaAccount.withdrawal(50.0);




    }
}
