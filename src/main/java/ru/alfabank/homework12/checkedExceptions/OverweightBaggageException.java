package ru.alfabank.homework12.checkedExceptions;

public class OverweightBaggageException extends Exception {
    public OverweightBaggageException() {
        super("Багаж слишком тяжелый. Необходимо внести доплату за перевес.");
    }
}
