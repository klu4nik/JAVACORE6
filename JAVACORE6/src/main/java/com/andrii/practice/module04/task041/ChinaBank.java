package main.java.com.andrii.practice.module04.task041;

/**
 * Created by Unicsoft on 27/03/2017.
 */
public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal() {
        return 0;
    }

    public int getLimitOfFunding() {
        return o;
    }

    public double getMonthlyRate() {
        return 0;
    }

    public int getCommission(int summ) {
        return 0;
    }
}
