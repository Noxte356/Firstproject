package TaxiState;

public class PassengerBus extends TaxiCar{
    int numberOfSeat;
    String typeOfTransportation;
    public PassengerBus(int topSpeed, String brand, int fuelConsumption, int uniqueId, int numberOfSeat, String typeOfTransportation) {
        super(topSpeed, brand, fuelConsumption, uniqueId);
        this.numberOfSeat=numberOfSeat;
        this.typeOfTransportation=typeOfTransportation;
    }
}
