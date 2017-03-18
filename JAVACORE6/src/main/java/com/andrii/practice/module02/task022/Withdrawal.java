package main.java.com.andrii.practice.module02.task022;

/**
 * Created by Klu4nik on 13/02/2017.
 */
public class Withdrawal {
    public static void main(String[] args){
        int balance = 100;
        int withdrawal = 10;
        moneysend(balance,withdrawal);

        balance=100;
        withdrawal=99;
        moneysend(balance,withdrawal);

    }
    /*
    Method gets balance and withdrawal and print a information about operation
     */
    private void moneysend(int balance, int withdrawal){
        if(withdrawal*1.05<balance){
            double comission=0.05*withdrawal;
            balance-=1.05*withdrawal;
            System.out.println("Ok " + comission + " " + balance );
            return true;
        } else {
            System.out.println("No");
            return false;
        }

    }
}
