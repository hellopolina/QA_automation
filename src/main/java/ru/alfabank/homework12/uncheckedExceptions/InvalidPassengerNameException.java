package ru.alfabank.homework12.uncheckedExceptions;

public class InvalidPassengerNameException extends RuntimeException {
    public InvalidPassengerNameException() {
        super("имя пассажира null или пустое");
    }
}
