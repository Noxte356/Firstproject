import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a==b || b==c || a==c)
        {
            a = a+5;
            b = b+5;
            c = c+5;
            System.out.println(a + " " + b + " " + c);
        }
        else
            System.out.println("Равных нет");


    }
}
