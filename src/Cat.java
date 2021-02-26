/*1. Создать классы Собака и Кот с наследованием от класса Животное.
        2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль.
         (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
        4. * Добавить подсчет созданных котов, собак и животных.*/

public class Cat extends Animal {

    static int number_of_cat_created;

    public Cat(String name) {
        this.name = name;
        number_of_cat_created++;
    }

    public void infoCat() {
        System.out.println("Этого(ту) кота(кошку) зовут: " + name);
    }

    @Override
    public void voice() {
        System.out.println("Кошка мяукает");
    }

    public void run(int the_length_of_the_obstacle_cat_run) {
        if (the_length_of_the_obstacle_cat_run <= 200) {
            System.out.println("Кот(кошка) " + name + " пробежал(а) дистанцию в " + the_length_of_the_obstacle_cat_run + "м");
        } else {
            System.out.println("Кошка " + name + "не умеет бегать на дистанцию более 200м.");
        }
    }

    public void swim(int the_length_of_the_obstacle_cat_swim) {
        if (the_length_of_the_obstacle_cat_swim == 0){
            System.out.println( "Коту(кошке) " + name + " задано нулевая дистанция для плавания. Ему(ей) повезло, т.к. он(она) не умеет плавать");
        } else {
            System.out.println("Коту(кошке) задана не нулевая дистанция для плавания. " + name + " не умеет плавать и утонул(а).");
        }
    }
}
