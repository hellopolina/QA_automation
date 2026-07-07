package ru.alfabank.homework12.checkedExceptions;

public class FlightNotFoundException extends AirportServiceException {

    public FlightNotFoundException() {
        super("Указанного рейса нет в списке доступных рейсов. Пожалуйста, проверьте корректноость указанного номера.");
    }
}
