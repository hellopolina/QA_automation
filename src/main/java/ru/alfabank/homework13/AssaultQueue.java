package ru.alfabank.homework13;

import java.util.LinkedList;

public class AssaultQueue {
    private LinkedList<String> queue;

    public AssaultQueue() {
        this.queue = new LinkedList<>();
    }

    public void addRecruit(String name) {
        queue.add(name);
    }

    public String retreatCoward() {
        String first = queue.getFirst();
        queue.removeFirst();
        System.out.printf("Штурмовик %s вышел из очереди \n", first);
        return first;
    }

    public void printQueue() {
        System.out.println("Текущее состояние очереди:");
        for (String name : queue) {
            System.out.println("- " + name);
        }
    }

    @Override
    public String toString() {
        return "AssaultQueue{" +
                "queue=" + queue +
                '}';
    }
}
