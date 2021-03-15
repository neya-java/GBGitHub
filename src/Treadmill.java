public class Treadmill implements IObstacles {
    private final int lengthTreadmill;

    Treadmill(int length) {
        this.lengthTreadmill = length;
    }

    public boolean goOrJump(IRunAndJump participants) {
        boolean b = false;
        if (lengthTreadmill <= participants.getLengthGoMax()) {
            System.out.println("Участник " + participants.getName() + "  пробежал дистанцию");
            b = true;
        } else {
            System.out.println("Участник " + participants.getName() + "  не пробежал дистанцию");
            System.out.println("Выбыл из соревнований!");
        }
        return b;
    }
}



