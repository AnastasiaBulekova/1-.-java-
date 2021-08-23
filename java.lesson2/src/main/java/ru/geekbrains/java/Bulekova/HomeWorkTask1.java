package ru.geekbrains.java.Bulekova;

public class HomeWorkTask1 {
    public static void main(String[] args) {
        compareSum(4, 30);
        compareSum(2, 3);
        compareSum(0, 20);
        System.out.println(compareSum(4, 30));
        System.out.println(compareSum(2, 3));
        System.out.println(compareSum(0, 20));
    }

    public static boolean compareSum(int a, int b) {
        int sum = a + b;
        if (sum > 10 ) {
            return true;
        } else { return false; }
    }
}
