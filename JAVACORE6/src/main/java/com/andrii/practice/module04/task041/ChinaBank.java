package main.java.com.andrii.practice.module04.task041;
import main.java.com.andrii.practice.module04.task042.Currency;



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

        return 0;
    }

    public double getMonthlyRate() {
        return 0;
    }

    public double getCommission(int summ) {

        return 0;
    }
}
