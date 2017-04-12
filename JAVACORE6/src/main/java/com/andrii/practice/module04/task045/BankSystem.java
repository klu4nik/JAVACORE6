package main.java.com.andrii.practice.module04.task045;
import main.java.com.andrii.practice.module04.task044.User;

/**
 * Created by Klu4nik on 12/04/2017.
 */
public interface BankSystem {
    void withdrawOfUser(User user, int amount);
    void fundUser(User user, int amount);
    void transferMoney(User fromUser, User toUser, int amount);
    void paySalary(User user);
}
