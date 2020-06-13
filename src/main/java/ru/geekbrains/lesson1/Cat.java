package ru.geekbrains.lesson1;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }

    public void eat(Plate p) {
        if (!full) {

            if (p.decreaseFood(appetite)) {
                full = true;
                System.out.println(name + " поел.");
            } else {
                System.out.println(name + " не поел. Еды слишком мало!");
            }
        } else {
            System.out.println(name + " уже сытый, поэтому не стал есть.");
        }
    }

    public void info() {
        System.out.println(name + ": appetite: " + appetite + "; full: " + full);
    }
}
