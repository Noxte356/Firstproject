package Shapes;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Какую фигуры хотите нарисовать? --> ");
        String nameShape = scanner.nextLine();
        System.out.println();
        System.out.print("Какой множитель --> ");
        int factorShape = scanner.nextInt();
        ShapeSearcher searcher = new ShapeSearcher();
        Shape foundShape = searcher.find(nameShape);
        foundShape.drawShape(factorShape);


    }
}
