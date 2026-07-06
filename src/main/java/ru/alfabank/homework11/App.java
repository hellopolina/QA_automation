package ru.alfabank.homework11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static void main() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

//        3.1. Проверить InputMismatchException
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите количество воды");
            int water = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: нужно было ввести число");
        }

//        3.2. Проверить своё исключение
        try {
            coffeeMachine.makeCoffee(100);
        } catch (NotEnoughWaterException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Проверка кофемашины завершена");
        }

//        3.3. Проверить ArithmeticException
        try {
            coffeeMachine.calculateCups(1000, 0);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: размер чашки не может быть 0");
        }

//        3.4. Проверить NullPointerException
        String name = null;
        try {
            coffeeMachine.printCoffeeName(name);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: название кофе отсутствует");
        }

    }
}
