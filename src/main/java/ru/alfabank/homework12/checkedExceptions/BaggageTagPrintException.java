package ru.alfabank.homework12.checkedExceptions;

public class BaggageTagPrintException extends Exception {
    public BaggageTagPrintException() {
        super("Не получилось напечатать багажную бирку. Проверьте состояние принтера и попробуйте напечатеть бирку ещё раз.");
    }
}
