package TaxiState;

public class TaxiCar {
    int topSpeed;
    String brand;
    int fuelConsumption;
    int uniqueId;

    public TaxiCar(int topSpeed, String brand, int fuelConsumption, int uniqueId) {
        this.topSpeed = topSpeed;
        this.brand = brand;
        this.fuelConsumption = fuelConsumption;
        this.uniqueId = uniqueId;
    }
    public void changeOil(){
        System.out.println("Взял и поменял");
    }
}
