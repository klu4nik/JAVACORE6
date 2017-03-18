package main.java.com.andrii.practice.module02.task021;

/**
 * Created by Klu4nik on 06/02/2017.
 */
public class OperationsWithArray {
    public static void main(String[] args) {
        int[] arrayInt = {9, 9, 7, 3, 4, 1, -4, 7, 0, 8};
        double[] arrayDouble = {8, 3, 4, 5, 0, 1, -1, 7, -8, 9};
        System.out.println("Sum elements of integer array = " + sum(arrayInt));
        System.out.println("Min element in integer array = " + min(arrayInt));
        System.out.println("Max element in integer array = " +max(arrayInt));

        if (maxPositive(arrayInt)!=-1){
            System.out.println("The max positive element in int array = " + maxPositive(arrayInt));
        } else{
            System.out.println("There are no positive elements to show max positive element  in integer array");
        }
        System.out.println("Modulus of  first double element = " + modulus(arrayInt)[0] + " modulus of last double element  = " + modulus(arrayInt)[1]);
        System.out.println("The second  largest element  in integer array = " + secondLargest(arrayInt));

        System.out.println("Sum elements of double array = " + sum(arrayDouble));
        System.out.println("Min element in double array = " + min(arrayDouble));
        System.out.println("Max element in double array = " +max(arrayDouble));
        if (maxPositive(arrayDouble)!=-1){
            System.out.println("The max positive element in double array = " + maxPositive(arrayDouble));
        } else{
            System.out.println("There are no positive elements to show max positive element  in double array");
        }
        System.out.println("Modulus of  first double element = " + modulus(arrayDouble)[0] + " modulus of last double element  = " + modulus(arrayDouble)[1]);
        System.out.println("The second  largest element  in double array = " + secondLargest(arrayDouble));

    }

    /**
     * Method   for  getting sum of  integer array
     *
     * @param array
     * @return
     */
    private int sum(int array[]) {
        int sum = 0;
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    /**
     * Method   for  getting sum of double array
     *
     * @param array
     * @return
     */
    private double sum(double array[]) {
        double sum = 0;
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    /**
     * Method for getting  min from integer array
     * @param array
     * @return
     */
    private int min(int array[]) {
        int min=array[0];
        int arrayLength = array.length;
        for (int i=1;i<arrayLength; i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
    }

    /**
     * Method for getting min  from double array
     * @param array
     * @return
     */
    private double min(double array[]) {
        double min=array[0];
        int arrayLength = array.length;
        for (int i=1;i<arrayLength; i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
    }
    /**
     * Method for getting max  from integer array
     * @param array
     * @return
     */
    private int max(int array[]) {
        int max=array[0];
        int arrayLength = array.length;
        for (int i=1;i<arrayLength; i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
    /**
     * Method for getting max  from double array
     * @param array
     * @return
     */
    private double max(double array[]) {
        double max=array[0];
        int arrayLength = array.length;
        for (int i=1;i<arrayLength; i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
    /**
     * Method for getting max  from integer array
     * @param array
     * @return
     */
    private int maxPositive(int array[]) {
        int max=0;
        int arrayLength = array.length;
        for (int i=0;i<arrayLength; i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        if (max>=0){
        return max;
        } else
            return -1;
    }

    /**
     * Method for getting max  from integer array
     * @param array
     * @return
     */
    private double maxPositive(double array[]) {
        double max=0;
        int arrayLength = array.length;
        for (int i=0;i<arrayLength; i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        if (max>=0){
            return max;
        } else
            return -1;
    }
    /**
     * Method for getting multiplication from integer array
     * @param array
     * @return
     */
    private int multiplication(int array[]){
        int multi=array[0];
        int arrayLength = array.length;
        for (int i=1;i<arrayLength; i++){
            multi=multi*array[i];

        }
        return multi;
    }
    /**
     * Method for getting multiplication from double array
     * @param array
     * @return
     */
    private double multiplication(double array[]){
        double multi=array[0];
        int arrayLength = array.length;
        for (int i=1;i<arrayLength; i++){
            multi=multi*array[i];

        }
        return multi;
    }
    /**
     * Method returns modulus  of first and  last elements of  integer array
     * @param array
     * @return
     */
    private int[] modulus(int array[]){
        int[] module={0,0};
        module[0]= Math.abs(array[0]);
        int arrayLength = array.length;
        module[1]=Math.abs(array[arrayLength-1]);
        return module;
    }
    /**
     * Method returns modulus  of first and  last elements of  double array
     * @param array
     * @return
     */
    private double[] modulus(double array[]){
        double[] module={0,0};
        module[0]= Math.abs(array[0]);
        int arrayLength = array.length;
        module[1]=Math.abs(array[arrayLength-1]);
        return module;
    }

    /**
     * Method returns second largest element from integer array
     * @param array
     * @return
     */
    private int secondLargest(int array[]) {
        int max=array[0];
        int indexOfMaxElement=0;
        int arrayLength = array.length;
        for (int i=1;i<arrayLength; i++){
            if(max<array[i]){
                max=array[i];
                indexOfMaxElement=i;
            }
        }
        int secondLargestElement=indexOfMaxElement>0?array[0]:array[1];
        for (int i=indexOfMaxElement>0?0:1; i<arrayLength; i++){
            if(secondLargestElement<array[i]&&i!=indexOfMaxElement){
                secondLargestElement=array[i];
            }
        }
        return secondLargestElement;
    }

        /**
         * Method returns second largest element from integer array
         * @param array
         * @return
         */
    private double secondLargest(double array[]){
        double max=array[0];
        int indexOfMaxElement=0;
        int arrayLength = array.length;
        for (int i=1;i<arrayLength; i++){
            if(max<array[i]){
                max=array[i];
                indexOfMaxElement=i;
            }
        }
        double secondLargestElement=indexOfMaxElement>0?array[0]:array[1];
            for (int i=indexOfMaxElement>0?0:1; i<arrayLength; i++){
                if(secondLargestElement<array[i]&&i!=indexOfMaxElement){
                    secondLargestElement=array[i];
                }
            }
        return secondLargestElement;
    }
}
