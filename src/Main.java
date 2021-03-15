public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Сергей", 500, 2);
        Cat cat1 = new Cat("Вася", 100, 3);
        Robot robot1 = new Robot("Железяка", 250, 1);

        Treadmill treadmill1 = new Treadmill(100);
        Treadmill treadmill2 = new Treadmill(200);
        Treadmill treadmill3 = new Treadmill(300);
        Treadmill treadmill4 = new Treadmill(400);
        Treadmill treadmill5 = new Treadmill(500);
        Wall wall1 = new Wall(1);
        Wall wall2 = new Wall(2);
        Wall wall3 = new Wall(3);
        Wall wall4 = new Wall(4);
        Wall wall5 = new Wall(5);

        IRunAndJump [] arrayParticipants = {human1, cat1, robot1};
        IObstacles [] arrayObstacles= {treadmill1, wall1, treadmill2, wall2, treadmill3, wall3, treadmill4, wall4, treadmill5, wall5};

       for (IRunAndJump elementArrayParticipants : arrayParticipants) {
            System.out.println(" ");
            for (IObstacles element_array_obstacles : arrayObstacles) {
                if (element_array_obstacles instanceof Treadmill) {
                    if (!elementArrayParticipants.go((Treadmill) element_array_obstacles)) {
                        break;
                    }
                } else {
                    if (!elementArrayParticipants.jump((Wall) element_array_obstacles)) {
                        break;
                    }
                }

            }
        }

    }
}


