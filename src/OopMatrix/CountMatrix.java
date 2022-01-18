package OopMatrix;

import java.util.Scanner;

public class CountMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MatrixCalculator matrixCalculator = new MatrixCalculator();
        System.out.print("Введите размер матрицы--> ");
        int n = scan.nextInt();
        int m = scan.nextInt();
        RandomMatrix matrix1 = new RandomMatrix(n,m);
        RandomMatrix matrix2 = new RandomMatrix(n,m);
        matrix1.print();
        System.out.println();
        matrix2.print();
        System.out.println();
        Matrix sumMatrix = matrixCalculator.sum(matrix1,matrix2);
        sumMatrix.print();


    }
}
