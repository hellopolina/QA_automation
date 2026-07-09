package ru.alfabank.homework13;

import java.util.ArrayList;

public class Main {

    static void main() {

//        Часть 1: База данных пришельцев

        ArrayList<Alien> aliens = new ArrayList<>();
        aliens.add(new Alien("Боб", "Земля", 1));
        aliens.add(new Alien("Боб", "Земля", 2));
        aliens.add(new Alien("Славик", "Земля", 3));
        aliens.add(new Alien("Игорь", "Planet-1", 4));
        aliens.add(new Alien("Захар", "Planet-2", 5));

        boolean hasDuplicates = false;
        for(Alien alien: aliens) {
            int index = aliens.indexOf(alien);
            for(int i = index + 1; i < aliens.size(); i++) {
                if (alien.equals(aliens.get(i))) {
                    hasDuplicates = true;
                    break;
                }
            }
        }

        System.out.println("В списке есть дубликаты? " + hasDuplicates);

//        Часть 2: Формирование отрядов

        SquadManager squadManager = new SquadManager();
        squadManager.demonstrateListCreations();

//        Часть 3: Отсеивание трусов

        ArrayList<String> squad = new ArrayList<>();
        squad.add("Миша");
        squad.add("Лёша");
        squad.add("Саша");
        squad.add("Трус Ибрагим");
        squad.add("Трус Альфред");

        squadManager.filterOutCowards(squad);

//        Часть 4: Очередь на вход

        AssaultQueue assaultQueue = new AssaultQueue();
        assaultQueue.addRecruit("Джон");
        assaultQueue.addRecruit("Тим");
        assaultQueue.addRecruit("Ким");
        assaultQueue.addRecruit("Фин");
        assaultQueue.addRecruit("Лин");
        assaultQueue.retreatCoward();
        assaultQueue.retreatCoward();
        assaultQueue.addRecruit("Карл");
        assaultQueue.addRecruit("Фред");
        assaultQueue.addRecruit("Алан");
        assaultQueue.printQueue();

//        Часть 5: Отчёт командованию

        MissionReport report1 = new MissionReport("Штурм Зоны 51", 3, 15);
        System.out.println(report1);
        MissionReport report2 = new MissionReport("Штурм Зоны 51", 3, 15);
        System.out.println("Отчёты одинаковые (через ==) ? " + (report1 == report2));
        System.out.println("Отчёты одинаковые (через equals) ? " + (report1.equals(report2)));

    }

}
