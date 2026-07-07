package ru.alfabank.homework12;

public class BaggageTicket {
    private String passengerName;
    private String flightNumber;
    private int baggageWeight;

    public BaggageTicket(String flightNumber, String passengerName, int baggageWeight) {
        this.flightNumber = flightNumber;
        this.passengerName = passengerName;
        this.baggageWeight = baggageWeight;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public int getBaggageWeight() {
        return baggageWeight;
    }

    @Override
    public String toString() {
        return "BaggageTicket{" +
                "passengerName='" + passengerName + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", baggageWeight=" + baggageWeight +
                '}';
    }
}
