package main.java.com.andrii.practice.module04.task046;

import main.java.com.andrii.practice.module04.task041.Bank;
import main.java.com.andrii.practice.module04.task042.Currency;
import main.java.com.andrii.practice.module04.task043.*;
import main.java.com.andrii.practice.module04.task044.User;
import main.java.com.andrii.practice.module04.task045.BankSystemImpl;

/**
 * Created by Klu4nik on 12/04/2017.
 */
public class Main {
    public static void main(String args[]){
        Bank uSBankUSD = new USbank(1, "USA", Currency.USD, 100, 1000.10, 10, 100000000);
        Bank uSBankEUR = new USbank(2, "USA", Currency.EUR, 200, 2000.20, 20, 100000000);

        Bank eUBankUSD = new EUBank(3, "UK", Currency.USD, 300, 3000.30, 30, 200000000);
        Bank eUBankEUR = new EUBank(4, "Belgium", Currency.EUR, 400, 4000.40, 40, 200000000);

        Bank chinaBankUSD = new ChinaBank(5, "China", Currency.USD, 500, 5000.50, 50, 300000000);
        Bank chinaBankEUR = new ChinaBank(6, "China", Currency.EUR, 600, 6000.60, 60, 300000000);

        User userUSBankUSD = new User(1, "USA USD", 15000.63, 7, "Google", 25000, uSBankUSD);
    }
}
