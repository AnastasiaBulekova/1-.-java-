package Array5Older40;

import Array5Older40.SotrudnikOlder40;
import ru.geekbrains.lesson5.ru.geekbrains.Sotrudnik;

public class MainAppArray {


    public static void main(String[] args) {
        SotrudnikOlder40[] sotrArray = new SotrudnikOlder40[5];


        sotrArray[0] = new SotrudnikOlder40("Иванов Иван Иванович", "инженер",
                "iivanov@mail.ru", 111111, 45000, 45);

        sotrArray[1]  = new SotrudnikOlder40("Петров Иван Иванович", "водитель", "ipetrov@mail.ru",
                222222, 25000, 32);

        sotrArray[2] = new SotrudnikOlder40("Сид Иван Иванович", "кладовщик", "isid@mail.ru",
                333333, 25000, 48);

        sotrArray[3] = new SotrudnikOlder40("Медведев Иван Иванович", "экспедитор", "imedved@mail.ru",
                44444, 30000, 31);

        sotrArray[4] = new SotrudnikOlder40("Шойгу Иван Иванович", "директор", "direktor@mail.ru",
                555555, 100000, 63);
for (int i =0; i< sotrArray.length; i++){

       sotrArray[i].older40();}


    }
}

