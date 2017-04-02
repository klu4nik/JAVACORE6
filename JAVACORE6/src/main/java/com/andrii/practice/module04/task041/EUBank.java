package main.java.com.andrii.practice.module04.task041;

import java.util.Currency;

/**
 * Created by Klu4nik on 02/04/2017.
 */
public class EUBank extends Bank{
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal() {
        return 0;
    }

    public int getLimitOfFunding() {
        return 0;
    }

    public double getMonthlyRate() {
        return 0;
    }

    public int getCommission(int summ) {
        return 0;
    }
}
