package ru.alfabank.homework10;

import java.util.ArrayList;

public class Main {

    static void main() {
        TaskTracker tracker = new TaskTracker();

        tracker.addTask(new Task("Аналитика: BP11 со страховкой"));
        tracker.addTask(new Task("Разработка: BP11 со страховкой"));
        tracker.addTask(new Task("Тестирование: BP11 со страховкой"));
        tracker.addTask(new Task("Поставка: BP11 со страховкой"));

        tracker.findTask("Тестирование: BP11 со страховкой");

        tracker.completeTask("Тестирование: BP11 со страховкой");

        tracker.printAllTasks();

        tracker.printTaskStatistics();


    }

}