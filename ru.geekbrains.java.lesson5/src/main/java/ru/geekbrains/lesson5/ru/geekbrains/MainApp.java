package ru.geekbrains.lesson5.ru.geekbrains;

public class MainApp {
    public static void main(String[] args) {
        Sotrudnik sotrudnik = new Sotrudnik("Иванов Иван Иванович", "инженер",
                "iivanov@mail.ru",111111, 45000,45);


        Sotrudnik sotrudnik1 = new Sotrudnik("Петров Иван Иванович", "водитель","ipetrov@mail.ru",
                222222, 25000, 32);

        Sotrudnik sotrudnik2 = new Sotrudnik("Сид Иван Иванович", "кладовщик","isid@mail.ru",
                333333,25000, 48);

        Sotrudnik sotrudnik3 = new Sotrudnik("Медведев Иван Иванович", "экспедитор","imedved@mail.ru",
                44444,30000, 31);

        Sotrudnik sotrudnik4 = new Sotrudnik("Шойгу Иван Иванович", "директор","direktor@mail.ru",
                555555,100000, 63);

        sotrudnik.info();
        sotrudnik1.info();
        sotrudnik2.info();
        sotrudnik3.info();
        sotrudnik4.info();

    }
}
