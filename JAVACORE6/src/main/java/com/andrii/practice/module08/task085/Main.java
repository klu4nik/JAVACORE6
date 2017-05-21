package main.java.com.andrii.practice.module08.task085;

import main.java.com.andrii.practice.module08.task081.Country;
import main.java.com.andrii.practice.module08.task082.Food;
import main.java.com.andrii.practice.module08.task084.IManageSystemImpl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Set;

/**
 * Created by Unicsoft on 19/05/2017.
 */
public class Main {
    private static IManageSystemImpl manageSystem = new IManageSystemImpl();

    public static void main(String[] args) {

        manageSystem.save(new Food("Borsch", Country.UKRAINE, 15), 35);
        manageSystem.save(new Food("Kompot", Country.UKRAINE, 25), 45);
        manageSystem.save(new Food("Tea", Country.AUSTRIA, 5), 25);
        manageSystem.save(new Food("Cofee", Country.UKRAINE, 5), 25);
        manageSystem.save(new Food("Ice-cream", Country.UKRAINE, 5), 25);

        for (Object foodList : manageSystem.getProducts()
                ) {
            System.out.println(((Food) foodList).toString());

        }
        System.out.println("\nDelete element from list");
        manageSystem.deleteById(chooseFoodItemFromSet(manageSystem.getProducts()).getId());
        System.out.println("\nList after deleting");
        for (Object foodList : manageSystem.getProducts()
                ) {
            System.out.println(((Food) foodList).toString());

        }
        System.out.println("\n Get prices");

        for (Double priceItem : manageSystem.getPrices()
                ) {
            System.out.println(priceItem);
        }

        System.out.println("\nGet price for item:\n"
                + manageSystem.getPrice(chooseFoodItemFromSet(manageSystem.getProducts())));

        System.out.println("\nGet item by id\n"
                + manageSystem.get(chooseFoodItemFromSet(manageSystem.getProducts()).getId()));

        System.out.println("\nGet prices:\n");
        for (Double priceItem : manageSystem.getPrices()
                ) {
            System.out.println(priceItem);

        }

        System.out.println("\nDelete item from database:\n");
        manageSystem.delete(chooseFoodItemFromSet(manageSystem.getProducts()));

        System.out.println("\nList after deleting");
        for (Object foodList : manageSystem.getProducts()
                ) {
            System.out.println(((Food) foodList).toString());

        }




    }

    public static Food chooseFoodItemFromSet(Set<Food> food) {
        System.out.println("Choose dish which you want to modify");

        ArrayList<Food> foodArrayList = new ArrayList<Food>();
        for (Food dish : food) {
            foodArrayList.add(new Food(dish.getName(), dish.getCountry(), dish.getExpiration()));
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = -1;
        if (foodArrayList.size() > 0) {
            do {
                for (int i = 0; i < foodArrayList.size(); i++) {
                    System.out.println(i + " " + foodArrayList.get(i).toString());
                }
                System.out.println("");
                try {
                    String choice = reader.readLine();
                    if (choice != "q") {
                        number = Integer.parseInt(choice);
                        if (number < 0) {
                            number = -1;
                        }
                    } else return null;
                } catch (Exception e) {
                }
            } while (number == -1);
        }
        System.out.println(foodArrayList.get(number));
        return foodArrayList.get(number);

    }


}