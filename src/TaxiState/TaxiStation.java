package TaxiState;

import java.util.Arrays;
import java.util.Comparator;

public class TaxiStation {
    TaxiCar[] cars;

    public TaxiStation(TaxiCar[] cars) {
        this.cars = cars;
    }
    public void printAllByConsumptionFuel(){;
        Arrays.sort(cars, Comparator.comparing(taxiCar -> taxiCar.fuelConsumption));
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].brand + " " + cars[i].fuelConsumption);

        }
    }

    public void printTopSpeed(int chooseSpeed) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].topSpeed>chooseSpeed) {
                System.out.println(cars[i].brand);
            }

        }
    }
    public void changeOilForAllCars(){
        for (int i = 0; i < cars.length; i++) {
            cars[i].changeOil();
        }
    }
}
