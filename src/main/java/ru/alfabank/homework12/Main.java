package ru.alfabank.homework12;

import ru.alfabank.homework12.checkedExceptions.BaggageTagPrintException;
import ru.alfabank.homework12.checkedExceptions.FlightNotFoundException;
import ru.alfabank.homework12.checkedExceptions.OverweightBaggageException;
import ru.alfabank.homework12.uncheckedExceptions.InvalidBaggageWeightException;
import ru.alfabank.homework12.uncheckedExceptions.InvalidPassengerNameException;

public class Main {
    static void main() throws FlightNotFoundException, BaggageTagPrintException, OverweightBaggageException {
        String[] flights = {"SU-123", "TK-777", "KC-909", "AE-404"};

        BaggageDropDesk baggageDropDesk = new BaggageDropDesk(flights);

        try {
            baggageDropDesk.baggageDropOff("Pedro Pascal", flights[0], 12);
            baggageDropDesk.baggageDropOff("", flights[1], 0);
            baggageDropDesk.baggageDropOff("Ne Pedro Pascal", flights[2], 24);
            baggageDropDesk.baggageDropOff("null", flights[3], 23);
            baggageDropDesk.baggageDropOff(null, flights[0], 1);
            baggageDropDesk.baggageDropOff("Final Pedro Pascal", flights[1], -1);
        } catch (InvalidPassengerNameException e) {
            System.out.println(e.getMessage());
        } catch (OverweightBaggageException e) {
            System.out.println(e.getMessage());
        } catch (BaggageTagPrintException e) {
            System.out.println(e.getMessage());
        } catch (InvalidBaggageWeightException e) {
            System.out.println(e.getMessage());
        }
    }
}
