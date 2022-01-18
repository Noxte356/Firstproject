package Pizza;

public class Waiter {
    PriceList priceList;

    public Waiter(PriceList priceList) {
        this.priceList = priceList;
    }

    public Check makeCheque(String pizzaname, int quantityPizza) {
        int price = priceList.getPriceForPizza(pizzaname);
        int sum = price * quantityPizza;
        Check check = new Check(pizzaname,quantityPizza,sum);
        return check;
    }

}
