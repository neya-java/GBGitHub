import contestants.*;
import obstacles.*;

public class Main {
    public static void main(String[] args) {

        Contestants[] contestants = {
                new Human("Сергей", 600, 6),
                new Cat("Вася", 100, 3),
                new Robot("Железяка", 250, 1)
        };

        Obstacles[] obstacles = {
                new Treadmill(100),
                new Wall(1),
                new Treadmill(200),
                new Wall(2),
                new Treadmill(300),
                new Wall(3),
                new Treadmill(400),
                new Wall(4),
                new Treadmill(500),
                new Wall(5),
        };

        for (Contestants contestant : contestants) {
            System.out.println(" ");
            /*for(Obstacles obstacle : obstacles)*/
            for (int i = 0; i < obstacles.length; i++) {
                System.out.print("Препятствие №" + (i+1) + ": ");
                if (!obstacles[i].Action(contestant)) {
                    break;
                }
            }
        }
    }
}




