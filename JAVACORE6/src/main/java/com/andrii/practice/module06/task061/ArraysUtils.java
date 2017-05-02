package main.java.com.andrii.practice.module06.task061;

import java.util.ArrayList;

/**
 * Created by Klu4nik on 25/04/2017.
 */
public final class ArraysUtils {
    /**
     * Method   for  getting sum of  integer array
     *
     * @param array
     * @return
     */
    public static final int sum(int array[]) {
        int sum = 0;
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            sum = sum + array[i];
        }

        return sum;
    }


    /**
     * Method for getting  min from integer array
     *
     * @param array
     * @return
     */
    public static final int min(int array[]) {
        int min = array[0];
        int arrayLength = array.length;
        for (int i = 1; i < arrayLength; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    /**
     * Method for getting max  from integer array
     *
     * @param array
     * @return
     */
    public static final int max(int array[]) {
        int max = array[0];
        int arrayLength = array.length;
        for (int i = 1; i < arrayLength; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    /**
     * Method for getting max  from integer array
     *
     * @param array
     * @return
     */
    public static final int maxPositive(int array[]) {
        int max = 0;
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        if (max >= 0) {
            return max;
        } else
            System.out.println("There are no  positive elements  in array");
        return -1;
    }


    /**
     * Method for getting multiplication from integer array
     *
     * @param array
     * @return
     */
    public static final int multiplication(int array[]) {
        int multi = array[0];
        int arrayLength = array.length;
        for (int i = 1; i < arrayLength; i++) {
            multi = multi * array[i];

        }

        return multi;
    }


    /**
     * Method returns modulus  of first and  last elements of  integer array
     *
     * @param array
     * @return
     */
    public static final int[] modulus(int array[]) {
        int[] module = {0, 0};
        module[0] = Math.abs(array[0]);
        int arrayLength = array.length;
        module[1] = Math.abs(array[arrayLength - 1]);

        return module;
    }


    /**
     * Method returns second largest element from integer array
     *
     * @param array
     * @return
     */
    public static final int secondLargest(int array[]) {
        int max = array[0];
        int indexOfMaxElement = 0;
        int arrayLength = array.length;
        for (int i = 1; i < arrayLength; i++) {
            if (max < array[i]) {
                max = array[i];
                indexOfMaxElement = i;
            }
        }
        int secondLargestElement = indexOfMaxElement > 0 ? array[0] : array[1];
        for (int i = indexOfMaxElement > 0 ? 0 : 1; i < arrayLength; i++) {
            if (secondLargestElement < array[i] && i != indexOfMaxElement) {
                secondLargestElement = array[i];
            }
        }

        return secondLargestElement;
    }

    public static final int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - i - 1];
        }

        return reversedArray;
    }

    public static final int[] findEvenElements(int[] array) {
        ArrayList<Integer> evenElementsList = new ArrayList<Integer>();
        int evenElementsCounter = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                evenElementsList.add(element);
            }
        }
        int[] evenElementArray = new int[evenElementsList.size()];
        for (int i = 0; i < evenElementsList.size(); i++) {
            evenElementArray[i] = evenElementsList.get(i);

        }

        return evenElementArray;
    }

}
