package ru.geekbrains.lesson1;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public boolean jump(int height) {
        if (height <= 2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean run(int length) {
        if (length <= 200) {
            return true;
        } else {
            return false;
        }
    }

    public boolean swim(int lenght) {
        return false;
    }

}
