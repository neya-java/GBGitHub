package contestants;

public class Human implements Contestants {

    private final String name;
    private final int maxLengthRun;
    private final int maxHeightJump;

    public Human(String name, int maxLengthRun, int maxHeightJump) {
        this.name = name;
        this.maxLengthRun = maxLengthRun;
        this.maxHeightJump = maxHeightJump;
    }

    @Override
    public boolean Run(int maxLength) {
        if (maxLengthRun >= maxLength) {
            System.out.println("Человек с именем " + name + " пробежал");
        } else {
            System.out.println("Человек с именем  " + name + " не пробежал. И выбыл.");
            return false;
        }
        return true;
    }

    @Override
    public boolean Jump(int maxHeight) {
        if (maxHeightJump >= maxHeight) {
            System.out.println("Человек с именем " + name + " перепрыгнул");
        } else {
            System.out.println("Человек с именем " + name + " не перепрыгнул. И выбыл.");
            return false;
        }
        return true;
    }
}
