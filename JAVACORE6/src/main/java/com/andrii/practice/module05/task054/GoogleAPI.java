package main.java.com.andrii.practice.module05.task054;

import main.java.com.andrii.practice.module05.task051.Room;

import java.util.ArrayList;

/**
 * Created by Unicsoft on 24/04/2017.
 */
public class GoogleAPI {
    private Room rooms[] = new Room[5];

    public GoogleAPI() {
        rooms[0] = new Room(1, 780, 2, "Leotel", "Lviv");
        rooms[1] = new Room(2, 600, 2, "Grand canyon", "Kamianets Podilskiy");
        rooms[2] = new Room(3, 700, 2, "Golosiyv", "Kyiv");
        rooms[3] = new Room(4, 500, 3, "Druzi Hostel", "Kyiv");
        rooms[4] = new Room(5, 700, 1, "Grand Pilipets", "Pilipets");
    }


    public Room[] findRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> findRoomsList = new ArrayList<Room>();

        for (Room room : rooms) {
            if ((room.getPrice() == price)
                    && (room.getPersons() == persons)
                    && (room.getCityName().equals(city))
                    && (room.getHotelName().equals(hotel))) {
                findRoomsList.add(room);
            }

        }
        return findRoomsList.toArray(new Room[findRoomsList.size()]);
    }

    public Room[] getDB() {
        return rooms;
    }
}
