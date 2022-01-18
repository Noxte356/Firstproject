import java.util.Scanner;

public class CountTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1) Вычитание из времени количества секунд;");
        System.out.println("2) Подсчёт числа секунд между двумя моментами времени, лежащими в пределах одних суток.");
        System.out.print("Выберите программу --> ");
        int chooseProgram = scan.nextInt();
        if (chooseProgram==1) {
            firstProgram();
        } else if (chooseProgram==2) {
            secondProgram();
        }




    }

    private static void secondProgram() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во часов, минут, секунд.");
        System.out.print("Введите кол-во часов --> ");
        int hour = scan.nextInt();
        System.out.print("Введите кол-во минут --> ");
        int minute = scan.nextInt();
        System.out.print("Введите кол-во секунд --> ");
        int seconds = scan.nextInt();
        System.out.println("Введите кол-во часов, минут, секунд.");
        System.out.print("Введите кол-во часов --> ");
        int hour2 = scan.nextInt();
        System.out.print("Введите кол-во минут --> ");
        int minute2 = scan.nextInt();
        System.out.print("Введите кол-во секунд --> ");
        int seconds2 = scan.nextInt();
        int timeBySeconds = timeToSecond(hour,minute,seconds);
        int timeBySeconds2 = timeToSecond(hour2,minute2,seconds2);
        if (timeBySeconds>timeBySeconds2) {
            int countSeconds = timeBySeconds-timeBySeconds2;
            System.out.println("Промежуток времени равен " + countSeconds + " " + "секунд");
        } else if (timeBySeconds2>timeBySeconds) {
            int countSeconds = timeBySeconds2-timeBySeconds;
            System.out.println("Промежуток времени равен " + countSeconds + " " + "секунд");
        } else if (timeBySeconds==timeBySeconds2) {
            System.out.println("Вы ввели одинаковые значения времени");
        }

    }

    public static void firstProgram() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите кол-во часов --> ");
        int hour = scan.nextInt();
        System.out.print("Введите кол-во минут --> ");
        int minute = scan.nextInt();
        System.out.print("Введите кол-во секунд --> ");
        int seconds = scan.nextInt();
        System.out.print("Укажите кол-во секунд которые хотите вычесть --> ");
        int minusSeconds = scan.nextInt();
        int timeBySeconds =  timeToSecond(hour,minute,seconds);
        int countSeconds = timeBySeconds-minusSeconds;
        showSecondsByTime(countSeconds);

    }
    public static int timeToSecond(int hour, int minute, int second){
        return (hour * 60 * 60) + (minute * 60) + second;
    }
    public static void showSecondsByTime(int second){
        int hours = second/3600;
        int minutes = (second-(hours *60*60))/60;
        int seconds = (second-(hours * 60 * 60) - (minutes*60));
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
