package org.example.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeliveryEmployeeRequest {

    private String name;
    private double salary;
    private String bankNumber;
    private String nationalInsuranceNumber;

    @JsonCreator
    public DeliveryEmployeeRequest(@JsonProperty("name") String name,
                                   @JsonProperty("salary") double salary,
                                   @JsonProperty("bankNumber") String bankNumber,
                                   @JsonProperty("nationalInsuranceNumber") String nationalInsuranceNumber) {
        this.name = name;
        this.salary = salary;
        this.bankNumber = bankNumber;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }


    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        //Here we can put validation code to ensure the insurance number is in correct format
        //first two characters are letters, following 6 are digits, last is a letter
        //total length == 9
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





}
