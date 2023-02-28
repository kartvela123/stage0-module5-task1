package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String [] seasons = {"winter", "spring", "summer", "autumn"};
        return seasons;

    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int [] arr = new int[length];
        for (int num = 0; num < length; num ++) {
            arr[num] = num + 1;
        }
        return arr;

    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int num = 0; num < arr.length; num ++) {
            sum += arr[num];
        }
    return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int indx = -1;
        for (int num = 0; num <= arr.length - 1; num++) {
            if (arr[num] == number) {
                indx = num;
                break;
            }
        }
        return indx;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String [] a = new String[arr.length];
        for (int num = 0; num <= arr.length - 1; num ++) {
            a[arr.length - 1 - num] = arr[num] ;
        }
    return a;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int [] a = new int[arr.length];
        for(int num = 0; num < arr.length; num ++) {
            if (arr[num] >= 0) {
                a[num] = arr[num];
            }
        }
        return  a;


    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        int max = arr[0].length > arr[1].length ? arr[0].length : arr[1].length;
        int min = arr[0].length > arr[1].length ? arr[1].length : arr[0].length;
        int start = arr[0].length > arr[1].length ? 1 : 0;
        int sec = arr[0].length > arr[1].length? 0:1;

        int [][] res = new int[2][];
        res[0] = new int[max];
        res[1] = new int[min];

        for (int num = 0; num <= min - 1; num++) {
            res[1][num] = arr[start][num];
            for (int nu = min - 1; nu >= 0; nu-- ) {
                if (arr[start][num] < res[1][nu]) {
                    res[1][num] = res[1][nu];
                    res[1][nu] = arr[start][num];
                }
            }
        }
        for (int num = 0; num <= max - 1; num++) {
            res[0][num] = arr[sec][num];
            for (int nu = max - 1; nu >= 0; nu-- ) {
                if (arr[sec][num] < res[0][nu]) {
                    res[0][num] = res[0][nu];
                    res[0][nu] = arr[sec][num];
                }
            }
        }
    return res;
    }
}




