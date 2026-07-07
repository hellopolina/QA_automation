package ru.alfabank.homework12.uncheckedExceptions;

public class InvalidBaggageWeightException extends RuntimeException {
    public InvalidBaggageWeightException() {
        super("вес багажа меньше или равен нулю");
    }
}
