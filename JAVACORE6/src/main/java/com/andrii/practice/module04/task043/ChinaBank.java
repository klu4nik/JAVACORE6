package main.java.com.andrii.practice.module04.task043;

import main.java.com.andrii.practice.module04.task042.Currency;
import main.java.com.andrii.practice.module04.task041.Bank;

/**
 * Created by Unicsoft on 27/03/2017.
 */
public class ChinaBank extends Bank {
    private static final int TRESHHOLD_USD_OR_EU_MONEY = 1000;
    private static final int LIMIT_WITHDRAWAL_FOR_USD = 100;
    private static final int LIMIT_WITHDRAWAL_FOR_EUR = 150;
    private static final int LIMIT_FUNDING_FOR_EUR = 5000;
    private static final int LIMIT_FUNDING_FOR_USD = 10000;
    private static final double MOUNTLY_RATE_FOR_USD = 0.01;
    private static final double MOUNTLY_RATE_FOR_EUR = 0;
    private static final double COMISSION_FOR_USD_LESS_1000 = 0.03;
    private static final double COMISSION_FOR_USD_MORE_1000 = 0.05;
    private static final double COMISSION_FOR_EUR_LESS_1000 = 0.10;
    private static final double COMISSION_FOR_EUR_MORE_1000 = 0.11;

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal() {
        if (this.getCurrency().equals(Currency.USD)) {
            return LIMIT_WITHDRAWAL_FOR_USD;
        } else if (this.getCurrency().equals(Currency.EUR)) {
            return LIMIT_WITHDRAWAL_FOR_EUR;
        } else {
            return 0;
        }
    }

    public int getLimitOfFunding() {
        if (this.getCurrency().equals(Currency.EUR)) {
            return LIMIT_FUNDING_FOR_EUR;
        } else if (this.getCurrency().equals(Currency.USD)){
            return LIMIT_FUNDING_FOR_USD;
        }
        return -1;

    }

    public double getMonthlyRate() {
        if (this.getCurrency().equals(Currency.USD)) {
            return MOUNTLY_RATE_FOR_USD;
        } else if (this.getCurrency().equals(Currency.EUR)) {
            return MOUNTLY_RATE_FOR_EUR;
        } else {
            return 0;
        }
    }

    public double getCommission(int summ) {
        if (this.getCurrency().equals(Currency.USD)) {
            if (summ< 1000){
                return COMISSION_FOR_USD_LESS_1000;
            } else{
                return COMISSION_FOR_USD_MORE_1000;
            }

        } else if(this.getCurrency().equals(Currency.EUR)){
            if (summ< 1000){
                return COMISSION_FOR_EUR_LESS_1000;
            } else{
                return COMISSION_FOR_EUR_MORE_1000;
            }
        }
        return 0.0;
    }
}
