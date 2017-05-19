package main.java.com.andrii.practice.module08.task085;

import main.java.com.andrii.practice.module08.task081.Country;
import main.java.com.andrii.practice.module08.task082.Food;
import main.java.com.andrii.practice.module08.task083.IManageSystem;
import main.java.com.andrii.practice.module08.task084.IManageSystemImpl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Unicsoft on 19/05/2017.
 */
public class Main {
    private static IManageSystemImpl manageSystem = new IManageSystemImpl();

    public static void main(String[] args) {

        manageSystem.save(new Food("Borsch", Country.UKRAINE, 35), 35);
        manageSystem.save(new Food("Kompot", Country.UKRAINE, 45), 45);
        manageSystem.save(new Food("Tea", Country.AUSTRIA, 25), 25);
        manageSystem.save(new Food("Cofee", Country.UKRAINE, 25), 25);
        manageSystem.save(new Food("Ice-cream", Country.UKRAINE, 25), 25);
        //Printing of list of food
        Set<Food> listFood = manageSystem.getProducts();
        System.out.println(chooseIdFrom(listFood));



    }

    public static long chooseIdFrom(Set<Food> food) {
        System.out.println("Choose dish which you want to modify");

        ArrayList<Food> foodArrayList = new ArrayList<>();
        for (Food dish : food) {
            foodArrayList.add(dish);
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
                    } else return 0;
                } catch (Exception e) {
                }
            } while (number == -1);
        }
        return foodArrayList.get(number).getId();

    }


}