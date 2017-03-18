package main.java.com.andrii.practice.module02.task022;

/**
 * Created by Klu4nik on 13/02/2017.
 */
public class Withdrawal {
    public static final double COMISSION_FIVE_PERCENT = 0.05;

    public static void main(String[] args) {
        Withdrawal withdrawals = new Withdrawal();
        int balance = 100;
        int withdrawal1 = 10;
        withdrawals.moneysend(balance, withdrawal1);

        balance = 100;
        withdrawal1 = 99;

        withdrawals.moneysend(balance, withdrawal1);

    }

    /*
    Method gets balance and withdrawal and print a information about operation
     */
    public int moneysend(int balance, int withdrawal) {
        if (withdrawal * (1 + COMISSION_FIVE_PERCENT) < balance) {
            double comission = COMISSION_FIVE_PERCENT * withdrawal;
            balance -= (1 + COMISSION_FIVE_PERCENT) * withdrawal;
            System.out.println("Ok. Your payment" + withdrawal + " was succesfull. Comission: " + comission + " Current balance" + balance);
            return balance;
        } else {
            System.out.println("No. Payment was declined. You doesn't have enough money. Your balance:" + balance);
            return balance;
        }

    }
}
