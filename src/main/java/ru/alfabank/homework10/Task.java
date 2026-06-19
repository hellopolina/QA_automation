package ru.alfabank.homework10;

class Task {
    private String name;
    private String status;

    public Task(String name) {
        this.name = name;
        this.status = "Не выполнена";
    }

    public void resolveTask() {
        if (status.equalsIgnoreCase("не выполнена")) {
            status = "Выполнена";
            System.out.printf("Задача %s выполнена", name);
        }
    }

    public String getStatus() {
        System.out.printf("Статус задачи %s: %s", name, status);
        return status;
    }

    public boolean isDone() {
        if(status.equalsIgnoreCase("выполнена")) {
            System.out.printf("Задача %s: выполнена", name);
            return true;
        }
        else {
            System.out.printf("Задача %s: не выполнена", name);
            return false;
        }
    }

    public boolean printInfo() {
        if (status.equalsIgnoreCase("выполнена")) {
            System.out.printf("Задача %s: выполнена. Ты молодец!", name);
        }
        else {
            System.out.printf("Задача %s: не выполнена. Пора за работу!", name);
        }
        return false;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}