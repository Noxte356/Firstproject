package Pizza;

public class Check {
    String namePizza;
    int quantityPizza;
    int sum;

    public Check(String namePizza, int quantityPizza, int sum) {
        this.namePizza = namePizza;
        this.quantityPizza = quantityPizza;
        this.sum = sum;
    }

    public void print() {
        System.out.println("Вы заказали " + namePizza + " " + "в количестве " + quantityPizza);
        System.out.println("Цена: " + sum);
    }
}
