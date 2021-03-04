package com.genaro.PayrollApp;

public abstract class Employee {
    private int id;
    private String name;
    private String empType;

    //all args constructor
    public Employee(int id, String name, String empType) {
        this.id = id;
        this.name = name;
        this.empType = empType;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    //calculate pay method
    public abstract double calculatePay();
}


