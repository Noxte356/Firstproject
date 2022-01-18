package oop;

public class MainOop {
    public static void main(String[] args) {
        Car yellowCar= new Car("yellow","BMW");
        Car redCar = new Car("red", "Ferrari");
        yellowCar.move();
        redCar.move();
    }
}
