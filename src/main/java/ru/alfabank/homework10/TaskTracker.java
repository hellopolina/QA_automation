package ru.alfabank.homework10;

import java.util.ArrayList;

public class TaskTracker {
    ArrayList<Task> tasks = new ArrayList<>();
    int totalTasks;
    int completedTasks;
    int openedTasks;


    public void addTaskInList(Task task) {
        tasks.add(task);
        totalTasks++;
        openedTasks++;
        System.out.printf("Задача %s добавлена", task.getName());
    }

    public void printAllTasks() {
        for (Task task: tasks) {
            System.out.println(task);
        }
    }

    public void findTaskByName(String name) {
        boolean isTaskFound = false;
        for (Task task: tasks) {
            if (task.getName().equalsIgnoreCase(name)) {
                isTaskFound = true;
                System.out.println(task.showInfo());
            }
        }
        if (!isTaskFound) {
            System.out.printf("Задача %s не найдена", name);
        }
    }

    public void completeTaskByName(String name) {
        for (Task task: tasks) {
            if (task.getName().equalsIgnoreCase(name)) {
                task.resolveTask();
                completedTasks++;
                openedTasks--;
            }
        }
    }

    public void printTaskStatistics() {
        System.out.printf("Всего задач: %d \n Выполнено: %d \n Открыто: %d \n", totalTasks, completedTasks, openedTasks);
    }
}
