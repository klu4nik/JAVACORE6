package main.java.com.andrii.practice.module05.task057;

import main.java.com.andrii.practice.module05.task051.Room;
import main.java.com.andrii.practice.module05.task054.BookingComAPI;
import main.java.com.andrii.practice.module05.task056.Controller;

/**
 * Created by Unicsoft on 24/04/2017.
 */
public class Main {
    public static void main(String Args[]) {
        Controller controller = new Controller();
        BookingComAPI test = new BookingComAPI();
        roomArrayOutput(controller.requestRooms(780, 2, "Leotel", "Lviv"));
        roomArrayOutput(controller.requestRooms(600, 2, "Kmotel", "Kamianets Podilskiy"));
        roomArrayOutput(controller.requestRooms(700, 2, "Mir", "Kyiv"));

        System.out.println("Searching same  hotels  in Google api  and  Booking api");
        roomArrayOutput(controller.check(controller.apis[0], controller.apis[2]));

        System.out.println("Searching same  hotels  in TripAdvisor api  and  Booking api");
        roomArrayOutput(controller.check(controller.apis[1], controller.apis[2]));

        System.out.println("Searching same  hotels  in TripAdvisor api  and  Google api");
        roomArrayOutput(controller.check(controller.apis[1], controller.apis[0]));

    }

    public static void roomArrayOutput(Room[] rooms) {
        if (rooms.length >= 1) {
            for (Room roomElement : rooms)
                System.out.println(roomElement.toString());
        } else
            System.out.println("DB don't contain such hotel");
    }
}
