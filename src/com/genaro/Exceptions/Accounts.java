package com.genaro.Exceptions;

public class Accounts {
     int accountID;
     double balanceAmount;

    public Accounts(int accountID, double balanceAmount) {
        this.accountID = accountID;
        this.balanceAmount = balanceAmount;
    }

    public double deposit(double amount) throws InvalidDepositAmountException {
        if(amount <= 0)
            throw new InvalidDepositAmountException("Deposit amount must be greater than 0!");
        else balanceAmount += amount;
        return balanceAmount;
    }
    public double withdraw(double amount) throws InsufficientBalanceException {
        if(amount > balanceAmount)
            throw new InsufficientBalanceException("Withdraw amount cannot be greater than current balance!");
        else balanceAmount -= amount;
        return balanceAmount;
    }
    public double transfer(double amount) throws LimitExceededException {
        if(amount > 500)
            throw new LimitExceededException("Transfer amount is limited to $500!");
        else balanceAmount -= amount;
        return balanceAmount;
    }
}
