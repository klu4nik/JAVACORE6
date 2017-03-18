package main.java.com.andrii.practice.module02.task021;

/**
 * Created by Klu4nik on 18/03/2017.
 */
public class Runner {
    public static void main(String[] args) {
        OperationsWithArray operationsWithArray = new OperationsWithArray();
        int[] arrayInt = {9, 9, 7, 3, 4, 1, -4, 7, 0, 8};
        double[] arrayDouble = {8, 3, 4, 5, 0, 1, -1, 7, -8, 9};
        System.out.println("Sum elements of integer array = " + operationsWithArray.sum(arrayInt));
        System.out.println("Min element in integer array = " + operationsWithArray.min(arrayInt));
        System.out.println("Max element in integer array = " + operationsWithArray.max(arrayInt));

        if (operationsWithArray.maxPositive(arrayInt) != -1) {
            System.out.println("The max positive element in int array = " + operationsWithArray.maxPositive(arrayInt));
        } else {
            System.out.println("There are no positive elements to show max positive element  in integer array");
        }
        System.out.println("Modulus of  first double element = " + operationsWithArray.modulus(arrayInt)[0] + " modulus of last double element  = " + operationsWithArray.modulus(arrayInt)[1]);
        System.out.println("The second  largest element  in integer array = " + operationsWithArray.secondLargest(arrayInt));

        System.out.println("Sum elements of double array = " + operationsWithArray.sum(arrayDouble));
        System.out.println("Min element in double array = " + operationsWithArray.min(arrayDouble));
        System.out.println("Max element in double array = " + operationsWithArray.max(arrayDouble));
        if (operationsWithArray.maxPositive(arrayDouble) != -1) {
            System.out.println("The max positive element in double array = " + operationsWithArray.maxPositive(arrayDouble));
        } else {
            System.out.println("There are no positive elements to show max positive element  in double array");
        }
        System.out.println("Modulus of  first double element = " + operationsWithArray.modulus(arrayDouble)[0] + " modulus of last double element  = " + operationsWithArray.modulus(arrayDouble)[1]);
        System.out.println("The second  largest element  in double array = " + operationsWithArray.secondLargest(arrayDouble));
    }
}
