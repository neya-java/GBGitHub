public class Human implements IRunAndJump {
    private String name;
    private int lengthGo;
    private int heigthJump;

    Human(String name, int lengthGo, int heigthJump){
        this.name = name;
        this.lengthGo = lengthGo;
        this.heigthJump = heigthJump;
    }



    public boolean go(Treadmill arrayObsractle) {
        boolean b = false;
        if (lengthGo > arrayObsractle.getLength()){
            System.out.println("Человек " + name + "  пробежал дистанцию");
            b = true;
        } else {
            System.out.println("Человек " + name + "  не пробежал дистанцию");
        }
        return b;
    }


    public boolean jump(Wall arrayObsractle) {
        boolean b = false;
        if (heigthJump > arrayObsractle.getHeigth()){
            System.out.println("Человек " + name + " перепрыгнул стену");
            b = true;
        } else {
            System.out.println("Человек " + name + "  не перепрыгнул стену");
        }
        return b;
    }
}
