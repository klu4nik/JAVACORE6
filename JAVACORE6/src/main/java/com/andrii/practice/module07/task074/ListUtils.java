package main.java.com.andrii.practice.module07.task074;

import java.util.ArrayList;

/**
 * Created by Klu4nik on 28/04/2017.
 */
public class ListUtils {
    public static final ArrayList<String> createListArrayString(int size) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < size; i++) {
            list.add("Test");
        }
        return list;
    }

    public static final ArrayList<Integer> createListArrayInt(int size) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        return list;
    }
}
