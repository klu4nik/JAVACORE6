package main.java.com.andrii.practice.module06.task063;

import main.java.com.andrii.practice.module06.task062.User;

import java.util.ArrayList;

/**
 * Created by Unicsoft on 26/04/2017.
 */
public final class UserUtils {
    public static User[] uniqueUsers(User[] users) {
        ArrayList<User> uniqueUsers = new ArrayList<User>();
        boolean state = true;
        for (User user : users) {
            for (User userTemp : users) {
                if (userTemp.equals(user)) {
                    state = false;
                    break;
                }
            }
            if (state) {
                uniqueUsers.add(user);
            }
            state = true;
        }
        return uniqueUsers.toArray(new User[uniqueUsers.size()]);
    }

    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        ArrayList<User> uniqueUsers = new ArrayList<User>();
        for (User tempUsers : users) {
            if (tempUsers.getBalance() == balance) {
                uniqueUsers.add(tempUsers);
            }
        }
        return uniqueUsers.toArray(new User[uniqueUsers.size()]);
    }

    public static final User[] paySalaryToUsers(User[] users) {
        ArrayList<User> usersGettingSalary = new ArrayList<User>();
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                usersGettingSalary.add(new User(users[i].getId(),
                        users[i].getFirstName(), users[i].getLastName(),
                        users[i].getSalary(),
                        users[i].getBalance() + users[i].getSalary()));
            }
        }
        return usersGettingSalary.toArray(new User[usersGettingSalary.size()]);
    }

    public static final long[] getUsersId(User[] users) {
        long[] idArray = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            idArray[i] = users[i].getId();
        }
        return idArray;
    }

    public static User[] deleteEmptyUsers(User[] users) {
        ArrayList<User> notEmptyUser = new ArrayList<User>();
        for (User tempUser : users) {
            if (tempUser != null) {
                notEmptyUser.add(tempUser);
            }
        }
        return notEmptyUser.toArray(new User[notEmptyUser.size()]);
    }
}



