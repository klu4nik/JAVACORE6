package main.java.com.andrii.practice.module04.task045;

import main.java.com.andrii.practice.module04.task041.Bank;
import main.java.com.andrii.practice.module04.task044.User;

/**
 * Created by Klu4nik on 12/04/2017.
 */
public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        if (amount > user.getBank().getLimitOfWithdrawal()) {
            System.out.println("Amount " + amount + " " + user.getBank().getCurrency()
                    + "is exceed the withdrawal limit: " + user.getBank().getLimitOfWithdrawal()
                    + " " + user.getBank().getCurrency());
        } else if (amount + amount * user.getBank().getCommission(amount) <= user.getBalance()) {
            user.setBalance(user.getBalance() - (amount + amount * user.getBank().getCommission(amount)));
            System.out.println("User: " + user.getName() + " gets cash " + amount + " " + user.getBank().getCurrency()
                    + " with commission: " + user.getBank().getCommission(amount) + " " + user.getBank().getCurrency());
            System.out.println("Balance: " + user.getBalance());
        } else if (amount + amount * user.getBank().getCommission(amount) > user.getBalance()) {
            System.out.println("User: " + user.getName() + "doesn't have enough money on his balance to make this withdrawal");

        }
        System.out.println("_______________________________________________________________________________________________________");
    }

    @Override
    public void fundUser(User user, int amount) {
        if (amount >= 0) {
            if (amount > user.getBank().getLimitOfFunding()) {
                System.out.println("Amount " + amount + " is exceed the funding limit: " + user.getBank().getLimitOfFunding());
            } else {
                user.setBalance(user.getBalance() + amount);
                System.out.println("User: " + user.getName() + " fund amount " + amount + " " + user.getBank().getCurrency());
                System.out.println("Balance: " + user.getBalance() + " " + user.getBank().getCurrency());
            }
        } else {
            System.out.println("Error of funding for user " + user.getName() + " . Amount is negative.");
        }
        System.out.println("_______________________________________________________________________________________________________");
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (fromUser.getBank().getCurrency().equals(toUser.getBank().getCurrency())) {
            if (amount < 0) {
                System.out.println("It's impossible to make negative transactions");
            } else if (fromUser.getId() == toUser.getId()) {
                System.out.println("It's impossible to send  money between same users");
            } else if (amount > fromUser.getBank().getLimitOfWithdrawal()) {
                System.out.println("Amount " + amount + " is exceed the withdrawal limit: " + fromUser.getBank().getLimitOfWithdrawal());
            } else if (amount > toUser.getBank().getLimitOfFunding()) {
                System.out.println("Amount " + amount + " is exceed the funding limit: " + fromUser.getBank().getLimitOfFunding());
            } else if (amount + amount * fromUser.getBank().getCommission(amount) <= fromUser.getBalance()) {
                fromUser.setBalance(fromUser.getBalance() - amount);
                toUser.setBalance(toUser.getBalance() + amount);
                System.out.println("User: " + fromUser.getName() + " send  money  to " + toUser.getName());
                System.out.println("Total amount is " + amount + " " + fromUser.getBank().getCurrency());
                System.out.println("Balance of sender: " + fromUser.getBalance() + " " + fromUser.getBank().getCurrency());
                System.out.println("Balance of getter: " + toUser.getBalance() + " " + toUser.getBank().getCurrency());
            } else {
                System.out.println("User: " + fromUser.getName() + " doesn't have enough money on his balance to make this withdrawal");
            }
        } else {
            System.out.println("Currencies are different. Transaction is impossible");
        }

        System.out.println("_______________________________________________________________________________________________________");

    }


    @Override
    public void paySalary(User user) {
        System.out.println("User " + user.getName() + ": balance = " + user.getBalance() + " " + user.getBank().getCurrency());
        System.out.println("Paying " + user.getSalary() + " " + user.getBank().getCurrency() + " of salary to user " + user.getName());
        user.setBalance(user.getBalance() + user.getSalary());
        System.out.println("User " + user.getName() + ": balance = " + user.getBalance() + " " + user.getBank().getCurrency());
        System.out.println("_______________________________________________________________________________________________________");


    }

}

