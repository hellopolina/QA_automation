package ru.alfabank.homework11;

public class CoffeeMachine {

    public void makeCoffee(int waterVolume) {
        if (waterVolume < 200) {
            throw new NotEnoughWaterException("Not enough coffee in coffee machine");
        }
        else System.out.println("Coffee is ready!");
    }

    public void calculateCups(int waterVolume, int cupSize) {
        if (cupSize <= 0) {
            throw new ArithmeticException("Not right size of cup");
        }
        else {
            int result = waterVolume/cupSize;
            System.out.printf("You can get %d cups", result);
        }
    }

    public void printCoffeeName(String coffeeName) {
        if (coffeeName == null) {
            throw new NullPointerException("coffeeName can not be null");
        }
        else System.out.println(coffeeName.toUpperCase());
    }
}
