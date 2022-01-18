import java.util.Scanner;

public class Ramka2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя студента -> ");
        String name = scanner.nextLine();
        System.out.print("Введите фамилию студента -> ");
        String fname = scanner.nextLine();
        System.out.print("Введите отчество студента -> ");
        String pname = scanner.nextLine();

        System.out.println("******************************");
        System.out.println("*" + " " + fname + " " + name + " " + pname + "*");
    }
}
