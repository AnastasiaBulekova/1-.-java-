package Array5Older40;

import ru.geekbrains.lesson5.ru.geekbrains.Sotrudnik;

public class SotrudnikOlder40 {
    private String fullName;
    private String position;
    private String email;
    private int phNumber;
    private int salary;
    private int age;


    public SotrudnikOlder40(String fullName, String position, String email, int phNumber, int salary, int age) {
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

    public void older40() {
        if (age>=40)
            {
                System.out.print("Сотрудник " + fullName + ", " + position + ", "
                        + email + ", " + salary + ", " + "возраст: " + age);
                System.out.println();
            }
        }
    }


