package ru.alfabank.homework10;

import java.util.ArrayList;

public class TaskTracker {
    private ArrayList<Task> tasks;
    int totalTasks;
    int completedTasks;
    int openedTasks;

    public TaskTracker() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        totalTasks++;
        openedTasks++;
        System.out.printf("Задача %s добавлена", task.getName());
    }

    public void printAllTasks() {
        for (Task task: tasks) {
            task.printInfo();
        }
    }

    public void findTask(String name) {
        boolean isTaskFound = false;
        for (Task task: tasks) {
            if (task.getName().equalsIgnoreCase(name)) {
                isTaskFound = true;
                task.printInfo();
            }
        }
        if (!isTaskFound) {
            System.out.printf("Задача %s не найдена", name);
        }
    }

    public void completeTask(String name) {
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
