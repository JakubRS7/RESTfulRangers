package org.example.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.example.exceptions.Entity;
import org.example.exceptions.InvalidDataException;

public class DeliveryEmployeeRequest {

    private String name;
    private double salary;
    private String bankNumber;
    private String nationalInsuranceNumber;

    @JsonCreator
    public DeliveryEmployeeRequest(@JsonProperty("name") String name,
                                   @JsonProperty("salary") double salary,
                                   @JsonProperty("bankNumber") String bankNumber,
                                   @JsonProperty("nationalInsuranceNumber") String nationalInsuranceNumber) throws InvalidDataException {
        this.setName(name);
        this.setSalary(salary);
        this.setBankNumber(bankNumber);
        this.setNationalInsuranceNumber(nationalInsuranceNumber);
    }


    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) throws InvalidDataException {
        if (nationalInsuranceNumber == null || nationalInsuranceNumber.length() != 9) {
            System.out.println("Invalid length of national insurance number");

            String firstTwo = nationalInsuranceNumber.substring(0, 2);
            String middleSix = nationalInsuranceNumber.substring(2, 8);
            char lastChar = nationalInsuranceNumber.charAt(8);

            // Check first two and last are letters
            if (!Character.isLetter(firstTwo.charAt(0)) || !Character.isLetter(firstTwo.charAt(1)) || !Character.isLetter(lastChar)) {
                System.out.println("Invalid format of national insurance number");
                ;

                // Check middle six digits
                for (int i = 0; i < 6; i++) {
                    if (!Character.isDigit(middleSix.charAt(i))) {
                        System.out.println("Invalid format of national insurance number");
                    }
                }
                this.nationalInsuranceNumber = nationalInsuranceNumber;
            }
        } else {
            throw new InvalidDataException(Entity.EMPLOYEE);
        }
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) throws InvalidDataException {
        //validation code, max digits 34
        if(bankNumber != null && bankNumber.length() <= 34) {
            this.bankNumber = bankNumber;
        }else {
            throw new InvalidDataException(Entity.EMPLOYEE);
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws InvalidDataException {
        //ensure the number isn't negative
        if(salary >= 0) {
            this.salary = salary;
        } else {
            throw new InvalidDataException(Entity.EMPLOYEE);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidDataException {
        //add max length validation - 255 characters
        if(name != null && name.length() <= 255) {
            this.name = name;
        }else {
            throw new InvalidDataException(Entity.EMPLOYEE);
        }
    }
}
