import java.util.Scanner;

public class massiveTest {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 20);
        }
        System.out.println("Не четные числа");
        for (int i = 0; i < mass.length; i++) {
            if (mass[i]%2==1) {
                System.out.println(mass[i]);
            }

        }
        System.out.println("Минимальное и максимальное");
        for (int i = 0; i < mass.length; i++) {
            if (mass[i]<min) {
                min = mass[i];
                System.out.println(min);
            } else if (mass[i]>max) {
                max=mass[i];
            }
        }
//        System.out.println("Мин = " + min);
//        System.out.println("Макс = " + max);
    }
}