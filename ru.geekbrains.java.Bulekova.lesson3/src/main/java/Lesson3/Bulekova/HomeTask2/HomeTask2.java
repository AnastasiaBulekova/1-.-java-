package Lesson3.Bulekova.HomeTask2;

import java.util.Arrays;

public class HomeTask2 {
    public static void main(String[] args) {
       fillArr();
    }

    public static void fillArr() {
      int [] arr = new int[100];
      for (int i = 0; i < arr.length; i++)
          arr[i]=i+1;


          System.out.println(Arrays.toString(arr));


    }
}
