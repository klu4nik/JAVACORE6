package main.java.com.andrii.practice.module04.task041;

import java.util.Currency;

/**
 * Created by Klu4nik on 25/03/2017.
 */

public class USbank extends Bank {
    public USbank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital){
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
    public int getLimitOfWithdrawal(){
        return 
    }

    public abstract int getLimitOfFunding();

    public abstract double getMonthlyRate();

    public abstract int getCommission(int summ);

}
