package TaxiState;

public class PassengerСar extends TaxiCar{
    int numberOfSeats;
    String segment;

    public PassengerСar(int topSpeed, String brand, int fuelConsumption, int uniqueId, int numberOfSeats,String segment) {
        super(topSpeed, brand, fuelConsumption, uniqueId);
        this.numberOfSeats=numberOfSeats;
        this.segment=segment;
    }
}
