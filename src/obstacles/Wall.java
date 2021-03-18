package obstacles;

import contestants.Contestants;

public class Wall implements Obstacles {
    private final int heightWall;

    public Wall(int heightWall) {
        this.heightWall = heightWall;
    }

    @Override
    public boolean Action(Contestants contestants) {
        return contestants.Jump(heightWall);

    }
}


