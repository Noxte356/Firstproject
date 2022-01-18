import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n");
        int n = scanner.nextInt();
        System.out.println("Введите значения z");
        int z = scanner.nextInt();
        System.out.println("Введите значение b");
        int b = scanner.nextInt();
        System.out.println("Введите значение a");
        int a = scanner.nextInt();
        // Z^3 - B + A^2
        // int x1 = (int)(Math.pow(z+0,3) - b+0 + Math.pow(a+0,3));
        // int x2 = (int)(Math.pow(z+1,3) - (b+1) + Math.pow(a+1,3));
        // int x3 = (int)(Math.pow(z+2,3) - (b+2) + Math.pow(a+2,3));
        int sum = 0;
        for (int i = 0; i <n ; i++) {
            int x1 = (int)(Math.pow(z+i,3) - (b+i) + Math.pow(a+i,2));
            sum = sum + x1;


        }
        System.out.println(sum);


    }
}
