package main.java.com.andrii.practice.module06.task063;

import main.java.com.andrii.practice.module06.task062.User;

import java.util.Arrays;

/**
 * Created by Unicsoft on 26/04/2017.
 */
public class UserMain {
    public static void main(String[] args) {
        User[] users = new User[5];
        users[0] = new User(1,"Andrey","Savchuk", 10000,12000);
        users[1] = new User(2,"Bob","Marly", 13000,11000);
        users[2] = new User(3,"Stiv","Jobs", 10000000,1200000000);
        users[3] = new User(3,"Stiv","Jobs", 10000000,1200000000);
        print(UserUtils.getUsersId(users),"User ids: ");
        UserUtils.printUsersArray(UserUtils.deleteEmptyUsers(users));
        UserUtils.printUsersArray(UserUtils.deleteEmptyUsers(users));
        UserUtils.printUsersArray(UserUtils.uniqueUsers(users));
    }
    public static void print(long[] array, String text) {
        System.out.println(text + Arrays.toString(array));
    }
}
