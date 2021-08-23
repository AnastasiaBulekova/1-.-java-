package ru.geekbrains.lesson5.ru.geekbrains;

public class Sotrudnik {
    private String fullName;
    private String position;
    private String email;
    private int phNumber;
    private int salary;
    private int age;



    public Sotrudnik(String fullName, String position, String email, int phNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phNumber = phNumber;
        this.salary =salary;
        this.age = age;
    }


    public void info() {
        System.out.println("Сотрудник " + fullName + ", " + position + ", " + email + ", " + salary + ", " + "возраст: " +age);
    }

