package ru.stepup;


import java.util.Arrays;
import java.util.SortedMap;

public class App {
    public static void main(String[] args) {

        int[] arr = {1, 2, -7, 4, 2, 5};
        maxAbs(arr);
         System.out.println(maxAbs(arr));

    }

    public static int maxAbs(int[] arr) {

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && ( max ==0 || arr[i] > max)) {
                max = arr[i];
            }
        }
        return max;
    }
}
