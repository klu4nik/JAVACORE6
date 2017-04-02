package main.java.com.andrii.practice.module04.task043;


import main.java.com.andrii.practice.module04.task042.Currency;

/**
 * Created by Klu4nik on 25/03/2017.
 */
public abstract class Bank1 {
    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployees;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    public Bank1(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        this.id = id;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    public long getId() {
        return this.id;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public String getBankCountry() {
        return this.bankCountry;
    }

    public int getNumberOfEmployees() {
        return this.numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return this.avrSalaryOfEmployee;
    }

    public long getRating() {
        return this.rating;
    }

    public long getTotalCapital() {
        return this.totalCapital;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

    public abstract int getLimitOfWithdrawal();

    public abstract int getLimitOfFunding();

    public abstract double getMonthlyRate();

    public abstract double getCommission(int summ);

    public double moneyPaidMonhlyForSalary() {
        return this.avrSalaryOfEmployee * this.numberOfEmployees;
    }

}
