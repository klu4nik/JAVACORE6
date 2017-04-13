package main.java.com.andrii.practice.module04.task046;

import main.java.com.andrii.practice.module04.task041.Bank;
import main.java.com.andrii.practice.module04.task042.Currency;
import main.java.com.andrii.practice.module04.task043.*;
import main.java.com.andrii.practice.module04.task044.User;
import main.java.com.andrii.practice.module04.task045.BankSystem;
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

        User userUSBankUSD = new User(1, "USA USD", 15000.63, 7, "Google", 15000, uSBankUSD);
        User userUSBankEUR = new User(2, "USA EUR", 10000.63, 1, "Pontiac", 20000, uSBankEUR);
        User userEUBankUSD = new User(3, "EU USD", 25000.63, 2, "Umbrella", 35000, eUBankUSD);
        User userEUBankEUR = new User(4, "EU EUR", 20000.63, 4, "Google", 30000, eUBankEUR);
        User userChinaBankUSD = new User(5, "China USD", 35000, 5, "Google", 35000, chinaBankUSD);
        User userChinaBankEUR = new User(6, "China EUR", 30000, 36, "Google Asia", 40000, chinaBankEUR);

        BankSystemImpl bankSystem = new BankSystemImpl();

        bankSystem.paySalary(userUSBankEUR);
        bankSystem.fundUser(userUSBankUSD, 100);
        bankSystem.transferMoney(userChinaBankEUR, userChinaBankEUR, 10);
        bankSystem.transferMoney(userEUBankUSD, userChinaBankEUR, 100);
        bankSystem.transferMoney(userChinaBankEUR, userEUBankEUR, 1500);
        bankSystem.transferMoney(userChinaBankEUR, userEUBankEUR, 150);



    }
}
