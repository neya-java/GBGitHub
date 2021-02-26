/*1. Создать классы Собака и Кот с наследованием от класса Животное.
        2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
        Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
        4. * Добавить подсчет созданных котов, собак и животных.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int the_length_of_the_obstacle_cat_run;
        int the_length_of_the_obstacle_cat_swim;
        int the_length_of_the_obstacle_dog_run;
        int the_length_of_the_obstacle_dog_swim;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну припятствия бег кошка: ");
        the_length_of_the_obstacle_cat_run = sc.nextInt();
        System.out.println("Введите длинну припятствия плавание кошка: ");
        the_length_of_the_obstacle_cat_swim = sc.nextInt();
        System.out.println("Введите длинну припятствия бег сабакена: ");
        the_length_of_the_obstacle_dog_run = sc.nextInt();
        System.out.println("Введите длинну припятствия плавание сабакена: ");
        the_length_of_the_obstacle_dog_swim = sc.nextInt();

        Animal animal1 = new Animal("Чебурашка");
        animal1.infoAnimal();
        animal1.voice();
        animal1.run();
        animal1.swim();
        System.out.println("----------------------");

        Animal animal2 = new Animal("Гена");
        animal2.infoAnimal();
        System.out.println("----------------------");

        Cat cat1 = new Cat("Мурка");
        cat1.infoAnimal();
        cat1.infoCat();
        cat1.voice();
        cat1.run();
        cat1.swim();
        cat1.run(the_length_of_the_obstacle_cat_run);
        cat1.swim(the_length_of_the_obstacle_cat_swim);
        System.out.println("----------------------");

        Cat cat2 = new Cat("Вася");
        cat2.voice();
        cat2.run(200);

        Dog dog1 = new Dog("Мухтар");
        dog1.infoAnimal();
        dog1.infoDog();
        dog1.voice();
        dog1.run(the_length_of_the_obstacle_dog_run);
        dog1.swim(the_length_of_the_obstacle_dog_swim);
        System.out.println("----------------------");

        System.out.println("Количество созданных животных: " + Animal.number_of_animal_created);
        System.out.println("Количество созданных котов: " + Cat.number_of_cat_created);
        System.out.println("Количество созданных собак: " + Dog.number_of_dogs_created);
    }
}