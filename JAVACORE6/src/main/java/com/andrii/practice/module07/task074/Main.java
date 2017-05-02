package main.java.com.andrii.practice.module07.task074;

import java.util.ArrayList;

/**
 * Created by Klu4nik on 28/04/2017.
 */
public class Main {
    static final int SIZE_CONST_1 = 1000;
    static final int SIZE_CONST_2 = 10000;
    public static void main(String[] args) {
        ArrayList<String> list = ListUtils.createListArrayString(SIZE_CONST_1);
        System.out.println(ListUtils.getOperationExecutionTime(list,OperationType.GET, 600,ListType.INTEGER_LIST));

    }
}
