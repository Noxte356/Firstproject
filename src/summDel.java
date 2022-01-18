import java.util.Scanner;

public class summDel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваше число -> ");
        int numb = scan.nextInt();
        int a = 0;
        int sum = 0;
        while (a<numb) {
            a++;

            if (a % 5 == 0) {
                sum = a+sum;
            }
        }
        System.out.println(sum);

    }
}
