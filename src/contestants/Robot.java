package contestants;

public class Robot implements Contestants {

    private final String name;
    private final int maxLengthRun;
    private final int maxHeightJump;

    public Robot(String name, int maxLengthRun, int maxHeightJump) {
        this.name = name;
        this.maxLengthRun = maxLengthRun;
        this.maxHeightJump = maxHeightJump;
    }

    @Override
    public boolean Run(int maxLength) {
        if (maxLengthRun >= maxLength) {
            System.out.println("Робот с именем " + name + " пробежал");
        } else {
            System.out.println("Робот с именем " + name + " Не пробежал. И выбыл.");
            return false;
        }
        return true;
    }

    @Override
    public boolean Jump(int maxHeight) {
        if (maxHeightJump >= maxHeight) {
            System.out.println("Робот с именем " + name + " перепрыгнул");
        } else {
            System.out.println("Робот с именем " + name + " не перепрыгнул. И выбыл.");
            return false;
        }
        return true;
    }
}
