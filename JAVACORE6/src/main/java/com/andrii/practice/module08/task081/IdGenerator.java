package main.java.com.andrii.practice.module08.task081;

/**
 * Created by Klu4nik on 02/05/2017.
 */
public final class IdGenerator {
    public static final long createId(String name, Country country, int expiration) {
        int id = name.hashCode();
        id = 31 * id + country.hashCode();
        id = 31 * id + expiration;
        return id;

    }
}
