package ru.geekbrains.lesson1;

public class MainApp {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        System.out.println("Can cat " + cat.name + " jump for 1 m? " + cat.jump(1));
        System.out.println("Can cat " + cat.name + " run for 100 m? " + cat.run(100));
        System.out.println("Can cat " + cat.name + " swim for 100 m? " + cat.swim(10));

        System.out.println();

        Dog dog = new Dog("Bobik");
        System.out.println("Can dog " + dog.name + " jump for 1 m? " + dog.jump(1));
        System.out.println("Can dog " + dog.name + " run for 100 m? " + dog.run(100));
        System.out.println("Can dog " + dog.name + " swim for 100 m? " + dog.swim(10));
    }

}

