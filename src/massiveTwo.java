import java.util.Scanner;

public class massiveTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 10-ти значное число --> ");
        int scanner = scan.nextInt();
        System.out.print("Введите порядковый номер числа --> ");
        int scannerTwo = scan.nextInt();
        int[] mass = new int[11];
        mass[0] = 0;
        mass[1] = scanner/1000000000;
        mass[2] = scanner/100000000%10;
        mass[3] = scanner/10000000%10;
        mass[4] = scanner/1000000%10;
        mass[5] = scanner/100000%10;
        mass[6] = scanner/10000%10;
        mass[7] = scanner/1000%10;
        mass[8] = scanner/100%10;
        mass[9] = scanner/10%10;
        mass[10] = scanner%10;
        System.out.println(mass[scannerTwo]);
        }
    }
