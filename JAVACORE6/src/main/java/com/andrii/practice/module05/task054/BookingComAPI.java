package main.java.com.andrii.practice.module05.task054;

import main.java.com.andrii.practice.module05.task051.Room;
import main.java.com.andrii.practice.module05.task053.API;


/**
 * Created by Klu4nik on 23/04/2017.
 */
public class BookingComAPI implements API {
    Room rooms[] = new Room[5];

    public BookingComAPI() {
        rooms[0] = new Room(1, 780, 2, "Leotel", "Lviv");
        rooms[1] = new Room(2, 1000, 1, "Big Wall", "Dnipro");
        rooms[2] = new Room(3, 750, 3, "Hostel Factory", "Kiev");
        rooms[3] = new Room(4, 500, 4, "Budha Hostel", "Kiev");
        rooms[4] = new Room(5, 500, 5, "Friends Hostel", "Zaporizhya");
    }


    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }

    public Room[] getDB() {
        return new Room[0];
    }
}
