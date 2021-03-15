public class Animal {
    public String name;
    public int lengthGoMax;
    public int topJumpMax;

    Animal(String name, int lengthGoMax, int topJumpMax){
        this.name = name;
        this.lengthGoMax = lengthGoMax;
        this.topJumpMax = topJumpMax;
    }

    public int getLengthGoMax() {
        return lengthGoMax;
    }

    public String getName() {
        return name;
    }

    public int getLengthJump() {
        return topJumpMax;
    }
}
