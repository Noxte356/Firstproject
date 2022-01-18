
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class massiveThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива --> ");
        int scan = scanner.nextInt();
        int[] mass = new int[scan];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 50);
            System.out.println(mass[i]);
        }
        System.out.println("По возрастанию");
        sort(mass);
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
    }
    public static void sort(int[] mass) {
        for (int i = mass.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j] < mass[j+1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j+1];
                    mass[j+1] = tmp;
                }
            }
        }
    }
}
