package main.java.com.andrii.practice.module07.task074;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Klu4nik on 28/04/2017.
 */
public class Main {
    static final int SIZE_CONST_1 = 1000;
    static final int SIZE_CONST_2 = 10000;

    public static void main(String[] args) {
        //------------------------------Array lists 1000------------------------------
        ArrayList<Integer> listInt1000 = ListUtils.createListArrayInt(SIZE_CONST_1);
        System.out.println("------------------------------Array lists 1000------------------------------");
        System.out.println(ListUtils.getOperationExecutionTime(listInt1000, OperationType.GET, 600, ListType.INTEGER_ARRAY_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(listInt1000, OperationType.SET, 60, ListType.INTEGER_ARRAY_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(listInt1000, OperationType.ADD, 700, ListType.INTEGER_ARRAY_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(listInt1000, OperationType.DELETE, 900, ListType.INTEGER_ARRAY_LIST));
        System.out.println();

        ArrayList<String> listString1000 = ListUtils.createListArrayString(SIZE_CONST_1);

        System.out.println(ListUtils.getOperationExecutionTime(listString1000, OperationType.GET, 600, ListType.STRING_ARRAY_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(listString1000, OperationType.SET, 60, ListType.STRING_ARRAY_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(listString1000, OperationType.ADD, 700, ListType.STRING_ARRAY_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(listString1000, OperationType.DELETE, 900, ListType.STRING_ARRAY_LIST));

        System.out.println();

        //------------------------------Array lists 10000------------------------------

        ArrayList<String> listInt10000 = ListUtils.createListArrayString(SIZE_CONST_2);
        System.out.println("------------------------------Array lists 10000------------------------------");
        System.out.println(ListUtils.getOperationExecutionTime(listInt10000, OperationType.GET, 6000, ListType.INTEGER_ARRAY_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(listInt10000, OperationType.SET, 600, ListType.INTEGER_ARRAY_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(listInt10000, OperationType.ADD, 700, ListType.INTEGER_ARRAY_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(listInt10000, OperationType.DELETE, 900, ListType.INTEGER_ARRAY_LIST));
        System.out.println();

        ArrayList<String> listString10000 = ListUtils.createListArrayString(SIZE_CONST_2);
        System.out.println(ListUtils.getOperationExecutionTime(listString10000, OperationType.GET, 6000, ListType.STRING_ARRAY_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(listString10000, OperationType.SET, 600, ListType.STRING_ARRAY_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(listString10000, OperationType.ADD, 700, ListType.STRING_ARRAY_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(listString10000, OperationType.DELETE, 900, ListType.STRING_ARRAY_LIST));

        //------------------------------Linked lists 1000------------------------------

        LinkedList<Integer> linkedListInt1000 = ListUtils.createLinkedListInt(SIZE_CONST_1);
        System.out.println("------------------------------Linked lists 1000------------------------------");
        System.out.println(ListUtils.getOperationExecutionTime(linkedListInt1000, OperationType.GET, 600, ListType.INTEGER_LINKED_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(linkedListInt1000, OperationType.SET, 60, ListType.INTEGER_LINKED_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(linkedListInt1000, OperationType.ADD, 700, ListType.INTEGER_LINKED_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(linkedListInt1000, OperationType.DELETE, 900, ListType.INTEGER_LINKED_LIST));
        System.out.println();

        LinkedList<String> linkedListString1000 = ListUtils.createLinkedListString(SIZE_CONST_1);

        System.out.println(ListUtils.getOperationExecutionTime(linkedListString1000, OperationType.GET, 600, ListType.STRING_LINKED_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(linkedListString1000, OperationType.SET, 60, ListType.STRING_LINKED_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(linkedListString1000, OperationType.ADD, 700, ListType.STRING_LINKED_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(linkedListString1000, OperationType.DELETE, 900, ListType.STRING_LINKED_LIST));

        //------------------------------Linked lists 10000------------------------------

        LinkedList<Integer> linkedListInt10000 = ListUtils.createLinkedListInt(SIZE_CONST_2);
        System.out.println("------------------------------Linked lists 1000------------------------------");
        System.out.println(ListUtils.getOperationExecutionTime(linkedListInt10000, OperationType.GET, 600, ListType.INTEGER_LINKED_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(linkedListInt1000, OperationType.SET, 60, ListType.INTEGER_LINKED_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(linkedListInt1000, OperationType.ADD, 700, ListType.INTEGER_LINKED_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(linkedListInt1000, OperationType.DELETE, 900, ListType.INTEGER_LINKED_LIST));
        System.out.println();

        LinkedList<String> linkedListString10000 = ListUtils.createLinkedListString(SIZE_CONST_2);

        System.out.println(ListUtils.getOperationExecutionTime(linkedListString10000, OperationType.GET, 600, ListType.STRING_LINKED_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(linkedListString10000, OperationType.SET, 60, ListType.STRING_LINKED_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(linkedListString10000, OperationType.ADD, 700, ListType.STRING_LINKED_LIST));
        System.out.println(ListUtils.getOperationExecutionTime(linkedListString10000, OperationType.DELETE, 900, ListType.STRING_LINKED_LIST));

    }
}

