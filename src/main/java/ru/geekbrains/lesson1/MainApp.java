package ru.geekbrains.lesson1;

public class MainApp {

    public static void main(String[] args) {

        Cat[] cat = new Cat[5];
        for (int i = 0; i < 5; i++) {
            cat[i] = new Cat("Barsik" + i, 5);
        }

        Plate plate = new Plate(17);

        plate.info();
        for (int i = 0; i < 5; i++) {
            cat[i].eat(plate);
            plate.info();
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            cat[i].info();
        }

        System.out.println();
        System.out.println("Добавили 8 еды в тарелку. ");
        plate.addMeal(8);
        System.out.println();

        plate.info();
        for (int i = 0; i < 5; i++) {
            cat[i].eat(plate);
            plate.info();
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            cat[i].info();
        }
    }

}

