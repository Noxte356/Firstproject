import java.util.Scanner;

public class JavaFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число -> ");
        Scanner scan = new Scanner(System.in);
        int numb = scan.nextInt();
        System.out.print("В какую степень хотите возвести число? -> ");
        int step = scan.nextInt();
        int result = 1;
        for (int i = 1; i<=step ; i++) {
            result = numb*result;

        }
        System.out.println(result);
    }
}