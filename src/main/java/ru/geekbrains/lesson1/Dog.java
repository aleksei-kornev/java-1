package ru.geekbrains.lesson1;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public boolean jump(float height) {
        if (height <= 0.5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean run(int length) {
        if (length <= 500) {
            return true;
        } else {
            return false;
        }
    }

    public boolean swim(int length) {
        if (length <= 10) {
            return true;
        } else {
            return false;
        }
    }

}

