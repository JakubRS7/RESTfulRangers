package org.example.models;

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
        if (nationalInsuranceNumber == null || nationalInsuranceNumber.length() != 9) {
            System.out.println("Invalid length of national insurance number");;
        }

        String firstTwo = nationalInsuranceNumber.substring(0, 2);
        String middleSix = nationalInsuranceNumber.substring(2, 8);
        char lastChar = nationalInsuranceNumber.charAt(8);

        // Check first two and last are letters
        if (!Character.isLetter(firstTwo.charAt(0)) || !Character.isLetter(firstTwo.charAt(1)) || !Character.isLetter(lastChar)) {
            System.out.println("Invalid format of national insurance number");;
        }

        // Check middle six digits
        for (int i = 0; i < 6; i++) {
            if (!Character.isDigit(middleSix.charAt(i))) {
                System.out.println("Invalid format of national insurance number");;
            }
        }
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        //validation code, max digits 34
        if(bankNumber != null && bankNumber.length() <= 34) {
            this.bankNumber = bankNumber;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        //ensure the number isn't negative
        if(salary >= 0) {
            this.salary = salary;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //add max length validation - 255 characters
        if(name != null && name.length() <= 255) {
            this.name = name;
        }
    }

    public Employee(int id, String name, double salary, String bankNumber, String nationalInsuranceNumber) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.bankNumber = bankNumber;
        this.nationalInsuranceNumber = nationalInsuranceNumber;

    }
}

