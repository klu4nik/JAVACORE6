package main.java.com.andrii.practice.module05.task053;

import main.java.com.andrii.practice.module05.task051.Room;

/**
 * Created by Klu4nik on 23/04/2017.
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getRooms();
}
