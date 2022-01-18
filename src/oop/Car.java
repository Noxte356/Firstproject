package oop;

public class Car {
    String color;
    String brand;
    Car(String color,String brand){
        this.color = color;
        this.brand = brand;
    }
    public void move(){
        System.out.println("its moving i am " + color + " " + brand);
    }
}
