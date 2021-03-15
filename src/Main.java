public class Main {
    public static void main(String[] args) {

        IRunAndJump[] arrayParticipants = {
                new Human("Сергей", 600, 6),
                new Cat("Вася", 100, 3),
                new Robot("Железяка", 250, 1)

        };

        IObstacles[] arrayObstacles = {
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

        for (IRunAndJump participants : arrayParticipants) {
            int i = 1;
            System.out.println(" ");
            for (IObstacles obstacles : arrayObstacles) {
                /*obstacles.goOrJump(participants);*/
                System.out.print("Препятствие №" + i + ": ");
                if (!obstacles.goOrJump(participants)) {
                    break;
                }
                i++;
            }
        }
    }
}




