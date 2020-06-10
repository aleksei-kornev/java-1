package ru.geekbrains.lesson1;

public class Animal {
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Animal: " + name);
    }
}
