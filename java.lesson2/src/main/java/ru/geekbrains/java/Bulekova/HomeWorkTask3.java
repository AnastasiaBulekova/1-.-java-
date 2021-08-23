package ru.geekbrains.java.Bulekova;

public class HomeWorkTask3 {
    public static void main(String[] args) {
        isNegative(3);
        isNegative(-2);
        isNegative(0);
        System.out.println(isNegative(3));
        System.out.println(isNegative(-2));
        System.out.println(isNegative(0));
    }

    public static boolean isNegative(int v) {
        if (v >= 0) {
            return false;

        } else {
            return true;

        }
    }
}