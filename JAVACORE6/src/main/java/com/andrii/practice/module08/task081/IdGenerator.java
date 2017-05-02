package main.java.com.andrii.practice.module08.task081;

/**
 * Created by Klu4nik on 02/05/2017.
 */
public final class IdGenerator {
    public static final long createId(String country) {
        int result = country.hashCode();
        result = 31 * result;

        return result;

    }
}
