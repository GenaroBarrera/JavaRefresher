package com.genaro.PayrollApp;

public class SalaryManager {
    public static void main(String[] args) { //how can I run this with args?
        //instantiate the employee by type
        Employee e;
        if(args[0].equals("SalaryEmployee")){
            e = new SalaryEmp(1,"GenaroS","salary");
            System.out.println(e.calculatePay());
        }
        if(args[0].equals("ContractEmployee")) {
            e = new ContractEmp(2,"GenaroC","contract");
            System.out.println(e.calculatePay());
        }
    }
}
