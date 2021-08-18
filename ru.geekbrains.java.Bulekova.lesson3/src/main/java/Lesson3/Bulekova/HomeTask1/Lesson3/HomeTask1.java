package Lesson3.Bulekova.HomeTask1.Lesson3;

public class HomeTask1 {
    public static void main(String[] args) {
changeNum();
    }

    public static void changeNum() {
        int[] arr = {0, 0, 1, 0, 1, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] == 0)) {
                System.out.println(" 1 ");
            } else {
                System.out.println(" 0 ");
            }
        }


    }
}
