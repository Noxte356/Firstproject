import java.util.Scanner;

public class ProgramRamka {
    public static void main(String[] args) {
        String fullName = getFullName();
        int nameLength = fullName.length();
        String laba = "*" + " " + "Лабараторная работа N1";
        int labaLength = laba.length();
        int spaceCount = nameLength - labaLength;
        int spaceCountTwo = labaLength - nameLength;
        String horizontalBorder = "";
        laba = addSpaces(laba,spaceCount);
        laba = laba + "*";

        fullName = addSpaces(fullName,spaceCountTwo);
        fullName = fullName + "*";

        int borderLength;

        if (nameLength > labaLength) {
            borderLength = nameLength;

        } else {
            borderLength = labaLength;

        }
        for (int i = 0; i <= borderLength; i++) {
            String asd = horizontalBorder + "*";
            horizontalBorder = asd;
        }


        System.out.println(horizontalBorder);
        System.out.println(laba);
        System.out.println(fullName);
        System.out.println(horizontalBorder);

        // Метод
    }

    public static String getFullName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя студента -> ");
        String name = scanner.nextLine();
        System.out.print("Введите фамилию студента -> ");
        String fname = scanner.nextLine();
        System.out.print("Введите отчество студента -> ");
        String pname = scanner.nextLine();
        String fullName = "*" + " " + fname + " " + name + " " + pname;
        return fullName;

    }

    public static String addSpaces(String source, int spaceCount) {
        for (int i = 1; i <= spaceCount; i++) {
            source = source + " ";
        }
        return source;
    }
}
