package main.java.com.andrii.practice.module07.task074;

import java.util.ArrayList;
import java.util.LinkedList;

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

    public static final LinkedList<String> createLinkedListString(int size) {
        LinkedList<String> list = new LinkedList<String>();
        for (int i = 0; i < size; i++) {
            list.add("Test");
        }
        return list;
    }

    public static final LinkedList<Integer> createLinkedListInt(int size) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        return list;
    }

    public static final long getOperationExecutionTime(ArrayList list, OperationType operationType, int position, ListType listType) {
        final long startTime = System.nanoTime();
        switch (operationType) {
            case DELETE:
                list.remove(position);
                break;
            case GET:
                list.get(position);
                break;
            case ADD:
                if (listType == ListType.STRING_LIST)
                    list.add("Updated");
                if (listType == ListType.INTEGER_LIST)
                    list.add(-1);
                break;
            case SET:
                if (listType == ListType.STRING_LIST)
                    list.set(position, "Updated");
                if (listType == ListType.INTEGER_LIST)
                    list.set(position, -1);
        }
        final long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
