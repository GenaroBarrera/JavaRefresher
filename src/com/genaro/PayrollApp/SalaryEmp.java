package com.genaro.PayrollApp;

public class SalaryEmp extends Employee {
    double fixedPay = 1500;
    double allowance = 500;

    //how does this constructor work?
    public SalaryEmp(int id, String name, String empType) {
        super(id, name, empType);
    }

    @Override
    public double calculatePay() {
        //calculate pay for a salaried employee
        double pay = fixedPay + allowance;
        //System.out.println("Salary Pay: " + pay);
        return pay;
    }
}
