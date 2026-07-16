package ru.alfabank.homework14.scanner_14_3;

import java.util.ArrayList;
import java.util.List;

public class App {
    static void main() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(AnimalType.CAT, "Murka", 2));
        animals.add(new Animal(AnimalType.DOG, "Muhtar", 7));
        animals.add(new Animal(AnimalType.COW, "Burionka", 3));
        animals.add(new Animal(AnimalType.MOUSE, "Jerry", 1));
        for (Animal animal : animals) {
            animal.feedAnimal();
        }

        ScannerUtil scannerUtil = new ScannerUtil();
        scannerUtil.scannerAnimal(animals.get(1));
    }
}
