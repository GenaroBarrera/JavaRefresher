package com.genaro.PayrollApp;

public class ContractEmp extends Employee {
    double hoursWorked = 40;
    double payPerHour = 25;

    public ContractEmp(int id, String name, String empType) {
        super(id, name, empType);
    }

    @Override
    public double calculatePay() {
        //calculate pay for a contracted employee
        double pay = hoursWorked * payPerHour;
        //System.out.println("Contract Pay: " + pay);
        return pay;
    }
}
