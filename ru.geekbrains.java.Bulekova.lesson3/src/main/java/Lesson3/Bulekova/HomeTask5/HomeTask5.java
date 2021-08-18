package Lesson3.Bulekova.HomeTask5;

import java.util.Arrays;

public class HomeTask5 {
    public static void main(String[] args) {
        twoArguments(10,5);
    }

    public static void twoArguments(int len, int initialValue) {
        int [] arr = new int[len];

        for (int i = 0; i < len; i ++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }
    }

