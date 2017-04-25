package main.java.com.andrii.practice.module05.task057;

import main.java.com.andrii.practice.module05.task051.Room;
import main.java.com.andrii.practice.module05.task056.Controller;

/**
 * Created by Unicsoft on 24/04/2017.
 */
public class Main {
    public static void main(String Args[]){
        Controller controller = new Controller();
        roomArrayOutput(controller.requestRooms(780, 2, "Leotel", "Lviv"));
        roomArrayOutput(controller.requestRooms(600, 2, "Kmotel", "Kamianets Podilskiy"));
    }

    public static void roomArrayOutput(Room[] rooms) {
        if (rooms.length >= 1) {
            for (Room roomElement : rooms)
                System.out.println(roomElement.toString());
        } else
            System.out.println("DB don't contain such hotel");
    }
}
