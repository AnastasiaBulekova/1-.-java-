package ru.geekbrains.java.Bulekova;

public class HomeWorkTask2 {

    public static void main(String[] args) {
        isPositive(3);
        isPositive(-10);
        isPositive(0);
    }

    public static void isPositive(int s) {
        if (s >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}