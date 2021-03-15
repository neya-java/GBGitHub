public class Cat implements IRunAndJump {
    private String name;
    private int lengthGo;
    private int heigthJump;

    Cat(String name, int lengthGo, int heigthJump){
        this.name = name;
        this.lengthGo = lengthGo;
        this.heigthJump = heigthJump;
    }

    public int getLengthGo() {
        return lengthGo;
    }

    public int getHeigthJump() {
        return heigthJump;
    }

    public boolean go(Treadmill arrayObstacles) {
        boolean b = false;
        if (lengthGo > arrayObstacles.getLength()) {
            System.out.println("Кот " + name + "  пробежал дистанцию");
            b = true;
        } else {
            System.out.println("Кот " + name + "  не пробежал дистанцию");

        }
        return b;
    }

    public boolean jump(Wall arrayObsractle) {
        boolean b = false;
        if (heigthJump > arrayObsractle.getHeigth()){
            System.out.println("Кот " + name + " перепрыгнул стену");
            b = true;
        } else {
            System.out.println("Кот " + name + "  не перепрыгнул стену");
        }
        return b;
    }
}
