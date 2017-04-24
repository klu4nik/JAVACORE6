package main.java.com.andrii.practice.module05.task055;

import main.java.com.andrii.practice.module05.task051.Room;

/**
 * Created by Unicsoft on 24/04/2017.
 */

public interface DAO {
    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);
}
