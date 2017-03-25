package main.java.com.andrii.practice.module03.task034;

import javax.xml.soap.SOAPPart;

/**
 * Created by Klu4nik on 19/03/2017.
 */
public class User {
    public static final double commisionFivePerc = 0.05;
    public static final double comissionTenPerc = 0.1;
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, double balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void paySalary() {
        this.balance = this.balance + salary;
        System.out.println("Your salary: " + this.salary + " Your balance after paying salary: " + balance);
    }

    public boolean withdraw(double summ) {
        double withdrawalComission;
        if (summ < 1000) {
            withdrawalComission = comissionTenPerc;
        } else {
            withdrawalComission = commisionFivePerc;
        }
        if (this.balance > summ * (1 + withdrawalComission)) {
            this.balance = this.balance - summ * (1 + withdrawalComission);
            System.out.println("Withdrawal " + summ + " is successfull. Comission: "
                    + summ * withdrawalComission + "Your balance is: " + this.balance);
            return true;
        } else {
            System.out.println("Withdrawal " + summ + " is canceled. You balance" + this.balance +
                    " isn't enough to make this  transaction");
            return false;
        }
    }

    public int companyNameLength() {
        System.out.println("Company name length is: " + this.companyName.length());
        return this.companyName.length();
    }

    public void monthIncreaser(int addMonth) {
        System.out.println(this.name + " works in company for  " + this.monthsOfEmployment);
        this.monthsOfEmployment = this.monthsOfEmployment + addMonth;
        System.out.println(addMonth + " months added to " + this.name + "experience." +
                this.name + " works in company for  " + this.monthsOfEmployment);
    }

}
