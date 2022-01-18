import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число-> ");
        int numb = scanner.nextInt();
        int a = numb/10;
        int b = numb%10;
        if (a<b){
            System.out.println(a + " " + "меньше" + " " + b);
        } else if (a>b){
            System.out.println(a + " " + "больше" + " " + b);
        } else if (a==b){
            System.out.println(a + " "+ "равен" + " " + b);
        }


    }
}
