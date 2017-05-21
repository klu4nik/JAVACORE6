package main.java.com.andrii.practice.module08.task084;

import main.java.com.andrii.practice.module08.task082.Food;
import main.java.com.andrii.practice.module08.task083.IManageSystem;

import java.util.*;

/**
 * Created by Klu4nik on 02/05/2017.
 */
public class IManageSystemImpl implements IManageSystem {
    private Map<Food, Double> database = new HashMap<>();

    @Override
    public Food save(Object obj, double price) {
        Food food = (Food) obj;
        this.database.put(food, price);
        System.out.println(obj.toString() + " was added to the database");
        return (Food) obj;
    }

    @Override
    public Food save(Object obj) {
        Food food = (Food) obj;
        this.database.put(food, null);
        System.out.println(obj.toString() + " was added to the database");
        return (Food) obj;
    }

    @Override
    public void delete(Object obj) {
        Food food = (Food) obj;
        this.database.remove(obj);
        System.out.println(obj.toString() + " was removed");

    }

    @Override
    public void deleteById(long id) {
        for (Map.Entry<Food, Double> databaseItem : this.database.entrySet()) {
            if (databaseItem.getKey().getId() == id) {
                this.database.remove(databaseItem.getKey());
                System.out.println("Item " + databaseItem.getKey().toString() + "with id" + id + " was delete from database");
                break;
            }
        }

    }

    @Override
    public Object get(long id) {
        for (Map.Entry<Food, Double> databaseItem : this.database.entrySet()) {
            if (databaseItem.getKey() != null && databaseItem.getKey().getId() == id) {
                System.out.println("Item with id " + id + " found in database");
                return databaseItem.getKey();
            }
        }
        return null;
    }

    @Override
    public Double getPrice(Object obj) {
        Food foodObj = (Food) obj;
        if (this.database.containsKey(obj)) {
            System.out.println();
            return this.database.get(obj);
        } else {
            System.out.println("Item didn't find");
            return null;
        }

    }

    @Override
    public Set getProducts() {
        return this.database.keySet();
    }

    @Override
    public List<Double> getPrices() {
        List<Double> priceList = new ArrayList();
        for (Map.Entry<Food, Double> databaseItem : this.database.entrySet()) {
            priceList.add(databaseItem.getValue());
        }
        return priceList;
    }


}
