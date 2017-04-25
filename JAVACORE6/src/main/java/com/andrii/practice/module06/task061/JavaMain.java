package main.java.com.andrii.practice.module06.task061;

import java.util.Arrays;

/**
 * Created by Klu4nik on 25/04/2017.
 */
public class JavaMain {

    public static void main(String[] args) {
        int[] testArray = {1, 12, 15, 12, 18, -2, -3, 10};
        print(ArraysUtils.sum(testArray), "The sum of array = ");
        print(ArraysUtils.max(testArray), "Max of array = ");
        print(ArraysUtils.min(testArray), "Min of array = ");
        print(ArraysUtils.maxPositive(testArray), "Max positive element  in  array = ");
        print(ArraysUtils.reverse(testArray), "Reversed Array: ");
        print(ArraysUtils.multiplication(testArray), "The result of multiplication = ");
        print(ArraysUtils.findEvenElements(testArray), "Even elements: ");
        print(ArraysUtils.secondLargest(testArray),"The second largest element in array is: ");
        print(ArraysUtils.modulus(testArray), "The modulus of first and last element at int array is");


    }

    public static void print(int number, String text) {
        System.out.println(text + number);
    }

    public static void print(int[] array, String text) {
        System.out.println(text + Arrays.toString(array));
    }
}
