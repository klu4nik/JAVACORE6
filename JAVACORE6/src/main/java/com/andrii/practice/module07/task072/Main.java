package main.java.com.andrii.practice.module07.task072;

import main.java.com.andrii.practice.module07.task071.Currency;
import main.java.com.andrii.practice.module07.task071.Order;
import main.java.com.andrii.practice.module07.task071.User;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Unicsoft on 28/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        User[] user = new User[10];
        user[0] = new User(1, "Andrey", "Savchuk", "Kiev", 1000);
        user[1] = new User(2, "Vladimir", "Klichko", "Kiev", 40000000);
        user[2] = new User(3, "Ivan", "Maydan", "Krakov", 26663);
        user[3] = new User(4, "Tom", "Soyer", "New York", 1);
        user[4] = new User(5, "Anna", "Bolein", "London", 1000000000);
        user[5] = new User(6, "Gekelberry", "Finn", "Chicago", 2678);
        user[6] = new User(7, "Taras", "Shevchenko", "Kiev", 100000);
        user[7] = new User(8, "Jim", "Kerry", "Paris", 45467);
        user[8] = new User(9, "Ozzy", "Osborn", "Dnepr", 20060);
        user[9] = new User(10, "Jane", "Air", "Lviv", 15);

        List<Order> orderList = new LinkedList<Order>();
        orderList.add(new Order(1, 5000, Currency.UAH, "iPhone5", "Rozetka", user[0]));
        orderList.add(new Order(1, 200, Currency.USD, "Ken", "Rozetka", user[1]));
        orderList.add(new Order(1, 300, Currency.UAH, "Barby", "Rozetka", user[2]));
        orderList.add(new Order(1, 10, Currency.USD, "iPad air", "Rozetka", user[3]));
        orderList.add(new Order(1, 10, Currency.UAH, "Moonlight", "Rozetka", user[4]));
        orderList.add(new Order(1, 30, Currency.UAH, "Sun", "Rozetka", user[5]));
        orderList.add(new Order(1, 100, Currency.USD, "Item", "Rozetka", user[6]));
        orderList.add(new Order(1, 500, Currency.USD, "iPhone SE", "Rozetka", user[7]));
        orderList.add(new Order(1, 600, Currency.UAH, "Book", "Rozetka", user[8]));
        orderList.add(new Order(1, 400, Currency.UAH, "Case", "Rozetka", user[9]));


        Comparator<Order> priceCompareDesc = new Comparator<Order>() {

            @Override
            public int compare(Order ord1, Order ord2) {
                if (ord1.getPrice() == ord2.getPrice())
                    return 0;
                else
                    return (ord1.getPrice() > ord2.getPrice() ? 1 : -1);
            }
        };

        Comparator<Order> priceCompareAscAndCity = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getPrice() == o2.getPrice()) {
                    return (o1.getUser().getCity().compareTo(o2.getUser().getCity()));
                } else {
                    return (o1.getPrice() > o2.getPrice() ? 1 : -1);
                }
            }
        };
        Comparator<Order> nameIDCity = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getItemName().compareTo(o2.getItemName()) == 0) {
                    if (o1.getShopIdentificator().compareTo(o2.getShopIdentificator()) == 0) {
                        return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                    } else {
                        return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                    }

                } else {
                    return o1.getItemName().compareTo(o2.getItemName());

                }
            }
        };


        System.out.println("==========================================List sorted by price  an city==========================================");
        Collections.sort(orderList, priceCompareAscAndCity);
        for (Order order : orderList) {
            System.out.println(order.toString());

        }

        System.out.println("==========================================List sorted by price ==========================================");
        Collections.sort(orderList, priceCompareDesc);
        for (Order order : orderList) {
            System.out.println(order.toString());

        }

        System.out.println("==========================================List sorted by name==========================================");
        Collections.sort(orderList, nameIDCity);
        for (Order order : orderList) {
            System.out.println(order.toString());

        }


    }
}
