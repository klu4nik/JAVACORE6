package main.java.com.andrii.practice.module05.task055;

import main.java.com.andrii.practice.module05.task051.Room;

/**
 * Created by Unicsoft on 24/04/2017.
 */
public class RoomDAO implements DAO {
    Room[] roomDB = new Room[10];

    public RoomDAO() {
        roomDB[0] = new Room(1, 880, 2, "Dakh", "Lviv");
        roomDB[1] = new Room(2, 600, 2, "Kmotel", "Kamianets Podilskiy");
        roomDB[2] = new Room(3, 700, 2, "Obolon", "Kyiv");
        roomDB[3] = new Room(4, 500, 3, "Druzi", "Kyiv");
        roomDB[4] = new Room(5, 700, 1, "Pilipets", "Pilipets");
    }

    public Room save(Room room) {
        int numberOfFreeElement = getFreeElementNumber(roomDB);
        if (numberOfFreeElement != -1) {
            roomDB[numberOfFreeElement] = room;
            System.out.println("New " + room.toString() + " was added to DB.");
            return roomDB[numberOfFreeElement];
        } else {
            System.out.println("It's impossible to add  new room to DB. No free space left.");
            return room;
        }


    }


    public boolean delete(Room room) {
        for (int i = 0; i < roomDB.length; i++) {
            if (room.equals(roomDB[i])) {
                System.arraycopy(roomDB, i + 1, roomDB, i, roomDB.length - i - 1);
                roomDB[roomDB.length - 1] = null;
                System.out.println(room.toString() + " was deleted from DB.");
                return true;
            }


        }
        System.out.println(room.toString() + " is not find  in DB.");
        return false;
    }

    public Room update(Room room) {
        for (Room roomsInDB : roomDB) {
            if (roomsInDB.getId() == room.getId()) {
                roomsInDB.setCityName(room.getCityName());
                roomsInDB.setHotelName(room.getHotelName());
                roomsInDB.setPersons(room.getPersons());
                roomsInDB.setPrice(room.getPrice());
                System.out.println(roomsInDB.toString() + " was updated in DB");
                return roomsInDB;


            }

        }
        return null;
    }

    public Room findById(long id) {
        for (Room rooms : roomDB) {
            if (rooms.getId() == id) return rooms;
        }
        return null;
    }

    private int getFreeElementNumber(Room[] roomDB) {

        int freeElementNumber = -1;
        for (int i = 0; i < roomDB.length; i++) {
            if (roomDB[i] == null) {
                freeElementNumber = i;
                break;
            }
        }
        return freeElementNumber;
    }
}
