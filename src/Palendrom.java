import java.util.Scanner;

public class Palendrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше число --> ");
        int integer = scanner.nextInt();
        int n1 = integer/10000;
        int n2 = integer/1000%10;
        int n3 = integer/100%10;
        int n4 = integer/10%10;
        int n5 = integer%10;
        int a = (n1-n5) * (n1-n5);
        int b = (n2-n4) * (n2-n4);
        if ((a==0) && (b==0)){
            System.out.println("Ваше число является палиндромом");
        }
        else
            System.out.println("Ваше число не является палиндромом");


    }
}
