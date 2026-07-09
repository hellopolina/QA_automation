package ru.alfabank.homework13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SquadManager {
    public void demonstrateListCreations() {
        ArrayList<Alien> aliensArrayList = new ArrayList<>();
        aliensArrayList.add(new Alien("Tom"));
        aliensArrayList.add(new Alien("Som"));
        aliensArrayList.add(new Alien("Oom"));
        aliensArrayList.add(new Alien("Oomnomnom"));

        List<Alien> aliensArrays = Arrays.asList(
                new Alien("Ray"),
                new Alien("Pay"),
                new Alien("Coolray")
        );

        List<Alien> aliensList = List.of(
                new Alien("Vilgelm"),
                new Alien("Benedikt")
        );

        try {
            aliensArrayList.add(new Alien("Incognito"));
            System.out.println("Штурмовик успешно добавлен в aliensArrayList");
        } catch (RuntimeException e) {
            System.out.println("При добавления штурмовика в aliensArrayList возникла ошибка");
            System.out.println(e.getMessage());
        }

        try {
            aliensArrayList.remove(4);
            System.out.println("Штурмовик успешно удалён из aliensArrayList");
        } catch (RuntimeException e) {
            System.out.println("При удалении штурмовика из aliensArrayList возникла ошибка");
            System.out.println(e.getMessage());
        }

        try {
            aliensArrays.add(new Alien("Geely"));
            System.out.println("Штурмовик успешно добавлен в aliensArrays");
        } catch (RuntimeException e) {
            System.out.println("При добавления штурмовика в aliensArrays возникла ошибка");
            System.out.println(e.getClass().getSimpleName());
        }

        try {
            aliensArrays.remove(3);
            System.out.println("Штурмовик успешно удалён из aliensArrays");
        } catch (RuntimeException e) {
            System.out.println("При удалении штурмовика из aliensArrays возникла ошибка");
            System.out.println(e.getClass().getSimpleName());
        }

        try {
            aliensList.add(new Alien("Karl"));
            System.out.println("Штурмовик успешно добавлен в aliensList");
        } catch (RuntimeException e) {
            System.out.println("При добавления штурмовика в aliensList возникла ошибка");
            System.out.println(e.getClass().getSimpleName());
        }

        try {
            aliensArrays.remove(2);
            System.out.println("Штурмовик успешно удалён из aliensList");
        } catch (RuntimeException e) {
            System.out.println("При удалении штурмовика из aliensList возникла ошибка");
            System.out.println(e.getClass().getSimpleName());
        }
    }

    public void filterOutCowards(List<String> squad) {
        System.out.println("Отряд до фильтрации:");
        for(String name: squad) {
            System.out.println("-" + name);
        }

        Iterator<String> iterator = squad.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().contains("Трус")) {
                iterator.remove();
            }
        }

//        squad.removeIf(x -> x.contains("Трус"));

        System.out.println("Отряд после фильтрации:");
        for(String name: squad) {
            System.out.println("-" + name);
        }

    }
}
