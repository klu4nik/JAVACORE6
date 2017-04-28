package main.java.com.andrii.practice.module07.task073;

import main.java.com.andrii.practice.module07.task071.Currency;
import main.java.com.andrii.practice.module07.task071.Order;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Unicsoft on 28/04/2017.
 */
public final class SetOrderUtils {
    public static void findUserInTreeSet(TreeSet setOrders, String userName) {
        for (Object orderO : setOrders
                ) {
            Order order = (Order) orderO;
            if (order.getUser().getLastName().equals(userName)) {
                System.out.println("Treeset contains order with");
                for (Object orderPrintO : setOrders
                        ) {
                    Order orderPrint = (Order) orderPrintO;
                    if (orderPrint.getUser().getLastName().equals(userName)) {
                        System.out.println(orderPrint.toString());
                    }
                }
                break;
            }
        }

    }

    public static void biggestPriceOrder(TreeSet ordersSet) {
        TreeSet<Order> orderTreeSet = new TreeSet<Order>(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return (o1.getPrice() == o2.getPrice()) ? 0 : (o1.getPrice() > o2.getPrice()) ? 1 : -1;
            }
        });

        orderTreeSet.addAll(ordersSet);
        System.out.println(orderTreeSet.last().toString());
    }

    public static void printTreeSet(TreeSet ordersSet) {
        for (Object order : ordersSet
                ) {

            System.out.println(order);
        }
    }

    public static void deleteUSDOrders(TreeSet<Order> setOrders, Currency currency) {
        Iterator<Order> iterator = setOrders.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getCurrency() == currency) {
                iterator.remove();
            }
        }

    }
}
