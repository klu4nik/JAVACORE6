package main.java.com.andrii.practice.module02.task021;

/**
 * Created by Klu4nik on 06/02/2017.
 */
public class OperationsWithArray {


    /**
     * Method   for  getting sum of  integer array
     *
     * @param array
     * @return
     */
    public int sum(int array[]) {
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
    public double sum(double array[]) {
        double sum = 0;
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
    public int min(int array[]) {
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
     * Method for getting min  from double array
     *
     * @param array
     * @return
     */
    public double min(double array[]) {
        double min = array[0];
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
    public int max(int array[]) {
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
     * Method for getting max  from double array
     *
     * @param array
     * @return
     */
    public double max(double array[]) {
        double max = array[0];
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
    public int maxPositive(int array[]) {
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
            return -1;
    }

    /**
     * Method for getting max  from integer array
     *
     * @param array
     * @return
     */
    public double maxPositive(double array[]) {
        double max = 0;
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        if (max >= 0) {
            return max;
        } else
            return -1;
    }

    /**
     * Method for getting multiplication from integer array
     *
     * @param array
     * @return
     */
    public int multiplication(int array[]) {
        int multi = array[0];
        int arrayLength = array.length;
        for (int i = 1; i < arrayLength; i++) {
            multi = multi * array[i];

        }
        return multi;
    }

    /**
     * Method for getting multiplication from double array
     *
     * @param array
     * @return
     */
    public double multiplication(double array[]) {
        double multi = array[0];
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
    public int[] modulus(int array[]) {
        int[] module = {0, 0};
        module[0] = Math.abs(array[0]);
        int arrayLength = array.length;
        module[1] = Math.abs(array[arrayLength - 1]);
        return module;
    }

    /**
     * Method returns modulus  of first and  last elements of  double array
     *
     * @param array
     * @return
     */
    public double[] modulus(double array[]) {
        double[] module = {0, 0};
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
    public int secondLargest(int array[]) {
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

    /**
     * Method returns second largest element from integer array
     *
     * @param array
     * @return
     */
    public double secondLargest(double array[]) {
        double max = array[0];
        int indexOfMaxElement = 0;
        int arrayLength = array.length;
        for (int i = 1; i < arrayLength; i++) {
            if (max < array[i]) {
                max = array[i];
                indexOfMaxElement = i;
            }
        }
        double secondLargestElement = indexOfMaxElement > 0 ? array[0] : array[1];
        for (int i = indexOfMaxElement > 0 ? 0 : 1; i < arrayLength; i++) {
            if (secondLargestElement < array[i] && i != indexOfMaxElement) {
                secondLargestElement = array[i];
            }
        }
        return secondLargestElement;
    }
}
