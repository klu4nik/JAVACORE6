package main.java.com.andrii.practice.module07.task073;

import main.java.com.andrii.practice.module07.task071.Currency;
import main.java.com.andrii.practice.module07.task071.Order;
import main.java.com.andrii.practice.module07.task071.User;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by Unicsoft on 28/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        User[] user = new User[10];
        user[0] = new User(1, "Andrey", "Petrov", "Kiev", 1000);
        user[1] = new User(2, "Vladimir", "Klichko", "Kiev", 40000000);
        user[2] = new User(3, "Ivan", "Maydan", "Krakov", 26663);
        user[3] = new User(4, "Tom", "Soyer", "New York", 1);
        user[4] = new User(5, "Anna", "Bolein", "London", 1000000000);
        user[5] = new User(6, "Gekelberry", "Finn", "Chicago", 2678);
        user[6] = new User(7, "Taras", "Shevchenko", "Kiev", 100000);
        user[7] = new User(8, "Jim", "Kerry", "Paris", 45467);
        user[8] = new User(9, "Ozzy", "Osborn", "Dnepr", 20060);
        user[9] = new User(10, "Jane", "Air", "Lviv", 15);

        TreeSet<Order> orderSet = new TreeSet<Order>(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getShopIdentificator().compareTo(o2.getShopIdentificator()) == 0)
                    return (o1.getId() == o2.getId()) ? 0 : (o1.getId() == o2.getId()) ? 1 : -1;
                else
                    return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            }
        });

        orderSet.add(new Order(1, 5000, Currency.UAH, "iPhone5", "Rozetka", user[0]));
        orderSet.add(new Order(2, 200, Currency.USD, "Ken", "Rozetka", user[1]));
        orderSet.add(new Order(3, 300, Currency.UAH, "Barby", "Rozetka", user[2]));
        orderSet.add(new Order(4, 10, Currency.USD, "iPad air", "Rozetka", user[3]));
        orderSet.add(new Order(5, 10, Currency.UAH, "Moonlight", "Rozetka", user[4]));
        orderSet.add(new Order(6, 30, Currency.UAH, "Sun", "Rozetka", user[5]));
        orderSet.add(new Order(7, 100, Currency.USD, "Item", "Rozetka", user[6]));
        orderSet.add(new Order(8, 500, Currency.USD, "iPhone SE", "Rozetka", user[7]));
        orderSet.add(new Order(1, 5000, Currency.UAH, "iPhone5", "Rozetka", user[0]));
        orderSet.add(new Order(2, 200, Currency.USD, "Ken", "Rozetka", user[1]));

        System.out.println("==============Before sorting===============");
        SetOrderUtils.printTreeSet(orderSet);
        System.out.println("==============After sorting===============");
        SetOrderUtils.biggestPriceOrder(orderSet);

        System.out.println("==============After sorting===============");
        SetOrderUtils.deleteUSDOrders(orderSet,Currency.USD);
        SetOrderUtils.printTreeSet(orderSet);


    }
}
