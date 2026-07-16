package ru.alfabank.homework14.scanner_14_3;

public class Animal {
    private AnimalType type;
    private String name;
    private int age;

    public Animal(AnimalType type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public Animal() {}

    public AnimalType getType() {
        return type;
    }

    void setType(AnimalType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    protected void feedAnimal() {
        switch (type) {
            case CAT -> System.out.println(type + " " + name + " eats milk");
            case DOG -> System.out.println(type + " " + name + " eats meet");
            case COW -> System.out.println(type + " " + name + " eats grass");
            case MOUSE -> System.out.println(type + " " + name + " eats cheese");
            default -> throw new RuntimeException("Unexpected value: " + type);
        }
    }

}
