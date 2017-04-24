package main.java.com.andrii.practice.module05.task056;

import main.java.com.andrii.practice.module05.task051.Room;
import main.java.com.andrii.practice.module05.task053.API;
import main.java.com.andrii.practice.module05.task054.BookingComAPI;
import main.java.com.andrii.practice.module05.task054.GoogleAPI;
import main.java.com.andrii.practice.module05.task054.TripAdvisorAPI;
import main.java.com.andrii.practice.module05.task055.RoomDAO;

import java.util.ArrayList;

/**
 * Created by Unicsoft on 24/04/2017.
 */
public class Controller {
    public API apis[] = new API[3];
     public Controller(){
         apis[0] = new GoogleAPI();
         apis[1] = new BookingComAPI();
         apis[2] = new TripAdvisorAPI();
     }

     public Room[] requestRooms(int price, int persons, String city, String hotel){
         ArrayList<Room> roomsRequestList = new ArrayList<Room>();
         for (API api : apis){
             for(Room roomInAPi : api.findRooms(price,persons,city, hotel)){
                 roomsRequestList.add(roomInAPi);
             }

         }
         return roomsRequestList.toArray(new Room[roomsRequestList.size()]);
     }

     public Room[] check(API api1, API api2){
         ArrayList<Room> roomsEqualsInAPIs = new ArrayList<Room>();
         Room[] roomsApi1 = api1.getDB();
         Room[] roomsApi2 = api2.getDB();
         int countRooms = 0;
         for(Room api1Room : roomsApi1){
             for(Room api2Room: roomsApi2){
                 if (api1Room.equals(api2Room)) {
                     countRooms += 1;
                     roomsEqualsInAPIs.add(api1Room);
                 }
             }
         }
         return roomsEqualsInAPIs.toArray(new Room[roomsEqualsInAPIs.size()]);
     }

}
