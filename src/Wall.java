public class Wall implements IObstacles {
    private final int tallWall;

    Wall(int tallWall) {
        this.tallWall = tallWall;
    }

    public boolean goOrJump(IRunAndJump participants) {
        boolean b = false;
        if (tallWall <= participants.getLengthJump()) {
            System.out.println("Участник " + participants.getName() + "  перепрыгнул стену");
            b = true;
        } else {
            System.out.println("Участник " + participants.getName() + "  не перепрыгнул стену");
            System.out.println("Выбыл из соревнований!");

        }
        return b;
    }

}
