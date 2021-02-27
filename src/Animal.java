/*1. Создать классы Собака и Кот с наследованием от класса Животное.
        2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль.
         (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
        4. * Добавить подсчет созданных котов, собак и животных.*/

public class Animal {

    static int numberObjects;
    String name;

    public  Animal() {
        numberObjects++;
    }

    public  Animal(String name) {
        this.name = name;
    }

    public void infoAnimal() {
        System.out.println(name + "- животное");
    }

    public  void voice() {
        System.out.println("Животные издают звуки");
    }

    public void toRun() {
        System.out.println("Животное " + name + " - может бежать");
    }

    public void toSail() {
        System.out.println("Животное " + name + " - может плыть");
    }
}
