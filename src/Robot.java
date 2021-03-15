public class Robot implements IRunAndJump {
    private String name;
    private int lengthGo;
    private int heigthJump;

    Robot(String name, int lengthGo, int heigthJump){
        this.name = name;
        this.lengthGo = lengthGo;
        this.heigthJump = heigthJump;
    }

    public boolean go(Treadmill arrayObstacles) {
        boolean b = false;
        if (lengthGo > arrayObstacles.getLength()) {
            System.out.println("Робот " + name + "  пробежал дистанцию");
            b = true;
        } else {
            System.out.println("Робот  " + name + "  не пробежал дистанцию");
        }
        return b;
    }

    public boolean jump(Wall arrayObsractle) {
        boolean b = false;
        if (heigthJump > arrayObsractle.getHeigth()){
            System.out.println("Робот  " + name + " перепрыгнул стену");
            b = true;
        } else {
            System.out.println("Робот  " + name + "  не перепрыгнул стену");
        }
        return b;
    }
}
