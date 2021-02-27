/*1. Создать классы Собака и Кот с наследованием от класса Животное.
        2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
        Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
        4. * Добавить подсчет созданных котов, собак и животных.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lengthObstacleCatRun;
        int lengthObstacleCatSail;
        int lengthObstacleDogRun;
        int lengthObstacleDogSail;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну припятствия бег кошка: ");
        lengthObstacleCatRun = sc.nextInt();
        System.out.println("Введите длинну припятствия плавание кошка: ");
        lengthObstacleCatSail = sc.nextInt();
        System.out.println("Введите длинну припятствия бег сабакена: ");
        lengthObstacleDogRun = sc.nextInt();
        System.out.println("Введите длинну припятствия плавание сабакена: ");
        lengthObstacleDogSail = sc.nextInt();

        Animal animal1 = new Animal("Чебурашка");
        animal1.infoAnimal();
        animal1.voice();
        animal1.toRun();
        animal1.toSail();
        System.out.println("----------------------");

        Animal animal2 = new Animal("Гена");
        animal2.infoAnimal();
        System.out.println("----------------------");

        Cat cat1 = new Cat("Мурка");
        cat1.infoAnimal();
        cat1.infoCat();
        cat1.voice();
        cat1.toRun();
        cat1.toSail();
        cat1.toRun(lengthObstacleCatRun);
        cat1.toSail(lengthObstacleCatSail);
        System.out.println("----------------------");

        Cat cat2 = new Cat("Вася");
        cat2.voice();
        cat2.toRun(200);

        Dog dog1 = new Dog("Мухтар");
        dog1.infoAnimal();
        dog1.infoDog();
        dog1.voice();
        dog1.toRun(lengthObstacleDogRun);
        dog1.toSail(lengthObstacleDogSail);
        System.out.println("----------------------");

        System.out.println("Количество созданных животных: " + Animal.numberObjects);
        System.out.println("Количество созданных котов: " + Cat.numberObjects);
        System.out.println("Количество созданных собак: " + Dog.numberObjects);
    }
}