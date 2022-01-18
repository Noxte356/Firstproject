package TaxiState;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите скорость транспорта --> ");
        int chooseTopSpeed = scanner.nextInt();
        System.out.println();
        PassengerСar ecoTaxi = new PassengerСar(60, "Volvo", 10, 331, 4, "Эконом");
        PassengerСar comfortTaxi = new PassengerСar(75, "KIA", 8, 225, 4, "Комфорт");
        PassengerСar ultimaTaxi = new PassengerСar(100, "LEXUS", 9, 112, 6, "Ультима");
        PassengerBus privateBus = new PassengerBus(80, "MAN", 37, 556, 59, "Частный");
        PassengerBus touristBus = new PassengerBus(80, "MAN", 37, 533, 59, "Туристический");
        Truck smallTruck = new Truck(60, "KAMAZ", 40, 343, 35);
        Truck bigTruck = new Truck(60, "KAMAZ", 45, 353, 70);
        TaxiCar[] taxicars = new TaxiCar[]{ecoTaxi, comfortTaxi, ultimaTaxi, privateBus, touristBus, smallTruck, bigTruck};
        TaxiStation taxiStation = new TaxiStation(taxicars);
        taxiStation.printTopSpeed(chooseTopSpeed);
        System.out.println();
        taxiStation.printAllByConsumptionFuel();
        taxiStation.changeOilForAllCars();



    }
}
