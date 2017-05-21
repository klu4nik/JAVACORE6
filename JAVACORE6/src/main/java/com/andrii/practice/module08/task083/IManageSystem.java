package main.java.com.andrii.practice.module08.task083;

import java.util.List;
import java.util.Set;

/**
 * Created by Klu4nik on 02/05/2017.
 */
public interface IManageSystem<T> {
    T save(T obj, double price);

    T save(T obj);

    void delete(T obj);

    void deleteById(long id);

    T get(long id);

    Double getPrice(T obj);

    Set<T> getProducts();

    List<Double> getPrices();
}
