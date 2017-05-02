package main.java.com.andrii.practice.module08.task084;

import main.java.com.andrii.practice.module08.task082.Food;
import main.java.com.andrii.practice.module08.task083.IManageSystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
    public void deleteById(int id) {

    }

    @Override
    public Object get(int id) {
        return null;
    }

    @Override
    public Double getPrice(Object obj) {
        return null;
    }

    @Override
    public Set getProducts() {
        return null;
    }

    @Override
    public List<Double> getPrices() {
        return null;
    }
}
