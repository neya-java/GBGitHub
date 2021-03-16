package obstacles;

import contestants.Contestants;

public class Treadmill implements Obstacles {
    private final int lengthTreadmill;

    public Treadmill(int lengthTreadmill) {
        this.lengthTreadmill = lengthTreadmill;
    }

    @Override
    public boolean Action(Contestants contestants) {
        return contestants.Run(lengthTreadmill);

    }
}



