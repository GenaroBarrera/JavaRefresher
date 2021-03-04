package com.genaro.Exceptions;

public class AccountMain {
    public static void main(String[] args) throws InvalidDepositAmountException, InsufficientBalanceException, LimitExceededException {
        //check for nullPointerException
        if(args[0] == null || args[1] == null){
            throw new NullPointerException("Pass in a transaction type and an amount!");
        }
        //create an account object
        Accounts myAccount = new Accounts(1,1500.00);

        //parse the args
        String action=args[0];
        String s2=args[1];
        double amount = Double.parseDouble(s2); //should throw a NumberFormatException if null,empty,alpha numeric

        //call on the transaction methods and print the balance
        System.out.println(myAccount.deposit(amount));
        System.out.println(myAccount.withdraw(amount));
        System.out.println(myAccount.transfer(amount));

        //try incorporating a try catch block, also I'm not sure if this is exactly how he wanted it done
    }
}
