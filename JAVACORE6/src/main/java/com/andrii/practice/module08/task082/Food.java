package main.java.com.andrii.practice.module08.task082;

import main.java.com.andrii.practice.module08.task081.Country;
import main.java.com.andrii.practice.module08.task081.IdGenerator;

/**
 * Created by Klu4nik on 02/05/2017.
 */
public class Food {
    private long id;
    private String name;
    private Country country;
    private int expiration;

    public Food(String name, Country country, int expiration) {
        this.id = IdGenerator.createId(name, country, expiration);
        this.name = name;
        this.country = country;
        this.expiration = expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        if (id != food.id) return false;
        return country == food.country;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + country.hashCode();
        result = 31 * result + expiration;
        return result;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public int getExpiration() {
        return expiration;
    }

    @Override
    public String toString() {
        return "Food{" + "Id: " + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                ", expiration=" + expiration +
                '}';
    }
}
