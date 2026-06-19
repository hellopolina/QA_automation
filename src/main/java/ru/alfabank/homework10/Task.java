package ru.alfabank.homework10;

class Task {
    private String name;
    private boolean isDone;

    public Task(String name) {
        this.name = name;
        this.isDone = false;
    }

    public void resolveTask() {
        this.isDone = true;
    }

    public boolean getStatus() {
        return isDone;
    }

    public void printInfo() {
        String status = getStatus() ? " - выполнена. Ты молодец!" : " - не выполнена. Пора за работу!";
        System.out.println("Задача \"" + name + "\"" + status);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", status='" + isDone + '\'' +
                '}';
    }
}