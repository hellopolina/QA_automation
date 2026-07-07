package ru.alfabank.homework12;

import ru.alfabank.homework12.checkedExceptions.BaggageTagPrintException;
import ru.alfabank.homework12.checkedExceptions.FlightNotFoundException;
import ru.alfabank.homework12.checkedExceptions.OverweightBaggageException;
import ru.alfabank.homework12.uncheckedExceptions.InvalidBaggageWeightException;
import ru.alfabank.homework12.uncheckedExceptions.InvalidPassengerNameException;

public class BaggageDropDesk {
    private String[] flights;

    public BaggageDropDesk(String[] flights) {
        this.flights = flights;
    }

    public BaggageTicket baggageDropOff(String passengerName, String flightNumber, int baggageWeight) throws FlightNotFoundException, OverweightBaggageException, BaggageTagPrintException {

//        - Проверить имя пассажира
        if(passengerName == null || passengerName.equals("")) {
            throw new InvalidPassengerNameException();
        }

//        - Проверить вес багажа
        if(baggageWeight < 0) {
            throw new InvalidBaggageWeightException();
        } else if (baggageWeight > 23) {
            throw new OverweightBaggageException();
        }

//        - Проверить наличие рейса
        boolean flightFound = false;
        for (String flight : flights) {
            if (flightNumber.equalsIgnoreCase(flight)) {
                flightFound = true;
                break;
            }
        }

        if(!flightFound) {
            throw new FlightNotFoundException();
        }

//        - Имитировать проблему с печатью багажной бирки
        if(flightNumber.equalsIgnoreCase("AE-404")) {
            throw new BaggageTagPrintException();
        }

        return new BaggageTicket(flightNumber, passengerName, baggageWeight);
    }
}
