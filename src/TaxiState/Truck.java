package TaxiState;

public class Truck extends TaxiCar{
    double kgOfCargo;
    public Truck(int topSpeed, String brand, int fuelConsumption, int uniqueId, double kgOfCargo) {
        super(topSpeed, brand, fuelConsumption, uniqueId);
        this.kgOfCargo=kgOfCargo;
    }

    @Override
    public void changeOil() {
        System.out.println("Поменял на траке");
    }
}
