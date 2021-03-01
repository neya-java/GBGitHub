/*1. Создать классы Собака и Кот с наследованием от класса Животное.
        2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль.
        (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
        4. * Добавить подсчет созданных котов, собак и животных.*/

public class Dog extends Animal{

    static int numberObjects;

    public Dog(String name) {
        this.name = name;
        numberObjects++;
    }

    void infoDog() {
        System.out.println("Эту псинку зовут: " + name);
    }

    @Override
    public void voice() {
        System.out.println("Собака гавкает");
    }

    public void toRun(int lengthObstacleDogRun) {
        if (lengthObstacleDogRun <= 500) {
            System.out.println("Эта псинка " + name + " на изи пробежала " + lengthObstacleDogRun + "метров");
        } else {
            System.out.println("Эта собачка " + name + " не бегает дистанции больше 500м: " );
        }
    }

    public void toSail(int lengthObstacleDogSail) {
        if (lengthObstacleDogSail <= 10) {
            System.out.println("Эта псинка " + name + " на изи проплыла " + lengthObstacleDogSail + "метров");
        } else {
            System.out.println("Эта собачка " + name + " не плавает дистанции больше 10м и утонула");
        }
    }
}
