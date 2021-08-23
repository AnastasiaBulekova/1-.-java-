package ru.geekbrains.java.Bulekova;

public class HomeWorkTask5 {
    public static void main(String[] args) {
        leapYear(2000);
        leapYear(130);
        leapYear(100);
        leapYear(4);
    }

    public static void leapYear(int y) {
        if (y % 4 == 0&&y % 400 == 0) {
            System.out.print("Год високосный. ");
        }        else {
            System.out.print("Год не високосный. ");
        }
    }
}
