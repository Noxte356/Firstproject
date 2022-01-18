package Pizza;

import java.util.Scanner;

public class PizzaCheque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriceList priceList = new PriceList();
        Waiter waiter = new Waiter(priceList);
        Check check;
        System.out.print("Какую пиццу хотите заказать? --> ");
        String namePizza = scanner.nextLine();
        System.out.print("Укажите кол-во которое хотите заказать --> ");
        int quantityPizza = scanner.nextInt();
        check = waiter.makeCheque(namePizza,quantityPizza);
        check.print();



    }
}
