package main.java.com.andrii.practice.module04.task043;

import main.java.com.andrii.practice.module04.task042.Currency;
import main.java.com.andrii.practice.module04.task043.Bank1;



/**
 * Created by Klu4nik on 25/03/2017.
 */

public class USbank extends Bank1 {
    private static final int TRESHHOLD_USD_OR_EU_MONEY = 1000;
    private static final int LIMIT_WITHDRAWAL_FOR_USD = 1000;
    private static final int LIMIT_WITHDRAWAL_FOR_EUR = 1200;
    private static final int LIMIT_FUNDING_FOR_EUR = 10000;
    private static final double MOUNTLY_RATE_FOR_USD = 0.01;
    private static final double MOUNTLY_RATE_FOR_EUR = 0.02;
    private static final double COMISSION_FOR_USD_LESS_1000 = 0.05;
    private static final double COMISSION_FOR_USD_MORE_1000 = 0.07;
    private static final double COMISSION_FOR_EUR_LESS_1000 = 0.06;
    private static final double COMISSION_FOR_EUR_MORE_1000 = 0.08;

    public USbank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
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
        return 0;
    }

}
