import java.util.Scanner;
class massiveFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n --> ");
        int n = scanner.nextInt();
        System.out.print("Введите число m --> ");
        int m = scanner.nextInt();
        int[][] arrays = new int[n][m];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = (int) (Math.random() * 100);
//                System.out.print(arrays[i][j] + " ");
            }
        }
        for (int i = 0; i < arrays.length; i++) {
            System.out.println();
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + " ");
            }
        }
        int[] array = new int[n*m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[k++] = arrays[i][j];
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
//        System.out.println();
//        System.out.println(array);
    }
}