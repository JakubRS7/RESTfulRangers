package org.example.models;

import org.example.exceptions.InvalidDataException;

//abstract class since no Employee objects are ever created
public abstract class Employee {

    private int id;
    private String name;
    private double salary;
    private String bankNumber;
    private String nationalInsuranceNumber;

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
                this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        //validation code, max digits 34
            this.bankNumber = bankNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        //ensure the number isn't negative
            this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //add max length validation - 255 characters
            this.name = name;
    }

    public Employee(int id, String name, double salary, String bankNumber, String nationalInsuranceNumber) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.bankNumber = bankNumber;
        this.nationalInsuranceNumber = nationalInsuranceNumber;

    }
}

