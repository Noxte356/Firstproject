package Pizza;

public class PriceList {
    Pizza[] pizzas;
    String[] pizza;
    int[] price;

    public PriceList() {
        Pizza pizza1 = new Pizza("Грибная",550);
        this.pizzas = new Pizza[]{pizza1};
        this.price = new int[]{550, 400, 629, 729, 620};
        this.pizza = new String[]{"Грибная", "Сырная", "Европейская", "Супер Пепперони", "Пепперони"};

    }

    public int getPriceForPizza(String pizzaName) {
        for (int i = 0; i < pizza.length; i++) {
            if (pizza[i].equals(pizzaName)) {
                return price[i];
            }
        }
        return -1;
    }
}

