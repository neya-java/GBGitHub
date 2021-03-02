public class Dish {
    public int volume;
    public int food;

    public Dish(int volume, int food){
        this.volume = volume;
        this.food = food;
    }

    public void infoDish() {
        System.out.println("В миске объемом: " + volume + " у.е. Находится " + food + " у.е. еды.");
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public boolean checkTheRemainingFood(int m) {
        if (food > m) {
            return true;
        }
        return false;
    }

    public void addFood(int n) {
        food += n;
    }
}
